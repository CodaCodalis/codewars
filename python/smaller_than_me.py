def smaller(work_arr):
    smallest = min(work_arr)
    biggest = max(work_arr)
    biggest_count = work_arr.count(biggest)
    length = len(work_arr)
    res_arr = list()

    for i in range(0, length):
        if work_arr[i] == biggest and not biggest_count == 1:
            biggest_count -= 1
        if work_arr[i] == smallest:
            res_arr.insert(i, 0)
        elif work_arr[i] == biggest and biggest_count == 1:
            res_arr.insert(i, (length-1) - i)
            biggest_count -= 1
        else:
            res_arr.insert(i, 'x')

    print(res_arr)
    return [res_arr]


if __name__ == '__main__':
    arr = list([3, 2, 4, 1, 0, 3, 2])
    smaller(arr)
