import java.io.File;

public class FileInfoExample {
    public static void main(String[] args) {
        File file = new File("input.txt");

        if (file.exists()) {
            System.out.println("File name: " + file.getName());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("File size: " + file.length() + " bytes");
            System.out.println("File path: " + file.getPath());
            System.out.println("File exists: " + file.exists());
        } else {
            System.out.println("File does not exist.");
        }
    }
}