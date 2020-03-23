package ro.fasttrackit.curs16;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static java.lang.Integer.MAX_VALUE;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("WHEN I add two positive integers THEN their sum is returned")
    void addingTwoPositive() {
        //SETUP
        var calculator = new Calculator();
        //RUN
        var result = calculator.add(1, 2);
        //ASSERT
        assertThat(result).isEqualTo(3);
    }

    @Test
    @DisplayName("WHEN I add a positive and a negative number THEN their difference is returned")
    void addingPositiveAndNegative() {
        //SETUP
        var calculator = new Calculator();
        //RUN
        var result = calculator.add(1, -1);
        //ASSERT
        assertThat(result).isEqualTo(0);
    }

    @Test
    @DisplayName("WHEN adding a number to the max integer THEN throw exception")
    void addingToMaxInteger() {
        //SETUP

        //RUN + ASSERT
        assertThrows(IllegalArgumentException.class, () -> calculator.add(MAX_VALUE, 10));

    }

    @Test
    @DisplayName("WHEN adding two max integer THEN throw exception")
    void addingTwoMaxInteger() {
        //SETUP

        //RUN + ASSERT
        assertThrows(IllegalArgumentException.class, () -> calculator.add(MAX_VALUE, MAX_VALUE));

    }

    @Test
    @DisplayName("WHEN I subtract two positive integers THEN their difference is returned")
    void subtractTwoPositive() {
        //SETUP

        //RUN
        var result = calculator.subtract(1, 1);

        //ASSERT
        assertThat(result).isEqualTo(0);
    }

    @Test
    @DisplayName("WHEN I subtract from -MAX_INT THEN exception is thrown")
    void subtractMinusMaxInt() {
        //SETUP

        //RUN
        try {
            calculator.subtract(-MAX_VALUE, 10);
            Assertions.fail("Should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException iae) {
            assertTrue(true);
        }
    }

    @Test
    @DisplayName("WHEN a number is multiplied by 1 THEN that number is returned")
    void multiplyPositiveBy1() {
        //SETUP

        //RUN
        var result = calculator.multiply(7, 1);

        //ASSERT
        assertThat(result).isEqualTo(7);
    }

    @Test
    @DisplayName("WHEN two numbers are multiplied THEN their multiplication is returned")
    void multiplyPositive() {
        //SETUP

        //RUN
        var result = calculator.multiply(7, 7);

        //ASSERT
        assertThat(result).isEqualTo(49);
    }

    @Test
    @DisplayName("WHEN two numbers are multiplied THEN their multiplication is returned")
    void multiplyMaxInt() {
        //SETUP

        //RUN + ASSERT
        assertThrows(IllegalArgumentException.class, () -> calculator.multiply(MAX_VALUE, 7));
    }
}