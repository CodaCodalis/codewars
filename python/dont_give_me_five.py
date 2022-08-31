def dont_give_me_five(start, end):
    # count the numbers from start to end that don't contain the digit 5
    s = abs(start)
    e = abs(end)
    start_to_end = end - start
    if end > start >= 0:
        x = len(str(s)) - len(str(e))
        if x == 0:
            start_to_end = start_to_end + 1
        while x != 0:
            start_to_end = start_to_end + 1
            x = x + 1
    elif end > start < 0:
        x = len(str(e)) - len(str(s))
        while x != 0:
            start_to_end = start_to_end + 1
            x = x + 1

    start_to_end_without_five = round(start_to_end - (start_to_end / 10))

    return start_to_end_without_five
