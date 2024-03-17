package ru.mpei;

public interface Converter {
    double convertToRub(double currency);
    double convertToCurrency(double rub);
    String getType();
}
