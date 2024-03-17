package ru.mpei;

public class YuanConverter implements Converter{
    private final String type = "Yuan";
    private final double rate = 14;

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
