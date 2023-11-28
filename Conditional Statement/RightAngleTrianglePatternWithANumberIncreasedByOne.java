import java.util.Scanner;

public class RightAngleTrianglePatternWithANumberIncreasedByOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int k = 1;
        System.out.print("Input number of rows : ");
        int n = in.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++)
                System.out.print(k++);
            System.out.println(" ");
        }
    }
}
