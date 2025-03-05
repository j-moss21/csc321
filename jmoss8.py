#Julen Moss

import random

randNum = random.randint(0,9)

x =0
y=0

print("Guess a number betweeen 0 and 9:")
y = int(input())

if y < randNum:
    print("Too low!")

elif y > randNum:
    print("Too high!")

else:
    print("You Win")

if y != randNum:
    print("You lose!")    

for i in range(y):
    print("How do robots eat pizza. One byte at a time.")

while x < 3:
    print("sushi")
    x = x + 1
