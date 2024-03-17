package ru.mpei;

public class RubConverter implements Converter{
    private final String type = "RUB";
    private final double rate = 1;

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
