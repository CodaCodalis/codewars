def rgb(r, g, b):
    arr = [r, g, b]
    for i in range(0, 3):
        if arr[i] < 0:
            arr[i] = 0
        elif arr[i] > 255:
            arr[i] = 255
        s = hex(arr[i])[2:].upper()
        if len(s) < 2:
            s = "0" + s
        arr[i] = s

    shex = ''.join(str(s) for s in arr)
    return shex
    # pass


if __name__ == '__main__':
    h = rgb(255, 128, 0)
    print(h)
