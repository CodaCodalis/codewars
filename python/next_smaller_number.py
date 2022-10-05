import itertools


def next_smaller(n):
    nstr = str(n)
    nstrarr = split_str(nstr)
    nstrlen = len(nstr)
    for i in reversed(range(0, nstrlen-1)):
        if nstrarr[i] < nstrarr[i - 1]:
            x = i
            for j in range(x, nstrlen-1):
                if nstrarr[x] < nstrarr[j]:
                    nstrarr[i] = nstrarr[j]
                    nstrarr[j] = nstrarr[x]

    num = "".join(str(x) for x in nstrarr)
    return num


def split_str(s):
  return [ch for ch in s]
