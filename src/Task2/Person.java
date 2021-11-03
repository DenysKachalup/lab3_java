package Task2;

import Task1.MyException;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Person implements Closeable {
    String name;

    public Person(String name) {
        this.name = name;
        validate();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        validate();
    }
    public void validate() {

        if (name.matches(".*\\d+.*") || name.matches(".*\\s+.*") || !name.matches(".+")) {
            throw new MyException("Incorrectly name");
        }
    }

    @Override
    public void close() throws IOException {

    }
}