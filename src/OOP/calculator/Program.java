package OOP.calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        run();
    }

    static void run() {
        System.out.println("Вы зашли в наше приложение калькулятор!");
        System.out.println("Введите числа и операции через пробел, все вычисления выполняються последовательно без "
                        + "приоритета операций");
        Calculator.execute();
    }

}
