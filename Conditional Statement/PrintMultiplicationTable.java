import java.util.Scanner;

public class PrintMultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the number(Table to be calculated): ");
        System.out.print("Input number of terms : ");
        int n = in.nextInt();

        System.out.println ("\n");
        for (int j = 0; j <= n; j++)
            System.out.println(n+" X "+j+" = " +n*j);
    }
}
