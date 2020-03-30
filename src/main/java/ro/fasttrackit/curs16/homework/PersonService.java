package ro.fasttrackit.curs16.homework;

import java.util.ArrayList;
import java.util.List;

public class PersonService {
    private final List<Person> personList;

    public PersonService(List<Person> personList) {
        this.personList = new ArrayList<>();
        for (Person person : personList) {
            addPerson(person);
        }
    }

    public PersonService() {
        this(new ArrayList<>());
    }

    Person addPerson(Person person) {
        if (!person.getName().isBlank()) {
            person.setId(personList.size() + 1);
            personList.add(person);
        }
        return person;
    }

    Person removePerson(int id) {
        // gasesc persoana cu id id
        Person person = getPersonById(id);
        if (person == null) {
            throw new IllegalArgumentException("Persoana nu exista");
            // o sterg din lista
        } else {
            personList.remove(person);
        }
        // o returnez
        return person;
    }

    public Person getPersonById(int id) {
        for (Person person : personList) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    public Person getPerson(String name) {
        for (Person person : personList) {
            if (person.getName().equalsIgnoreCase(name)) {
                return person;
            }
        }
        return null;
    }

    public List<Person> getAllPersons() {
        for (Person person : personList) {
            new PersonService();
        }
        return personList;
    }
}
