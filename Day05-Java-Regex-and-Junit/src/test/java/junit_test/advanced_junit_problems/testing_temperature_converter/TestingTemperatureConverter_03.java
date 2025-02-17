package junit_test.advanced_junit_problems.testing_temperature_converter;
import junit.advanced_junit_problems.testing_temperature_converter.TemperatureConverter_03;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestingTemperatureConverter_03 {
    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32.0, TemperatureConverter_03.celsiusToFahrenheit(0), 0.01);
        assertEquals(212.0, TemperatureConverter_03.celsiusToFahrenheit(100), 0.01);
        assertEquals(-40.0, TemperatureConverter_03.celsiusToFahrenheit(-40), 0.01);
    }
    @Test
    void testFahrenheitToCelsius() {
        assertEquals(0.0, TemperatureConverter_03.fahrenheitToCelsius(32), 0.01);
        assertEquals(100.0, TemperatureConverter_03.fahrenheitToCelsius(212), 0.01);
        assertEquals(-40.0, TemperatureConverter_03.fahrenheitToCelsius(-40), 0.01);
    }
}
