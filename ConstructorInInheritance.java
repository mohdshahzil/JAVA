class Base {
    int x;

    public Base() {
        System.out.println("I am a constructor from Base class");
    }

    public Base(int x) {
        System.out.println("I am an overloaded constructor from Base class");
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

}

class Derived extends Base {
    public Derived() {
        // super();
        super(10);
        System.out.println("I am a constructor from Derived class");
    }

    public Derived(int x) {
        System.out.println("I am an overloaded constructor from Derived class");
    }

    int y;

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
}

public class ConstructorInInheritance {
    public static void main(String[] args) {
        Derived obj = new Derived(20);
        // obj.setX(5);
        // System.out.println(obj.getX());

    }
}
