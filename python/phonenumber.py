def create_phone_number(n):
    # your code here
    n.insert(0, '(')
    n.insert(4, ')')
    n.insert(5, ' ')
    n.insert(9, '-')
    tel = ''.join(str(x) for x in n)
    return tel


if __name__ == '__main__':
    n = [1, 2, 3, 4, 5, 6, 7, 8, 9, 0]
    print(n)
    tel = create_phone_number(n)
    print(tel)
