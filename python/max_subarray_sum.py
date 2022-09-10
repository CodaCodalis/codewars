def max_sequence(arr):
    arr_len = len(arr)
    arr_sorted = sorted(arr)
    if arr_len != 0 and arr_sorted[arr_len - 1] < 0:
        return 0
    max_abs = 0
    if arr_len > 4:
        for i in range(0, arr_len - 3):
            max_seq = arr[i]
            start = i + 1
            end = i + 3
            for j in range(start, end + 1):
                max_seq += arr[j]
            if max_seq > max_abs:
                max_abs = max_seq
    elif arr_len == 4:
        for i in range(0, 4):
            max_abs += arr[i]
    elif arr_len == 3:
        max_abs = arr[0] + arr[1] + arr[2]
        #sub_arr_1 = arr[0] + arr[1]
        #sub_arr_2 = arr[1] + arr[2]
        #if sub_arr_1 > sub_arr_2:
        #    max_abs = sub_arr_1
        #else:
        #    max_abs = sub_arr_2
    elif arr_len == 2:
        max_abs = arr[0] + arr[1]
        #if arr[0] > arr[1]:
        #    max_abs = arr[0]
        #else:
        #    max_abs = arr[1]
    elif arr_len == 1:
        max_abs = arr[0]

    if arr_len > 0:
        return max_abs
    else:
        return 0
