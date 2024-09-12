students_heights = [180, 124, 165, 173, 189, 169, 146]
height_sum = 0
for n in range(0, len(students_heights)):
    height_sum = height_sum + students_heights[n]
average = height_sum/len(students_heights)
print(average)