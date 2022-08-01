#n=int(input("enter a number"))
#f=1
#for x in range(1,n+1):
 #   f=f*x
 #   print(f)
# print("the factorial of",n,"is",f)

#x=["apple","orange","grape"]
#x.insert(2,"pine")
#print(x)

#lst=[1,2,3]
#x=lst[-3]
#print(x)

#x="fuck you ezeki"
#n="fuck" in x
#print(n)

#a="a"
#b=3
#c=a*b
#print(c)

# def fuck():
#     global z
#     x=1
#     y=2
#     z=x+y
#     print(z)
# fuck()
# print(z)

#b="godfather,1972"
# print(b[9:7])

# from collections import Counter
# z="azhagarasan"
# k=Counter(z)
# print(k)

# a="     hello"
# print(a.strip())
# from collections import Counter
# s={'a':1,'b':2,'c':4,'a':1}
# z=Counter(s)
# print(z)

# a="fill the water the in the / water bottle"
# print(a.endswith())

# txt="my name is sta$e"
# print(txt.encode(encoding="ascii",errors="replace"))

# t="h\te\tl\tl\to"
# print(t.expandtabs())

# a="for only {:f} dollars {}"
# print(a.format(49,"thank you"))

# t="the octal version of {0} is {0:o}"
# print(t.format(14))

# t="organic 123 farm"
# print(t.isascii())

# m=["godfather","1972"]
# print(" ".join(m))

# t="rohit the hitman is the new captain of india"
# print(t.rsplit(".",6))
# x="Hello World Hello"
# print(x.count("Hello"))
# a="for only {} dollars {}"
# print(a.format(51,"thank you"))
# a="string"
# print(a.zfill(8))
# x=5
# a=5
# c=x&a
# print(c)

# new=[]
# for i in range (10):
#     if i<5:
#        new.append(i)
# print(new)

# a=int(input("enter num"))
# b=[]
# for i in range (a):
#     b=a%10
#
#     i=a//10
# b=int(b)
# print(b)



# import math
# x=int(input("enter radian"))
# b=x*(180/(math.pi))
# print(b,"deg")

# a=str(input("enter string"))
# c=0
# d=0
# for i in a:
#     if i=="a" or i=="e" or i=="i" or i=="o" or i=="u":
#        c=c+1
#     else:
#        d=d+1
# print(c,",",d)

# a=[1,2,3,4,5]
# b=[2,3]
# print(a.__add__(b))

# a=("apple","grape","lemon","pine","orange")
# (fuck,*you,bitch)=a
# print(*you)

# a=("k","o","u","s","i","k")
# for i in (a):
#     print(i)

# list1=["m","i","na","al"]
# list2=["y","s","me","ex"]
# list3=[]
# for i in (list1):
#     for j in (list2):
#        list3=[i+j]
# print(list3)

f={"apple","banana","grape"}
g={"apple","orange"}
f.difference_update(g)
print(f)