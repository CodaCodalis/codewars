import string


def rot13(message):
    key = 13
    alphabet_lower = list(string.ascii_lowercase)
    alphabet_upper = list(string.ascii_uppercase)
    message_list = list(message)
    i = 0
    for letter in message_list:
        if 'a' <= letter <= 'z':
            index = alphabet_lower.index(letter)
            if index+key <= len(alphabet_lower)-1:
                message_list[i] = alphabet_lower[index+key]
            else:
                message_list[i] = alphabet_lower[index+key-len(alphabet_lower)]
            i = i + 1
        elif 'A' <= letter <= 'Z':
            index = alphabet_upper.index(letter)
            if index + key <= len(alphabet_upper) - 1:
                message_list[i] = alphabet_upper[index + key]
            else:
                message_list[i] = alphabet_upper[index + key - len(alphabet_upper)]
            i = i + 1
        else:
            i = i + 1
    encoded_message = "".join(str(x) for x in message_list)
    return encoded_message
