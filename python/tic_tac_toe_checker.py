def is_solved(board):
    counter_0 = 0
    counter_1 = 0
    counter_2 = 0
    for row in board:
        for i in range(0, 3):
            if row[i] == 0:
                counter_0 += 1
            elif row[i] == 1:
                counter_1 += 1
            elif row[i] == 2:
                counter_2 += 1
            if counter_1 == 3:
                return 1
            if counter_2 == 3:
                return 2
            if counter_0 + counter_1 + counter_2 == 3:
                counter_0 = 0
                counter_1 = 0
                counter_2 = 0

    counter_1 = 0
    counter_2 = 0
    for row in board:
        if row[0] == 1:
            counter_1 += 1
        if row[0] == 2:
            counter_2 += 1
    if counter_1 == 3:
        return 1
    if counter_2 == 3:
        return 2

    counter_1 = 0
    counter_2 = 0
    for row in board:
        if row[1] == 1:
            counter_1 += 1
        if row[1] == 2:
            counter_2 += 1
    if counter_1 == 3:
        return 1
    if counter_2 == 3:
        return 2

    counter_1 = 0
    counter_2 = 0
    for row in board:
        if row[2] == 1:
            counter_1 += 1
        if row[2] == 2:
            counter_2 += 1
    if counter_1 == 3:
        return 1
    if counter_2 == 3:
        return 2

    elements = []
    for row in board:
        for i in range(0, 3):
            elements.append(row[i])

    if elements[0] == 1 and elements[4] == 1 and elements[8] == 1:
        return 1
    if elements[0] == 2 and elements[4] == 2 and elements[8] == 2:
        return 2

    if elements[2] == 1 and elements[4] == 1 and elements[6] == 1:
        return 1
    if elements[2] == 2 and elements[4] == 2 and elements[6] == 2:
        return 2

    for row in board:
        for i in range(0, 3):
            if row[i] == 0:
                return -1

    return 0
