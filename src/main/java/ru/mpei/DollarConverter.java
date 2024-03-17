package ru.mpei;

public class DollarConverter implements Converter{
    private final String type = "USD";
    private final double rate = 74.5;

    public double convertToRub(double currency) {
        return currency * rate;
    }

    public double convertToCurrency(double rub) {
        return rub / rate;
    }

    public String getType() {
        return type;
    }
}
