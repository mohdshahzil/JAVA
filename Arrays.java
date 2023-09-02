public class Arrays {
    public static void main(String args[]) {
        // int [] marks = new int [5];

        int[] marks = { 100, 20, 30 };

        // for (int i : marks) {
        // System.out.println(i);
        // }

        // for (int i = 0; i < marks.length; i++) {
        // System.out.println(marks[i]);
        // }

        // System.out.println(marks.length);

        // float[] marks2 = { 1.0f, 2.0f, 3.0f };

        // String[] name = { "Harry", "Shubham", "Rohan" };
        // for (String i : name) {
        // System.out.println(i);
        // }

        // marks array in reverse order
        for (int i = marks.length - 1; i >= 0; i--) {
            System.out.println(marks[i]);
        }

    }
}
