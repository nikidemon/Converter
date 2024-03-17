package ru.mpei;

public class Main {
    public static void main(String[] args) {
        Exchanger exchanger = new Exchanger();
        double result = exchanger.convert(400, "Yen", "Yuan");
        System.out.println(result);
    }
}
