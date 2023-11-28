import java.util.Scanner;

public class FiveNumbersSumAndAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum = 0;


        System.out.println("Input the 5 numbers : ");

        for (int i = 0; i < 5; i++) {
            int n = in.nextInt();

            sum += n;
        }
        double avg = sum/5;
        System.out.println("The sum of 5 no is : " + sum+"\nThe Average is : " + avg);
    }
}
