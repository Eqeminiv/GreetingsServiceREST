package hello;

import java.util.ArrayList;
import java.util.List;

public class Person {

    static List<Person> personList = new ArrayList<Person>();


    private final long id;
    private final String firstName, lastName;


    public Person(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        personList.add(this);
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
