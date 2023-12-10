import java.util.Arrays;

public class NumberOfEvenAndOddInts {
    public static void main(String[] args) {
        int[] arr = {5, 7, 2, 4, 9};
        int count = 0;

        System.out.println("Original Array: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("Even number/s in the array: " + count);
        System.out.println("Odd number/s in the array: " + (arr.length - count));
    }
}
