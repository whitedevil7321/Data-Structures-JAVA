class selection_sort:
    def __init__(self,arr):
        self.arr = arr
    def selection_sort(self,arr):
        for i in range(len(arr)):
            min_index = i
            for j in range(i+1,len(arr)):
                if arr[j]<arr[min_index]:
                    min_index = j
            arr[i],arr[min_index] = arr[min_index],arr[i]
        return arr
    
if __name__=="__main__":
    arr = [64, 34, 25, 12, 22, 11, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,-1,-4,-2,-3,-5,-6,-7,-8,-9,-10]
    sorter = selection_sort(arr)
    sorted_arr = sorter.selection_sort(arr)
    print("Sorted array is:", sorted_arr)    