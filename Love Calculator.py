print("The Love Calculator is calculating your score...")
name1 = input("What is your name?\n") # What is your name?
name2 = input("What is their name?\n") # What is their name?
# 🚨 Don't change the code above 👆
# Write your code below this line 👇
names = name1.lower() + name2.lower()
t = names.count("t")
r = names.count("r")
u = names.count("u")
e = names.count("e")

first_digit = t+r+u+e

l = names.count("l")
o = names.count("o")
v = names.count("v")
e = names.count("e")

second_digit = l+o+v+e
love_score = int(str(first_digit)+str(second_digit))

if (love_score < 10) or (love_score>90):
  print(f"Your score is {love_score}, you go together like coke and mentos. ")
elif (love_score >= 40) and (love_score <= 50):
  print(f"Your score is {love_score}, you are alright together.")
else:
  print(f"Your score is {love_score}.")