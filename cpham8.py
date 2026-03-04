#Christine Pham
#lab 8

print("I chose a number 0 through 9. Lets see if you can guess it")
x = 7

userInput = input("Guess an integer 0-9\n")
y = int(userInput)


numTries = 3
if (x != y):
    if (y > x):
        print ("You Lose. Your guess is too high!")
        
    elif (y < x):
        print ("You Lose. Your guess is too low!")
    
    print ("My number was ",  x, "\n")

else:
    print ("That was my number! You win!\n")


for i in range(3):
    print ("And now I will repeat this 3 times")
print("\n")

n = 0
while (n != 4):
    print ("My favorite food is french fries")
    n+= 1
