import random
from replit import clear
from art import logo #importing the logo from the art file in the same folder

player_score = 0
computer_score = 0
player_cards = []
computer_cards = []
cards = [11,2,3,4,5,6,7,8,9,10,10,10,10]

def player_hand():
    global player_score
    player_card = random.choice(cards)
    player_cards.append(player_card)
    player_score += player_card
    return player_cards

def computer_hand():
    global computer_score
    computer_card = random.choice(cards)
    computer_cards.append(computer_card)
    computer_score += computer_card
    return computer_cards

def check():
    if player_score >= 21:
        print(f"Your final hand: {player_cards}, current score: {player_score}")
        print(f"Computer's final hand: {computer_cards}, final score: {computer_score}")
        print(f"You Lose, Dealer Won.")
    elif computer_score >= 21:
        print(f"Your final hand: {player_cards}, current score: {player_score}")
        print(f"Computer's final hand: {computer_cards}, final score: {computer_score}")
        print(f"You Won, Dealer Lost.")

def algorithm():
    player = 21 - player_score
    computer = 21 - computer_score
    if player < computer:
        print("You Won, Dealer Lost.")
    elif computer < player:
        print("You Lost, Dealer Won.")
    elif computer == player:
        print("It's a Draw.")

def score_sheet():
    print(f"Your final hand: {player_cards}, current score: {player_score}")
    print(f"Dealer's final hand: {computer_cards}, final score: {computer_score}")

def score_hidden():
    print(f"Your cards: {player_cards}, current score: {player_score}")
    print(f"Dealer's Card: {computer_cards[0]}")

response1 = input("Do you want to play a game of Blackjack? Type 'y' or 'n': ")

player_score = 0
computer_score = 0
player_cards = []
computer_cards = []
cards = [11,2,3,4,5,6,7,8,9,10,10,10,10]

while response1 == "y":
    clear()
    print(logo)
    player_hand()
    player_hand()
    computer_hand()

    print(f"Your cards: {player_cards}, current score: {player_score}")
    print(f"Computer's first card: {computer_cards}")
    if player_score == 21:
        break

    response2 = input("Do you want to 'hit' or 'stay': ")
    while (response2 == "stay" or response2 == "hit") and (computer_score <= 21 and player_score <= 21):
        if response2 == "hit":
            player_hand()
            computer_hand()
            score_hidden()

        if response2 == "stay":    
            while computer_score <= 21:
                computer_hand()
                if computer_score >= 21:
                    break
        if player_score >= 21 or computer_score >= 21:
            break
        else:
            response2 = input("Do you want to 'hit' or 'stay': ")

    if player_score > 21:
        score_sheet()
        print("You Lose, Dealer Win.")
    elif computer_score > 21:
        score_sheet()
        print("You Win, Dealer Lose.")
    elif player_score == 21:
        score_sheet()
        print("Black Jack, You Won.")
    elif computer_score == 21:
        score_sheet()
        print("BlackJack, Dealer Won")
    else:
        score_sheet()
        algorithm()

    response1 = input("Do you want to play a game of Blackjack? Type 'y' or 'n': ")
    
    
if response1 == "n":
    print("Thank you for playing blackjack.")
else:
    print("Error! Please enter the correct response")

#problem with this code is when you type y to play again it will add with the existing score rather than starting a fresh list. so write functions in such way that it start fresh every time.
