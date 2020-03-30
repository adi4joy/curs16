package ro.fasttrackit.curs16.homework;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PersonTest {

    @Test
    @DisplayName("WHEN the person has a name THEN the person can be created")
    public void personWithNameNotNull() {
        //SETUP
        Person person = new Person(1, "Adi", 40);
        //RUN
        String result = person.getName();
        //ASSERT
//        assertThat(person.getName().length()>0);
        assertThat(result).isNotNull();
    }

    @Test
    @DisplayName("WHEN the person has no name THEN the person cannot be created")
    public void personWithNoName() {
        //SETUP
        Person person = new Person(1, "", 40);
        //RUN
        String result = person.getName();
        //ASSERT
        assertThat(result.length() > 5);
    }
}