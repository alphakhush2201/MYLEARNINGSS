def stringcount(a,b,c): 
    str = input("Enter string:")
    for x in str:
        if x.isalpha():
            a+=1
        elif x.isdigit():
            b+=1
        elif x!=" ":
            c+=1
    return a,b,c
alpha,digit,special = stringcount(0,0,0)
print(alpha,digit,special)
