# Bubble Sort Algorithm In Python
def bubble_sort(list):

    # A single iteration of this loop will move the largest remaining number to the end
    for i in range(len(list) - 1):

        # A single iteration of this loop will swap the position of the element at the current index
        # with the consecutive element if it is greater
        for j in range(len(list) - 1):
            if list[j] > list[j + 1]:
                list[j], list[j + 1] = list[j + 1], list[j]

    return(list)

list = [24, 19, 9, 14, 94, 56, 32, 87, 5, 101]

print(bubble_sort(list))
