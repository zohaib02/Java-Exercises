import java.util.Scanner;

public class NTermsOfNaturalNumbersAndSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum = 0;
        System.out.print("Input number: ");
        int n = in.nextInt();

        System.out.println("The first n natural numbers are : "+ n);

        for(int i = 1; i <= n; i++) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("The Sum of Natural Number upto "+ n + " terms : " + sum);
    }
}
