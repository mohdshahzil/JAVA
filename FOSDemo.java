import java.io.*;

public class FOSDemo {
    public static void main(String[] args) {
        try {
            // Create a FileOutputStream for "abc.txt"
            FileOutputStream fos = new FileOutputStream("abc.txt");

            // Convert the string to bytes and write them to the file
            String data = "cars";
            byte[] bytes = data.getBytes();
            fos.write(bytes);

            // Close the FileOutputStream
            fos.close();

            System.out.println("Data written to abc.txt successfully.");
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("IO Exception: " + e.getMessage());
        }
    }
}
