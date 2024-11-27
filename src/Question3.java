import java.io.*;

public class Question3 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        copyUsingStreams();
        long endTime = System.currentTimeMillis();
        System.out.println("Using stream time : " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        copyUsingStreams();
        endTime = System.currentTimeMillis();
        System.out.println("Using buffuring time : " + (endTime - startTime));
    }

    private static void copyUsingStreams() {
        try (FileInputStream fis = new FileInputStream("source.txt");
             FileOutputStream fos = new FileOutputStream("destination.txt")) {
            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void copyUsingBufferedStreams() {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("source.txt"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("destination.txt"))) {
            int data;
            while ((data = bis.read()) != -1) {
                bos.write(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

