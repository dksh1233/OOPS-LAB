package Lab8.Serializable_lab8;
import java.io.Serializable;
import java.io.*;


public class PersonSerializable {
    public static void main(String[] args) {
        String fileName = "person.txt";

        // Create a Person object
        Person person = new Person("Alice", 25);

        // Serialize the object
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
            out.writeObject(person);
            System.out.println(" Person object serialized to '" + fileName + "'");
        } catch (IOException e) {
            System.out.println(" Error: Unable to serialize the object.");
        }

        // Deserialize the object
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
            Person deserializedPerson = (Person) in.readObject();
            System.out.println("\n Deserialized Person Object:");
            deserializedPerson.display();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(" Error: Unable to deserialize the object.");
        }
    }
}

