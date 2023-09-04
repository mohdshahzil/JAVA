public class Varargs {
    static int sum(int... arr) {
        // available as int [] arr
        int result = 0;
        for (int i : arr) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Varargs Tutorial");
        System.out.println(sum(2, 3, 4, 5));

    }
}
