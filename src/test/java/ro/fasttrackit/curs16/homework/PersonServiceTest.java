package ro.fasttrackit.curs16.homework;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class PersonServiceTest {

    @Test
    @DisplayName("WHEN the first person is added THEN the person is returned")
    public void addFirstPersonTest() {
        //SETUP
        Person person = new Person(1, "Adi", 40);
        PersonService personService = new PersonService();
        //RUN
        Person result = personService.addPerson(person);
        //ASSERT
        assertThat(result.getId()).isEqualTo(1);
    }

    @Test
    @DisplayName("WHEN more persons are added THEN the person ID is returned correctly")
    public void addPersonTest() {
        //SETUP
        List<Person> initialList = List.of(
                new Person(1, "Adi", 40),
                new Person(2, "Adi 2", 40),
                new Person(3, "Adi 3", 40),
                new Person(4, "Adi 4", 40),
                new Person(5, "Adi 5", 40)
        );
        Person person = new Person(1, "Adi", 40);
        PersonService personService = new PersonService(initialList);
        //RUN
        Person result = personService.addPerson(person);
        //ASSERT
        assertThat(result.getId()).isEqualTo(6);
    }
}