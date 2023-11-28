import java.util.Scanner;

public class RightAngleTrianglePatternWithANumberWhichRepeats {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input number of n : ");
        int n = in.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++)
                System.out.print(i);
            System.out.println(" ");
        }
    }
}
