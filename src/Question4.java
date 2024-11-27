import java.io.*;

public class Question4 {
    public static void main(String[] args) {
    }

    private static void serialization(){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"))){
            Person person = (Person) ois.readObject();
            System.out.println("Deserialization object" + person);

            person.setName("Bob");

            try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"))){
                oos.writeObject(person);
                System.out.println("Serialization object" + person);
            }
        }
        catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    class Person implements Serializable {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{name='" + name + "', age=" + age + "}";
        }
    }
}
