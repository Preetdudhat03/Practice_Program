import itertools
import string
import time
import getpass

def brute_force(password):
    chars = string.ascii_letters + string.digits + string.punctuation
    start_time = time.time()
    length = 1
    
    while True:
        for attempt in itertools.product(chars, repeat=length):
            attempt = ''.join(attempt)
            if attempt == password:
                end_time = time.time()
                return attempt, end_time - start_time
        length +=1
password_to_crack = getpass.getpass("Enter the strong password")
print("process start...")

found_password, time_taken = brute_force(password_to_crack)

if found_password:
    print(f"Password found: {found_password}")
    print(f"Time taken: {time_taken} seconds")
else:
    print("Password not found")
