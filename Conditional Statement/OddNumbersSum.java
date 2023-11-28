import java.util.Scanner;

public class OddNumbersSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum = 0;
        System.out.print("Input number of terms is: ");
        int n = in.nextInt();
        System.out.println ("\nThe odd numbers are :");
        for(int i = 1; i <= n; i++) {
            System.out.println (2 * i - 1);
            sum += 2 * i - 1;
        }
        System.out.println ("The Sum of odd Natural Number upto " + n  +" terms is: " + sum);
    }
}
