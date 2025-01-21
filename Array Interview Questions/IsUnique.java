class IsUnique {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 5, 6};
        IsUnique uniqueChecker = new IsUnique();
        boolean result = uniqueChecker.isArrayUnique(array);
        if (result) {
            System.out.println("This array is unique.");
        } else {
            System.out.println("This array is not unique.");
        }
    }

    boolean isArrayUnique(int array[]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return false; // Duplicate found
                }
            }
        }
        return true; // No duplicates found
    }
}
