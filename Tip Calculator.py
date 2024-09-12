input_a = input("What is the total bill?\n")
input_b = input("What percent of tip you want to give?\n")
input_c = input("How many people you want to split this bill into?\n")

total_bill = float(input_a)
tip = float(input_b)
num_people = float(input_c)

a = round((total_bill/num_people)*(tip/100),2)

print("Each person should pay "+ str(a)+" .")


