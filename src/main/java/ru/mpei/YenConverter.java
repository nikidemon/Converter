package ru.mpei;

public class YenConverter implements Converter{
    private final String type = "Yen";
    private final double rate = 10;

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
