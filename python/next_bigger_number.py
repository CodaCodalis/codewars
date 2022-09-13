def next_bigger(n):
    n_arr = [int(x) for x in str(n)]
    if len(n_arr) < 3:
        return check_len_one_and_two(n_arr)

    ind = len(n_arr)

    for i in range(ind-1, 0, -1):
        if n_arr[i] > n_arr[i - 1]:
            break

    if i == 1 and n_arr[i] <= n_arr[i-1]:
        return -1

    x = n_arr[i - 1]
    smallest = i
    for j in range(i + 1, ind):
        if n_arr[j] > x and n_arr[j] < n_arr[smallest]:
            smallest = j

    n_arr[smallest], n_arr[i - 1] = n_arr[i - 1], n_arr[smallest]

    x = 0
    for j in range(i):
        x = x * 10 + n_arr[j]

    n_arr = sorted(n_arr[i:])

    for j in range(ind - i):
        x = x * 10 + n_arr[j]

    if x == n:
        return -1

    return x


def check_len_one_and_two(n):
    if len(n) == 1:
        return -1
    if len(n) == 2:
        if n[0] > n[1] or n[0] == n[1]:
            return -1
        else:
            temp = n[0]
            n[0] = n[1]
            n[1] = temp
            n_next = "".join(str(x) for x in n)
            return int(n_next)
