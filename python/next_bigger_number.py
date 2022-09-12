def next_bigger(n):
    res = [int(x) for x in str(n)]
    res_rev = res[::-1]
    if len(res) == 1:
        return -1
    if len(res) == 2:
        if res[0] > res[1]:
            return n
        else:
            temp = res[0]
            res[0] = res[1]
            res[1] = temp
            res_next = "".join(str(x) for x in res)
            return int(res_next)

    # if contains 9 -> new list "around_nine"
    # 24178251|2965
    # around nine = 2965
    # next_bigger(2965) -> 5269
    # append: 24178251|5269
    # 1234567|890 -> 1234567908
    # if contains 0 -> wtf
    # 69800 -> 80069

    for i in range(0, len(res_rev) - 1):
        if res_rev[i] > res_rev[i + 1]:
            temp = res_rev[i]
            res_rev[i] = res_rev[i + 1]
            res_rev[i + 1] = temp
            break

    res = res_rev[::-1]
    res_next = "".join(str(x) for x in res)

    if int(res_next) == n:
        return -1

    return int(res_next)
