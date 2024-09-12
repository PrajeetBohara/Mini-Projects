
height = (input("Enter your height in meters e.g., 1.55\n"))
height_float = float(height)

weight = (input("Enter your weight in kilograms e.g., 72\n"))
weight_int = int(weight)

bmi = float(weight_int/(height_float*height_float))

if bmi < 18.5:
  print(f"Your BMI is {bmi}, you are underweight.")
elif 18.5 <= bmi <25:
  print(f"Your BMI is {bmi}, you have a normal weight.")
elif 25 <= bmi < 30:
  print(f"Your BMI is {bmi}, you are slightly overweight.")
elif 30 <= bmi < 35:
  print(f"Your BMI is {bmi}, you are obese.")
else:
  print(f"Your BMI is {bmi}, you are clinically obese.")