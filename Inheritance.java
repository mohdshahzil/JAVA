class Base {
    public int x;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

}

class Derived extends Base {
    public int y;

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Derived obj = new Derived();
        obj.setX(5);
        System.out.println(obj.getX());

    }

}
