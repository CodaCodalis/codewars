def get_grade(s1, s2, s3):
    # Code here

    avg = (int(s1) + int(s2) + int(s3)) / 3

    if avg < 60 :
        return "F"
    elif avg < 70 :
        return "D"
    elif avg < 80 :
        return "C"
    elif avg < 90 :
        return "B"
    else :
        return "A"


if __name__ == '__main__':
    s1 = 69
    s2 = 77
    s3 = 73
    get_grade(s1, s2, s3)
