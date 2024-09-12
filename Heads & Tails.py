
import random #first we need to import random module

random_num = random.randint(0,1) #using a vairable called random_num to save our random number
            #using randint function with inclusive limit 0 and 1.

if random_num == 0:
  print("Tails")
else:
  print("Heads")