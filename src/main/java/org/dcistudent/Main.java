package org.dcistudent;

import java.util.ArrayList;
import java.util.List;
import org.dcistudent.Models.Person;

public class Main {
    List<Person> persons = new ArrayList<>();

    /**
     * Main method.
     *
     * @param args Main method arguments
     */
    public static void main(String[] args) {
        Main main = new Main();
        StringBuilder sb = new StringBuilder();

        System.out.println("-------------------------");
        System.out.println("+++ We are all humans +++");
        System.out.println("-------------------------");

        main.persons.forEach(person -> sb
            .append(person.getName())
            .append(" is a ")
            .append(person.getJob())
            .append(" and is ")
            .append(person.getAge())
            .append(" years old.\n")
        );

        System.out.println(sb);
    }

    /**
     * Constructor.
     */
    public Main() {
        this.addPerson(new Person().setName("Alice").setAge(25).setJob("Software Engineer"));
        this.addPerson(new Person().setName("Bob").setAge(30).setJob("Doctor"));
        this.addPerson(new Person().setName("Charlie").setAge(35).setJob("Teacher"));
        this.addPerson(new Person().setName("David").setAge(40).setJob("Lawyer"));
        this.addPerson(new Person().setName("Eve").setAge(45).setJob("Nurse"));
    }

    /**
     * Add a person to the list.
     *
     * @param person Add a person
     */
    public void addPerson(Person person) {
        this.persons.add(person);
    }

    /**
     * Remove a person by object.
     *
     * @param person Remove a person by object
     */
    public void removePerson(Person person) {
        this.persons.remove(person);
    }

    /**
     * Remove a person by index.
     *
     * @param index Remove a person by index
     */
    public void removePerson(int index) {
        this.persons.remove(index);
    }

    /**
     * Get a person by index.
     *
     * @param index Get a person by index
     * @return Person
     */
    public Person getPerson(int index) {
        return this.persons.get(index);
    }

    /**
     * Get a person by name.
     *
     * @param name Get a person by name
     * @return Person
     */
    public Person getPerson(String name) {
        for (Person person : this.persons) {
            if (person.getName().equals(name)) {
                return person;
            }
        }

        throw new IllegalArgumentException("Person not found");
    }

    /**
     * Get all persons.
     *
     * @return List<Person>
     */
    public List<Person> getPersons() {
        return this.persons;
    }
}