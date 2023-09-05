import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        System.out.println("Enter a : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("Enter b : ");
        int b = sc.nextInt();
        try {
            double c = (float) a / b;
            System.out.println("The resutl is : " + c);

        } catch (Exception e) {
            System.out.println("We failed to divide. Reason : " + e);

        }

    }
}
