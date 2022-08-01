# a=5
# b=5
# c=0
# if a>b:
#     for i in range(a):
#         b=b+1
#         c=c+1
#         if a==b:
#             print(c)
#             break
#         else:
#             continue
#
#
# elif b>a:
#     for j in range(b):
#         a=a+1
#         c=c+1
#         if a==b:
#             print(c)
#             break
#         else:
#             continue
# else:
#     print(c)
#
# a=["even","odd"]
# b=int(input("enter"))
# print(a[b%2])
a=[4,5,2,3,1]
for i in range (len(a)):
    for j in range(len(a)-1):
        if(a[j]>a[j+1]):
            t=a[j]
            a[j]=a[j+1]
            a[j+1]=t

print(a)




