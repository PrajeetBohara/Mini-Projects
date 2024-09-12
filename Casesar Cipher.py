
print("Welcome to Caesar Cipher")

def cipher(word_data,word_array, shift_no):
    encrypted =[]
    for i in range(0,len(word_data)):
        if word_data[i] in word_array:
            index = word_array.index(word_data[i])
            new_index = (index + shift_no) % 26
            encrypted.append(word_array[new_index])
    return ''.join(encrypted)

def decipher(word_data2, word_array, shift_no):
    decrypted = []
    for i in range(len(word_data2)):
        index = word_array.index(word_data2[i])
        new_index = (index - shift_no) % 26 #if you dont want to use modulus just duplicate the word list strucuture
        #example: word =["a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"]
        decrypted.append(word_array[new_index])
    return ''.join(decrypted)

user_choice = input("Please choose if you want to 'encrypt' or 'decrypt' word: ")
if user_choice == 'encrypt':
    user_word = input("Enter the word that you want to encrypt: ").lower()
    word_list = list(user_word)
    shift = int(input("Type the shift number: "))
    final_cipher = cipher(word_list,word,shift)
    print(f"Your encrypted code is: {final_cipher}")

elif user_choice == 'decrypt':
    user_word2 = input("Enter the word that you want to decrypt: ").lower()
    decrypt_wordlist = list(user_word2)
    shift_decrypt = int(input("Type the shift number: "))
    final_decipher = decipher(decrypt_wordlist, word, shift_decrypt)
    print(f"Your decrypted code is {final_decipher}")



#Below: Using same function both cipher and decipher to reduce redundancy

# def caesar(user_input, user_selection , shift):
#     result_array = []
#     for i in range(len(user_input)):
#         if user_input[i] in word_array:
#             index = word_array.index(user_input[i])
#             if user_selection == "encrypt":
#                 new_index = (index + shift) % 26
#             elif user_selection == "decrypt":
#                 new_index = (index -shift) % 26
#             else:
#                 print("Error input from user please tell user to write the correct input")
#                 # raise SystemExit
#             result_array.append(word_array[new_index])

#     return ''.join(result_array)

# word_array =["a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"]

# user_selection = (input("Enter whether you want to encrypt or decrypt: ")).lower()
# user_input = (input("Enter the word you want to encrypt or decrypt: ")).lower()
# shift = int(input("Enter the shift you want: "))

# result = caesar(user_input, user_selection, shift)

# print(f"Your {user_selection}ed word is {result}")


    
    






