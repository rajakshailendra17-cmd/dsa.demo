# def twoSum(nums, target):
#     seen = {} 
    
#     for i, num in enumerate(nums):
#         complement = target - num
#         if complement in seen:
#             return [seen[complement], i]
#         seen[num] = i


# nums = [2, 7, 11, 15]
# target = 9
# print(twoSum(nums, target)) 

# import colorsys
# import turtle
# screen = turtle.Screen()
# screen.bgcolor("black")
# t = turtle.Turtle()
# t.speed(0)
# t.width(1)
# n, h=36,0
# for i in range(200):
#     c=colorsys.hsv_to_rgb(h, 1, 1)
#     t.color(c)
#     h+=1/n
#     t.forward(i)
#     t.left(135)
#     t.forward(i)
#     t.left(30)
#     t.circle(i, 45)
# turtle.done
# // print 1 to N numbers in a single line using a single loop
# N = int(input("enter any number: "));

# for i in range(1, 10):
#     print(i)

import tkinter as tk

# Create main window
root = tk.Tk()
root.title("Hello Tkinter")

# Add a label
label = tk.Label(root, text="Welcome to Tkinter!")
label.pack()

# Add a button
def say_hello():
    label.config(text="Button clicked!")

button = tk.Button(root, text="Click Me", command=say_hello)
button.pack()

# Start the GUI loop
root.mainloop()



