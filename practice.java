import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + (int) (i + 1) + " th element : ");
            Scanner ele = new Scanner(System.in);
            arr[i] = ele.nextInt();
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}