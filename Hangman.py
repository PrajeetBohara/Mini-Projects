import random
import sys

words = ["ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
         "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
         "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
         "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
         "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon",
         "python", "rabbit", "ram", "rat", "raven", "rhino", "salmon", "seal",
         "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
         "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
         "wombat", "zebra"]

random_index = random.randint(0, len(words)-1 )
random_word = words[random_index]

def print_hangman(count):
    if count == 1:
        print("|   |\n" +
              "    |\n" +
              "    |\n" +
              "    |\n" +
              "    |\n" +
              "=========\n")
    elif count == 2:
        print("+---+\n" +
              "|   |\n" +
              "O   |\n" +
              "    |\n" +
              "    |\n" +
              "    |\n" +
              "=========\n")
    elif count == 3:
        print("+---+\n" +
              " |   |\n" +
              " O   |\n" +
              "/|   |\n" +
              "     |\n" +
              "     |\n" +
              " =========\n")

    elif count== 4:
        print("+---+\n" +
              " |   |\n" +
              " O   |\n" +
              "/|\  |\n" +
              "     |\n" +
              "     |\n" +
              " =========\n")
    elif count == 5:
        print("+---+\n" +
              " |   |\n" +
              " O   |\n" +
              "/|\  |\n" +
              "/    |\n" +
              "     |\n" +
              " =========\n")

    elif count == 6:
        print("+---+\n" +
              " |   |\n" +
              " O   |\n" +
              "/|\  |\n" +
              "/ \  |\n" +
              "     |\n" +
              " =========\n")
    else:
        print("Error in count. Please contact your developer to resolve the issue.")
dash = [""]
print("Hack: answer is "+random_word)
for i in range(0, len(random_word)-1):
    dash[i] = "_"
print("Random Word: " + dash)
misses = 0
dashes = 0
while misses < 6 and dashes <= len(dash):
   
    user_input = input("\nYour Guess: ")
    user_input = user_input.lower()
  
    if user_input in random_word:
        for i in range(0, len(random_word)):

            if random_word[i] == user_input:
               dash[i] = user_input
               dashes +=1 
            else:
               continue
    else:
        misses += 1
        print("Misses: " + str(misses))
        print_hangman(misses)
print(dash)
if misses >= 6:
        print("You lose. RIP...")
        sys.exit()
else:
    print("Congratulations, you won!!!")
