class Mythread1 extends Thread {
    public Mythread1(String name) {
        super(name);
    }

    public void run() {

        System.out.println("Cooking");

    }
}

class Mythread2 extends Thread {
    public Mythread2(String name) {
        super(name);
    }

    public void run() {

        System.out.println("Chatting");

    }
}

public class ThreadConstructors {
    public static void main(String[] args) {
        Mythread1 t1 = new Mythread1("Rahul");
        Mythread2 t2 = new Mythread2("Rohit");
        t1.start();
        t2.start();
        System.out.println("The id of the thread t1 is " + t1.getId());
        System.out.println("The name of the thread t1 is " + t1.getName());
        System.out.println("The id of the thread t2 is " + t2.getId());
        System.out.println("The name of the thread t2 is " + t2.getName());

    }
}
