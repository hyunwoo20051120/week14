import java.io.*;

public class BufferedFileCopy {
    public static void main(String[] args) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("source.txt"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("destination.txt"))) {

            int data;
            while ((data = bis.read()) != -1) {
                System.out.print((char) data);
                bos.write(data);
            }
            System.out.println("File copied with buffering!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}