def DNA_strand(dna):
    print(dna)

    dna_char_list = list(dna)
    print(dna_char_list)

    for i in range(0, len(dna_char_list)):
        if dna_char_list[i] == 'A':
            dna_char_list[i] = 'T'
        elif dna_char_list[i] == 'T':
            dna_char_list[i] = 'A'
        elif dna_char_list[i] == 'G':
            dna_char_list[i] = 'C'
        elif dna_char_list[i] == 'C':
            dna_char_list[i] = 'G'

    print(dna_char_list)

    compl = ""

    for x in dna_char_list :
        compl += x

    print(compl)


if __name__ == '__main__':
    dna = "GAAT"
    DNA_strand(dna)
