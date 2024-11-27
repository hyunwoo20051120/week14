import java.util.ArrayList;
import java.util.Random;

public class assignment {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<String> list = new ArrayList<>();

        for (int i = 1; i < 7; i++){
            list.add(rand.nextInt(99)+"");
        }
    System.out.println(list);
    }
}