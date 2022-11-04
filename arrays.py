list = [1, 2, 3, 4, 5]
result = list[4]
print(result)

if 1 in list: print(True)

for n in list:
    if n == 1:
        break

numbers =[]
print(len(numbers))
numbers.append(6)
print(numbers[0])
print(len(numbers))
numbers.extend(list)
print(numbers)