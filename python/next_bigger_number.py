def next_bigger(n):
    n_arr = [int(x) for x in str(n)]
    check_len_one_and_two(n_arr)
    n_arr_next = []
    for i in range(0, len(n_arr)):
        if n_arr[i] == 9 or n_arr[i] == 0:
            if n_arr[i] == 0:
                n_arr_next = next_bigger_with_zero(n_arr, i)
                break
            elif n_arr[i] == 9:
                n_arr_next = next_bigger_with_nine(n_arr, i)
                break
        else:
            n_arr_next = next_bigger_without_nine(n_arr)

    n_next = "".join(str(x) for x in n_arr_next)
    if int(n_next) == n:
        return -1

    return int(n_next)


def check_len_one_and_two(n):
    if len(n) == 1:
        return -1
    if len(n) == 2:
        if n[0] > n[1]:
            return -1
        else:
            temp = n[0]
            n[0] = n[1]
            n[1] = temp
            n_next = "".join(str(x) for x in n)
            return int(n_next)


def next_bigger_with_zero(n_arr, index):
    # wtf
    return -1


def next_bigger_with_nine(n_arr, index):
    after_nine = []
    around_nine = []
    for i in range(index + 1, len(n_arr)):
        after_nine.append(n_arr[i])

    after_nine_sorted = sorted(after_nine)
    smallest_after_nine = after_nine_sorted[0]

    for i in range(index - 1, len(n_arr)):
        around_nine.append(n_arr[i])

    n_arr_next = n_arr[:-(len(around_nine))]
    n_arr_next.append(smallest_after_nine)

    around_nine_sorted = sorted(around_nine)
    around_nine_sorted.remove(smallest_after_nine)

    for i in range(0, len(after_nine) + 1):
        n_arr_next.append(around_nine_sorted[i])

    return n_arr_next


def next_bigger_without_nine(n_arr):
    n_rev = n_arr[::-1]
    for i in range(0, len(n_rev) - 1):
        if n_rev[i] > n_rev[i + 1]:
            temp = n_rev[i]
            n_rev[i] = n_rev[i + 1]
            n_rev[i + 1] = temp
            break

    n_arr_next = n_rev[::-1]

    return n_arr_next
