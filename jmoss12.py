#Julen Moss

import math

def calculate_rectangle_area(base, height):
    return base * height

def calculate_circle_area(radius):
    return math.pi * radius ** 2

def main():
  
    try:
        base = float(input("Enter the base of the rectangle: "))
        height = float(input("Enter the height of the rectangle: "))
        rectangle_area = calculate_rectangle_area(base, height)
        print(f"The area of the rectangle is: {rectangle_area:.2f}")
    except ValueError:
        print("Invalid input. Please enter numeric values for base and height.")

    print() 

    # Circle area calculation
    try:
        radius = float(input("Enter the radius of the circle: "))
        circle_area = calculate_circle_area(radius)
        print(f"The area of the circle is: {circle_area:.2f}")
    except ValueError:
        print("Invalid input. Please enter a numeric value for radius.")

if __name__ == "__main__":
    main()
