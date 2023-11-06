import java.io.*;

public class FileDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("abc.txt");
            int i = fis.read();
            while (i != -1) {
                System.out.print((char) i);
                i = fis.read();
            }
            fis.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("IO Exception: " + e.getMessage());
        }
    }
}
