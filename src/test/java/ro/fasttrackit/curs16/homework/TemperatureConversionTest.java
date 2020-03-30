package ro.fasttrackit.curs16.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TemperatureConversionTest {
    @BeforeEach
    void setup() {
        var temperature = new TemperatureConversion();
    }

    @Test
    @DisplayName("WHEN positive Fahrenheit temperature is received THEN Celsius temperature is returned")
    public void whenPositiveFahrenheitTemperatureIsReceivedThenCelsiusTemperatureIsReturned() {
        //SETUP
        //RUN
        var result = TemperatureConversion.fahrenheitToCelsius(100);
        //ASSERT
        assertThat(result).isEqualTo(37.77777777777778);
    }

    @Test
    @DisplayName("WHEN ZERO Fahrenheit temperature is received THEN Celsius temperature is returned")
    public void whenZeroFahrenheitTemperatureIsReceivedThenCelsiusTemperatureIsReturned() {
        //SETUP
        //RUN
        var result = TemperatureConversion.fahrenheitToCelsius(0);
        //ASSERT
        assertThat(result).isEqualTo(-17.77777777777778);
    }

    @Test
    @DisplayName("WHEN negative Fahrenheit temperature is received THEN Celsius temperature is returned")
    public void whenNegativeFahrenheitTemperatureIsReceivedThenCelsiusTemperatureIsReturned() {
        //SETUP
        //RUN
        var result = TemperatureConversion.fahrenheitToCelsius(-40);
        //ASSERT
        assertThat(result).isEqualTo(-40);
    }

    @Test
    @DisplayName("WHEN positive Celsius temperature is received THEN Fahrenheit temperature is returned")
    public void whenPositiveCelsiusTemperatureIsReceivedThenFahrenheitTemperatureIsReturned() {
        //SETUP
        var cToF = new TemperatureConversion();
        //RUN
        var result = TemperatureConversion.celsiusToFahrenheit(100);
        //ASSERT
        assertThat(result).isEqualTo(212);
    }

    @Test
    @DisplayName("WHEN ZERO Celsius temperature is received THEN Fahrenheit temperature is returned")
    public void whenZeroCelsiusTemperatureIsReceivedThenFahrenheitTemperatureIsReturned() {
        //SETUP
        var cToF = new TemperatureConversion();
        //RUN
        var result = TemperatureConversion.celsiusToFahrenheit(0);
        //ASSERT
        assertThat(result).isEqualTo(32);
    }

    @Test
    @DisplayName("WHEN negative Celsius temperature is received THEN Fahrenheit temperature is returned")
    public void whenNegativeCelsiusTemperatureIsReceivedThenFahrenheitTemperatureIsReturned() {
        //SETUP
        var cToF = new TemperatureConversion();
        //RUN
        var result = TemperatureConversion.celsiusToFahrenheit(-40);
        //ASSERT
        assertThat(result).isEqualTo(-40);
    }

}