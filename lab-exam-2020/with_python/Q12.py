from typing import List
import random as rd

def generate_10_numbers_from_0_until_100() -> List[int]:
    rdList = []
    for i in range(10):
        rdList.append(rd.randint(0,100))
    return rdList


def print_list(numbers:List[int]):
    for i in numbers:
        print(i)
    print("--end--")


def sort_in_ascending_order(numbers : List[int]) -> List[int]:
    return sorted(numbers)


def remove_content_which_number_is_under_50(numbers :List[int]) -> List[int]:
    for i in range(51):
        while i in numbers:
            numbers.remove(i)
    return numbers


if __name__ == '__main__':
    rdlist = generate_10_numbers_from_0_until_100()
    print_list(rdlist)
    rdlist = sort_in_ascending_order(rdlist)
    print_list(rdlist)
    rdlist = remove_content_which_number_is_under_50(rdlist)
    print_list(rdlist)