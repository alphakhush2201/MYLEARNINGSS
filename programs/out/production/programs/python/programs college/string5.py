str=input("Enter String:")
a,b=0,0
for x in str:
    if x.isdigit():
        a+=1
        b+=int(x)
print("sum: ",b," Average: ",b/a)