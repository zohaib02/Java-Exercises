import java.util.Scanner;

public class PrintFloydsTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numberOfRows;
        System.out.print("Input number of rows : ");
        numberOfRows = in.nextInt();

        int number = 1;
        for (int row = 1; row <= numberOfRows; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}
