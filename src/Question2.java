import java.io.*;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file path : ");
        String path = sc.nextLine();
        File file = new File(path);

        if (file.exists()) {
            System.out.println("File exists" + file.getName());
            System.out.println("Absolute path : " + file.getAbsolutePath());
            System.out.println("File size : " + file.length() + " bytes");
        }
        else {
            System.out.println("File does not exist");
        }
    }
}