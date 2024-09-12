
import random

def high_low(response, number):
     if response < number:
          print("Too Low")
     elif response > number:
          print("Too High")

def algorithm(response, number, attempts):
     
     while (response != number) and (attempts > 0):
        high_low(response, number)
        print(f"You have {attempts} attempts remaining to guess the number.")
        attempts -= 1
        response = int(input("Make a guess: "))
     if response == number:
            print(f"You guessed it right. Congratulations!")
     elif attempts == 0:
            print(f"You lose. You are out of your attempts.")
            print(f"The correct number is: {number}")


print("Welcome to number guessing game.")
print("LOGO")
print("I'm thinking of a number between 1 and 100")
random_number = random.randint(1,100)
difficulty = input("Choose a difficulty. Type 'easy' or 'hard': ")
if difficulty == "easy":
    attempts = 10
elif difficulty == "hard":
    attempts = 5
user_response = int(input("Make a guess: "))
algorithm(user_response, random_number, attempts  )
