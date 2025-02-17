def addTwoNumbers(l1, l2):
    a=0
    b=0
    x=1
    y=1
    for i in range(len(l1)):
        a+=l1[i]*(10**i)
        x+=1
    for j in range(len(l2)):
        b+=l2[j]*(10**j)
        y+=1
    c=a+b
    l3 = []
    for digit in str(c):
        d=int(digit)
        l3.append(d)
    return l3.reverse()
list1=[1,2,3]
list2=[4,5,6]
addTwoNumbers(list1,list2)

        
