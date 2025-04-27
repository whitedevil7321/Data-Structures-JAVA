class insertion_sort:
    def __init__(self, arr):
        self.arr = arr

    def insertion_sort(self,arr):
        for i in range(1,len(arr)):
            for j in range(i,0,-1):
                if arr[j-1]>arr[j]:
                    arr[j-1],arr[j] = arr[j],arr[j-1]
                else:
                    break
        return arr



if __name__=="__main__":
    arr = [64, 34, 25, 12, 22, 11, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,-1,-4,-2,-3,-5,-6,-7,-8,-9,-10]
    sorter = insertion_sort(arr)
    sorted_arr = sorter.insertion_sort(arr)
    print("Sorted array is:", sorted_arr)        