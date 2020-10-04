package enums.temperatureConverter;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        System.out.println(TemperatureConverter.CELSIUS.toFahrenheit(BigDecimal.valueOf(-2)));
    }
}
