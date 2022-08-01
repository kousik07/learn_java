x = "awesome"

def myfunc():
  global x
  x = "fantastic"
  return x
myfunc()
print(x)
