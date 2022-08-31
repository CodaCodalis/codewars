def validate_pin(pin):
    if len(pin) == 4 or len(pin) == 6:
        return pin.isnumeric()
    else:
        return False


if __name__ == '__main__':
    pin = "1a34"
    print(validate_pin(pin))
