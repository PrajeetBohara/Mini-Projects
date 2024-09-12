# 1. SINGLE FUNCTION METHOD:
# print("Logo")
# first_number = int(input("What is the first number? "))
# second_number = int(input("what is the second number? "))
# operation = input("Pick an operation: ")

# def numbers(first_number, second_number, operation):
#     if operation == "+":
#         return first_number + second_number
#     elif operation == "-":
#         return first_number - second_number
#     elif operation == "/":
#         return first_number / second_number
#     elif operation == "*":
#         return first_number * second_number
#     else:
#         return print("Error! Please insert the correct input.")

# output = numbers(first_number, second_number, operation)
# print(f"{first_number} {operation} {second_number} = {output}")

#2. MULTIPLE FUNCTION METHOD AND DICTIONARY METHOD:

from replit import clear

while True:
    print("logo")
    n1 = int(input("What is the first number? ")) #first_number
    n2 = int(input("what is the second number? ")) #second_number
    n3 = input("Pick an operation: ") #operation


    def add(n1, n2):
        return n1+n2

    def subtract (n1, n2):
        return n1-n2

    def multiply (n1, n2):
        return n1 * n2

    def division (n1, n2):
        return n1 / n2

    operator = {"+": add, #dont call function  immediately, doing so will execute the function rather then storing it for furthur use when in need.
                "-" : subtract,
                "*" : multiply,
                "/" : division
                }

    if n3 in operator:
        final_output = operator[n3](n1,n2)
        print(f"{n1 }{n3} {n2} = {final_output}")
        repeat = input("Type 'y' to continue or type 'n' to start a new calculation: ")
        while repeat == "y":
            n1 = final_output
            new_operator = input("Choose an operator: ")
            n3 = new_operator
            new_n2 = int(input("Type the second digit: "))
            n2 = new_n2
            final_output = operator[new_operator](final_output,new_n2)
            print(f"{final_output }{new_operator} {new_n2} = {final_output}")
            repeat = input("Type 'y' to continue or type 'n' to start a new calculation: ")
        if repeat == "n":
            clear()
    
    else:
        print("Error!, Please insert the correct input.")

#do some touchups and error handlings to get more accurate answers