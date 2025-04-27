class BubbleSort:
    def __init__(self, arr):
        self.arr = arr

    def bubble_sort(self,arr):
        for i in range(len(arr)):
            for j in range(0, len(arr)-i-1):
                if arr[j] > arr[j+1]:
                    arr[j], arr[j+1] = arr[j+1], arr[j]
        return arr

if __name__=="__main__":
    arr = [64, 34, 25, 12, 22, 11, 90]
    sorter = BubbleSort(arr)
    sorted_arr = sorter.bubble_sort(arr)
    print("Sorted array is:", sorted_arr)    
