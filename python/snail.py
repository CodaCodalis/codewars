def snail(snail_map):  # [[1,2,3],[8,9,4],[7,6,5]]
    arr_list = list()
    snail_list = list()

    for i in range(len(snail_map)):
        arr_list.append(snail_map[i])  # [1,2,3,8,9,4,7,6,5]

    for i in range(len(snail_map)):
        arr = snail_map[i]
        for j in range(len(arr)):
            list.append(arr[j])

    return [1, 2, 3, 4, 5, 6, 7, 8, 9]


# 00 01 02
# 10 11 12
# 20 21 22

# 00 01 02 12 22 21 20 10 11
# 3 2 2 2
# 0 1 2 6 9 8 7 4 5

# 00 01 02 03
# 10 11 12 13
# 20 21 22 23
# 30 31 32 33

# 00 01 02 03 13 23 33 32 31 30 20 10 11 12 22 21
# 4 3 3 2 2 2
# 0 1 2 3 4 8 12 16 15 14 13 9
