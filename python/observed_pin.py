from itertools import permutations


def get_pins(observed):
    if len(observed) == 1:
        return possible_digits(observed)
    else:
        digits = observed.split()

    for i in range(0, len(digits)-1):
        if digits[0] != digits[i]:
            break
        else:
            pass


def possible_digits(digit):
    digits = list()
    switch = {
        '1': digits + ['1', '2', '4'],
        '2': digits + ['1', '2', '3', '5'],
        '3': digits + ['3', '2', '6'],
        '4': digits + ['1', '4', '5', '7'],
        '5': digits + ['2', '4', '5', '6', '8'],
        '6': digits + ['3', '5', '6', '9'],
        '7': digits + ['4', '7', '8'],
        '8': digits + ['5', '7', '8', '9', '0'],
        '9': digits + ['6', '8', '9'],
        '0': digits + ['8', '0'],
    }
    return switch.get(digit, "Something went wrong.")
