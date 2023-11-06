public class Methods {
    static void greet() {
        System.out.println("Good Morning");
    }

    void greet2() {
        System.out.println("Good Evening");
    }

    int add(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        // greet();
        Methods obj = new Methods();
        obj.greet2();
        Methods s = new Methods();
        System.out.println(s.add(2, 3));

    }

}
