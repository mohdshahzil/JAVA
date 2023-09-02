import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.println("Taking Input");
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter number 1");
        // int a = sc.nextInt();
        // System.out.println("Enter float number : ");
        // float b = sc.nextFloat();
        // System.out.println(b);
        // System.out.println("Taking String as input");
        // String str = sc.next();
        // System.out.println(str);
        System.out.println("Taking whole line as input");
        String line = sc.nextLine();
        System.out.println(line);

    }

}
