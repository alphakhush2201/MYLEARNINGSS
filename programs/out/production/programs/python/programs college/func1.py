def swapper(a,b):
    temp = a
    a = b
    b = temp
    return a,b
a = int (input("enter first No."))
b = int(input("Enter Second No."))
print("Before Swapping",a,",",b)
print("After Swapping",swapper(a,b))
