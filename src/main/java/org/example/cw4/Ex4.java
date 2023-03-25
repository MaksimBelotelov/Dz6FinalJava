package org.example.cw4;

// Напишите интерфейс Converter для конвертации из градусов по Цельсию в
// градусы по Фаренгейту и Кельвины. У классов-наследников необходимо
// переопределить метод интерфейса для валидного перевода величин.

import org.example.cw4.model.Farenheit;
import org.example.cw4.model.Kelvin;

public class Ex4 {
    public static void main(String[] args) {
        Double tCelsius = 0.0;
        Double tFar = new Farenheit().convert(tCelsius);
        Double tKel = new Kelvin().convert(tCelsius);
        System.out.println(tFar);
        System.out.println(tKel);
    }
}
