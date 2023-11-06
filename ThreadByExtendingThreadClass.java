class Thread1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 40000) {

            System.out.println("Cooking");
            i++;
        }
    }
}

class Thread2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 40000) {

            System.out.println("Chatting");
            i++;
        }
    }
}

public class ThreadByExtendingThreadClass {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();

    }
}
