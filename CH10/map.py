before = ['2019', '12', '31']
after = list(map(int, before))
print(after)

#----------------------------------------------------
# 리스트에 값을 하나씩 더해서 새로운 리스트를 만드는 작업
myList = [1, 2, 3, 4, 5]
result1 = []
for val in myList:
    result1.append(val + 1)
print(f'result1 : {result1}')
# map 함수
def add_one(n):
    return n + 1
# map반환을 list 로 변환
result2 = list(map(add_one, myList))
print(f'result2 : {result2}')