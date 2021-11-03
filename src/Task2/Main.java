package Task2;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try (Person person = new Person("N ame")) {
            System.out.println(person.getName());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
