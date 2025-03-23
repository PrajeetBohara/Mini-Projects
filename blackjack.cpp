#include <iostream>
#include <vector>
#include <algorithm>
#include <ctime>
#include <cstdlib>

using namespace std;

// Function to get the value of a card
int getCardValue(string card, int& total) {
    if (card == "A") {
        return (total + 11 > 21) ? 1 : 11;
    }
    if (card == "K" || card == "Q" || card == "J") {
        return 10;
    }
    return stoi(card);
}

// Function to calculate the total hand value
int calculateTotal(vector<string> hand) {
    int total = 0;
    int aces = 0;

    for (string card : hand) {
        if (card == "A") {
            aces++;
            total += 11;
        } else if (card == "K" || card == "Q" || card == "J") {
            total += 10;
        } else {
            total += stoi(card);
        }
    }

    // Handle Aces if total > 21
    while (total > 21 && aces > 0) {
        total -= 10;
        aces--;
    }

    return total;
}

// Function to print a hand
void printHand(string name, vector<string> hand) {
    cout << name << "'s Hand: ";
    for (string card : hand) {
        cout << card << " ";
    }
    cout << "(Total: " << calculateTotal(hand) << ")" << endl;
}

int main() {
    srand(static_cast<unsigned int>(time(0)));

    // Create a deck of cards
    vector<string> deck;
    vector<string> faces = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    for (int i = 0; i < 4; i++) { // 4 suits
        for (string f : faces) {
            deck.push_back(f);
        }
    }

    random_shuffle(deck.begin(), deck.end());

    vector<string> playerHand;
    vector<string> dealerHand;

    // Deal initial cards
    playerHand.push_back(deck.back()); deck.pop_back();
    dealerHand.push_back(deck.back()); deck.pop_back();
    playerHand.push_back(deck.back()); deck.pop_back();
    dealerHand.push_back(deck.back()); deck.pop_back();

    // Player's turn
    string choice;
    while (true) {
        printHand("Player", playerHand);
        if (calculateTotal(playerHand) > 21) {
            cout << "Bust! You lose." << endl;
            return 0;
        }

        cout << "Do you want to (h)it or (s)tand? ";
        cin >> choice;

        if (choice == "h") {
            playerHand.push_back(deck.back()); deck.pop_back();
        } else if (choice == "s") {
            break;
        } else {
            cout << "Invalid choice. Try again." << endl;
        }
    }

    // Dealer's turn
    cout << "\nDealer's Turn:\n";
    while (calculateTotal(dealerHand) < 17) {
        dealerHand.push_back(deck.back()); deck.pop_back();
    }

    printHand("Dealer", dealerHand);
    printHand("Player", playerHand);

    int dealerTotal = calculateTotal(dealerHand);
    int playerTotal = calculateTotal(playerHand);

    if (dealerTotal > 21) {
        cout << "Dealer busts! You win!" << endl;
    } else if (dealerTotal > playerTotal) {
        cout << "Dealer wins!" << endl;
    } else if (dealerTotal < playerTotal) {
        cout << "You win!" << endl;
    } else {
        cout << "It's a tie!" << endl;
    }

    return 0;
}
