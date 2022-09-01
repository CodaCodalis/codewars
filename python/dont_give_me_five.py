import math


def dont_give_me_five(start, end):
    # count the numbers from start to end that don't contain the digit 5
    if end > start >= 0:
        start_to_end = end - start + 1
        diff = len(str(end)) - len(str(start))
        fives = start_to_end
        if diff == 0:
            counter = 0
        else:
            counter = -1
        while fives != 0:
            fives = fives / 10
            fives = math.trunc(fives)
            counter += 1
        counter -= 1
        start_to_end_without_five = start_to_end - 11**counter - diff
        name = "positive -> positive"
        print_results(name, start, end, start_to_end, start_to_end_without_five)
        return start_to_end_without_five
    elif end > 0 and start < 0:
        start_to_end = end - start
        diff = len(str(end)) - len(str(abs(start)))
        start_to_end_without_five = start_to_end - round(start_to_end / 10) - diff
        name = "negative -> positive"
        print_results(name, start, end, start_to_end, start_to_end_without_five)
        return start_to_end_without_five
    elif end < 0 and start < 0:
        start_to_end = end - start + 1
        diff = len(str(abs(start))) - len(str(abs(end)))
        start_to_end_without_five = start_to_end - round(start_to_end / 10) - diff
        name = "negative -> negative"
        print_results(name, start, end, start_to_end, start_to_end_without_five)
        return start_to_end_without_five

    # start_to_end_without_five = round(start_to_end - (start_to_end / 10))

    # print(start_to_end_without_five)
    # return start_to_end_without_five
    return None


def print_results(name, start, end, start_to_end, start_to_end_without_five):
    print("----------")
    print(name)
    print("Start: " + str(start))
    print("End: " + str(end))
    print("Numbers: " + str(start_to_end))
    print("Numbers w/o 5: " + str(start_to_end_without_five))


if __name__ == '__main__':
    #dont_give_me_five(-17, 9)
    #dont_give_me_five(1, 9)
    #dont_give_me_five(4, 17)
    #dont_give_me_five(-17, -4)
    dont_give_me_five(984, 4304)
    #dont_give_me_five(2313, 2317)
    #dont_give_me_five(-4045, 2575)
    #dont_give_me_five(-4436, -1429)
