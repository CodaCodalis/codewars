# range     count       result      9**x
# 0-9       1           9           1
# 0-99      19          81          2
# 0-999     271         729         3
# 0-9999    3439        6561        4
# 0-99999   40951       59049       5
# 0-999999  468559      531441      6

# 1453 => 356 (expected 356)
# 1000 => 1*271 = 271
# 400  => 4*19  = 76
# 50   => 5*1 = 5
# 3    => (3 < 5 => 0) 1*3+1 = 4

# 7382 => 2700 (expected 2700)
# 7000 => 1*3439 - 3*271 = 2626
# 300  => 3*19 = 57
# 80   => 1*19 - 2*1 = 17
# 2    => 2 < 5 => 0

# 476 => 93 (expected 93)
# 400 => 4*19 = 76
# 70  => 1*19 - 3*1 = 16
# 6   => 6 > 5 => 1

# 527 => 123 (expected 123)
# 500 => 5*19 = 95
# 20  => (2*1 = 2) => 10*2 = 20
# 7   => (7 > 5 => 1) 1*7+1 = 8

# 18580 => 6512 (expected 6512)
# 10000 => 1*3439 = 3439
# 8000  => 1*3439 - 2*271 = 2897
# 500   => 5*19 = 95
# 80    => (1*19 - 2*1 = 17) => 1*80 = 80
# 0     => (0 < 5 => 0) 1*0+1 = 1

# 30253 => 10364 (expected 10364)
# 30000 => 3*3439 = 10317
# 0000  => 0*271 = 0
# 200   => 2*19 = 38
# 50    => 5*1 = 5
# 3     => (3 < 5 = 0) 1*3+1 = 4


def dont_give_me_five(start, end):
    s_neg = False
    e_neg = False
    if start < 0:
        start = abs(start)
        s_neg = True
    if end < 0:
        end = abs(end)
        e_neg = True

    s_count_five = count_fives(start)
    e_count_five = count_fives(end)

    if s_neg and not e_neg:
        total = start + end + 1
        fives = s_count_five + e_count_five
    elif s_neg and e_neg:
        total = start - end + 1
        fives = s_count_five - e_count_five
    else:
        total = end - start + 1
        fives = e_count_five - s_count_five

    return total - fives


def count_fives(num):
    n_arr = [int(x) for x in str(num)]
    n_arr_l = len(n_arr)
    n_count_five = 0
    n_factor = n_arr_l

    for i in range(0, n_arr_l):
        n_factor -= 1
        if n_arr[i] <= 5:
            n_count_five += n_arr[i] * (10 ** n_factor - 9 ** n_factor)
        else:
            n_count_five += (10 ** (n_factor + 1) - 9 ** (n_factor + 1)) - (10 - n_arr[i]) * (
                        10 ** n_factor - 9 ** n_factor)

    return n_count_five
