import random

def compare(person1, person2):
    if content[person1] < content[person2]:
        return person2
    else:
        return person1

content = {
    0: 1000,
    1: 5000,
    2: 5100,
    3: 6000
}
array=["Neymar","Messi","Ronaldo","Pele"]
score = 0
response = (input("Type 'y' if you want to start and type 'n' if you want to exit: ")).lower()

while response == "y":
    person1 = random.randint(0,3)
    person2 = random.randint(0,3)
    if person1 == person2:
        while person1 == person2:
            person2= random.randint(0,3)
    print(f"Compare A: {array[person1]}")
    print("VS")
    print(f"Against B: {array[person2]}")

    input1 = (input("Who has more followers? 'A' or 'B': ")).lower()
    higher_value = compare(person1, person2)
    if input1 == "a":
        if person1 == higher_value:
            score+= 1
            print(f"You are right! Current Score: {score}")
        else:
            print(f"You're wrong. Your score: {score}")

    elif input1 == "b":
        if person2 == higher_value:
            score += 1
            print(f"You are right! Current Score: {score}")
        else:
            print(f"You're wrong. Your score: {score}")
    else:
        print("Please enter a valid input")
    response = (input(" type 'y' to play again or 'y' to exit: ")).lower()

    
    #There is a proper way of writing the dictionary for the data. Check Day 14 137 time 9:13 of 100 days of code.
    

