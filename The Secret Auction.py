from replit import clear

print("Print Logo")
print("Welcome to the secret auction program")

bidders ={
        "name": [],
        "amount": []
    }

def data_entry(player, bid_amount):
    bidders["name"].append(player)
    bidders["amount"].append(bid_amount)

name = input("What is your name?: ")
bid = int(input("What is your bid amount?: "))
data_entry(name, bid)

more_players = input("Are there any other bidders? Type 'yes' or 'no': ").lower()
while more_players == "yes":
    clear()
    name = input("What is your name?: ")
    bid = int(input("What is your bid amount?: "))
    data_entry(name, bid)
    more_players = input("Are there any other bidders? Type 'yes' or 'no': ").lower()

max_bid = max(bidders["amount"])
max_bidder_index = bidders["amount"].index(max_bid)

print(f"The highest bidder is {bidders["name"][max_bidder_index]} with a bid of {bidders["amount"][max_bidder_index]}.")
 