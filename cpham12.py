#Christine Pham
#Lab 12

def recArea(base, height):
    return (base * height)

def circArea(radius):
    return (3.14 * radius * radius)
base = int(input("enter the width of the rectangle: "))
height = int(input("Enter the height of the rectangle: "))

rectangleArea = recArea(base, height)

print("The area of your rectangle is: ", rectangleArea)

radius = int(input("enter the radius of the circle: "))

circleArea = circArea(radius)

print("the area of the circle is: ", circleArea)
