# split(), splitlines(), join()
ss = 'Python을 열심히 공부 중'
print(ss.split())
ss = '하나:둘:셋'
print(ss.split(':'))
ss = '하나\n둘\n셋'
print(ss.splitlines())
ss = '%'
print(ss.join('파이썬'))

#----------------------------------------------------
# join
a = ['a', 'b', 'c']
result1 = '%'.join(a)
result2 = '\n'.join(a)
print(result1)
print(result2)


#----------------------------------------------------
myList = [1, 2, 3, 4, 5]
result1 = []
for val in myList:
    result1.append(val + 1)
print(result1)