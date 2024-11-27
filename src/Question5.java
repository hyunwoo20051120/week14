import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

class PersonQ5 implements Serializable {
    private String name;
    private int age;

    public PersonQ5(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "personQ5{name='" + name + '\'' + ", age=" + age + '}';
    }
}

public class Question5 {
}
