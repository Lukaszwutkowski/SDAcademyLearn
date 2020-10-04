package enums.temperatureConverter;

import java.math.BigDecimal;

public enum TemperatureConverter {

    CELSIUS, FAHRENHEIT, KELVIN;

    private BigDecimal freezingPoint;

    private BigDecimal boilingPoint;

    private static final BigDecimal FIVE = new BigDecimal("5");
    private static final BigDecimal NINE = new BigDecimal("9");
    private static final BigDecimal THIRTY_TWO = new BigDecimal("32");
    private static final BigDecimal KELVIN_CELSIUS_DELTA = new BigDecimal("273");
    private static final BigDecimal RANKINE_FAHRENHEIT_DELTA = new BigDecimal("459.67");


    public BigDecimal getFreezingPoint() {
        return this.freezingPoint;
    }

    public BigDecimal getBoilingPoint() {
        return this.boilingPoint;
    }

    public BigDecimal toFahrenheit(final BigDecimal sourceMeasure) {
        BigDecimal fahrenheit = null;
        switch (this) {
            case CELSIUS:
                fahrenheit = sourceMeasure.multiply(NINE).divide(FIVE).add(THIRTY_TWO);
                break;
            case FAHRENHEIT:
                fahrenheit = sourceMeasure;
                break;
            case KELVIN:
                fahrenheit = (sourceMeasure.subtract(this.freezingPoint)).multiply(NINE).divide(FIVE).add(THIRTY_TWO);
                break;
        }
        return fahrenheit;
    }

    public BigDecimal toCelsius(final BigDecimal sourceMeasure) {
        BigDecimal celsius = null;
        switch (this) {
            case CELSIUS:
                celsius = sourceMeasure;
                break;
            case FAHRENHEIT:
                celsius = sourceMeasure.subtract(THIRTY_TWO).divide(NINE.divide(FIVE));
                break;
            case KELVIN:
                celsius = sourceMeasure.subtract(this.freezingPoint);
                break;
        }
        return celsius;
    }

    public BigDecimal toKelvin(final BigDecimal sourceMeasure) {
        BigDecimal kelvin = null;
        switch (this) {
            case CELSIUS:
                kelvin = sourceMeasure.add(this.freezingPoint);
                break;
            case FAHRENHEIT:
                kelvin = sourceMeasure.add(RANKINE_FAHRENHEIT_DELTA).divide(NINE.divide(FIVE));
                break;
            case KELVIN:
                kelvin = sourceMeasure;
                break;
        }
        return kelvin;
    }
}
