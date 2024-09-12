line1 = ["⬜️","️⬜️","️⬜️"]
line2 = ["⬜️","⬜️","️⬜️"]
line3 = ["⬜️️","⬜️️","⬜️️"]
map = [line1, line2, line3]
print("Hiding your treasure! X marks the spot.")
position = input()
# 🚨 Don't change the code above 👆
# Write your code below this row 👇
if position == "A1":
 map[0][0] = "X"
elif position == "B1":
 map[0][1] = "X"
elif position == "C1":
 map[0][2] = "X"
elif position == "A2":
 map[1][0] = "X"
elif position == "B2":
 map[1][1] = "X"
elif position == "C2":
 map[1][2] = "X"
elif position == "A3":
 map[2][0] = "X"
elif position == "B3":
 map[2][1] = "X"
elif position == "C3":
 map[2][2] = "X"
else:
 print("Its an error input. Please type a correct input.")




print(f"{line1}\n{line2}\n{line3}")

#You can use other shortcut technique where you just find the letter and number index and just one if statement
#will do the job done!