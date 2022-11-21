def merge_sort(list):
    if len(list) <= 1:
        return list
    
    left_half, right_half = split(list)
    left = merge_sort(left_half)
    right = merge_sort(right_half)

    return merge(left, right)


def split(list):
    mid = len(list)//2
    left = list[:mid]
    right = list[mid:]

    return left, right

def merge (left, right):
    list = []
    i = 0
    j = 0

    while i < len(left) and j < len(right):
        if left[i] < right[j]:
            list.append(left[i])
            i+=1
        else:
            list.append(right[j])
            j+=1
    
    while i < len(left):
        list.append(left[i])
        i+=1
    
    while j < len(right):
        list.append(right[j])
        j+=1
    
    return list

def verify_sorted(list):
    n = len(list)

    if n == 0 or n == 1:
        return True

    return list[0] < list[1] and verify_sorted(list[1:])