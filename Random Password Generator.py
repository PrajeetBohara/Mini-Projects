letter = int(input("How many letters would you like in your password?"))
symbols = int(input("How many symbols would you like in your password?"))
numbers = int(input("How many numbers would you like in your password?"))

symbol_list = ["!","@","#","$","%","^","&","*","(",")"]
letter_list = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
                'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 
                's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 
                'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
                 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 
                 'T', 'U', 'V', 'W', 'X', 'Y', 'Z']
numbers_list = ['0','1','2','3','4','5','6','7','8','9']

import random
password = []

for i in range(0, letter):
    password.append(random.choice(letter_list))

for i in range(0,symbols):
    password.append(random.choice(symbol_list))

for i in range (0,numbers):
    password.append(random.choice(numbers_list))

random.shuffle(password) #shuffle the numbers inside the string
#now save all the data of list str to a string so that we can print
#it in the form of
password_string = ""
for char in password:
 password_string += char

print(password_string)

