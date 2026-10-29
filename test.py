height= float(input("Enter your height in meters: "))
weight= float(input("Enter your weight in kilograms: "))
bmi= weight / (height ** 2)
print("Your BMI is: ", bmi)
if bmi < 18.5:
    print("You are underweight.")
elif bmi < 25:
    print("You have a normal weight.")
else:
    print("You are overweight.")