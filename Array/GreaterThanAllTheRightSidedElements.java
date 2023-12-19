public class GreaterThanAllTheRightSidedElements {
    // The main method for executing the program.
    public static void main(String[] args) {
        // Define an array of integers.
        int arr[] = {10, 9, 14, 23, 15, 0, 9};
        int size = arr.length;

        // Loop through each element in the array.
        for (int i = 0; i < size; i++) {
            int j;

            // Find the first element greater than or equal to arr[i].
            for (j = i + 1; j < size; j++) {
                if (arr[i] <= arr[j])
                    break;
            }

            // If no greater element is found, print the current element.
            if (j == size)
                System.out.print(arr[i] + " ");
        }
    }
}
