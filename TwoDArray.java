import java.util.Scanner;

public class TwoDArray {
    public static void main(String args[]) {
        int[][] A = new int[2][3];
        int[][] B = new int[2][3];
        // taking array as input
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Enter the Element : ");
                Scanner sc = new Scanner(System.in);
                int x = sc.nextInt();
                A[i][j] = x;
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Enter the Element : ");
                Scanner sc = new Scanner(System.in);
                int y = sc.nextInt();
                B[i][j] = y;
            }
        }

        // printing array
        int[][] C = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                C[i][j] = A[i][j] + B[i][j];
                System.out.print(C[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
