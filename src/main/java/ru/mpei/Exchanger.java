package ru.mpei;


public class Exchanger {
    private Converter[] converters;

    public Exchanger() {
        converters = new Converter[]{new DollarConverter(), new YuanConverter(), new YenConverter(), new RubConverter()};
    }

    public double convert(double value, String input, String output) {
        double rub = 0;
        for (Converter converter : converters) {
            if (converter.getType().equals(input)) {
                rub = converter.convertToRub(value);
            }
        }

        double result = 0;
        for (Converter converter : converters) {
            if (converter.getType().equals(output)) {
                result = converter.convertToCurrency(rub);
            }
        }

        return result;
    }

}
