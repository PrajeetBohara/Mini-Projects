
for n in range(1,100+1):
  if (n % 3 == 0) and (n % 5 == 0):
    #Here is the catch. Make sure to do this statement first if not 
    #then the program with print the output for the number where either
   #of 3 or 5 is divisible skipping if that number is divisible by both 3 and 5.
    print("FizzBuzz")
  elif n % 3 == 0:
    print("Fizz")
  elif n % 5 == 0:
    print("Buzz")
  else:
    print(n)