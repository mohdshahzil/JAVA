import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("old.txt");
            FileOutputStream fos = new FileOutputStream("new.txt");
            int data = fis.read();
            while (data != -1) {
                fos.write(data);
                data = fis.read();
            }
            fis.close();
            fos.close();

        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("IO Exception: " + e.getMessage());
        }

    }
}
