rock = '''
    _______
---'   ____)
      (_____)
      (_____)
      (____)
---.__(___)
'''

paper = '''
    _______
---'   ____)____
          ______)
          _______)
         _______)
---.__________)
'''

scissors = '''
    _______
---'   ____)____
          ______)
       __________)
      (____)
---.__(___)
'''

string_input = input("What do you chose? Type 0 for Rock, 1 for Paper or 2 for Scissors.\n")
user_input = int(string_input)
import random
computer_input = random.randint(0,2)

if user_input == 0 and computer_input == 0:
    print("Your input is\n"+ rock+"\n")
    print("Computer input is\n"+ rock+"\n")
    print("It's a tie")
elif user_input == 1 and computer_input == 1:
    print("Your input is\n"+ paper+"\n")
    print("Computer input is\n"+ paper+"\n")
    print("It's a tie")
elif user_input == 2 and computer_input == 2:
    print("Your input is\n"+ scissors+"\n")
    print("Computer input is\n"+ scissors+"\n")
    print("It's a tie")
elif user_input == 0 and computer_input == 1:
    print("Your input is\n"+ rock+"\n")
    print("Computer input is\n"+ paper+"\n")
    print("Computer Won")
elif user_input == 0 and computer_input == 2:
    print("Your input is\n"+ rock+"\n")
    print("Computer input is\n"+ scissors+"\n")
    print("You Won")
elif user_input == 1 and computer_input == 2:
    print("Your input is\n"+ paper+"\n")
    print("Computer input is\n"+ scissors+"\n")
    print("Computer Won")
else:
    print("Please enter the valid input")
