package OOP.calculator;

import java.util.Scanner;

public class Calculator {
    static void execute() {
        Operation operation =  new Operation();
        Scanner scanner = new Scanner(System.in);
        String calculations = scanner.nextLine();
        String[] array = calculations.split(" ");

        int a = Integer.parseInt(array[0]);
        int b = Integer.parseInt(array[2]);
        int result = operation.perform(array[1], a, b);


        for (int i = 2; i < array.length - 1; i = i + 2) {
            int c = Integer.parseInt(array[i + 2]);
            result = operation.perform(array[i + 1], result, c);
        }

        System.out.println(calculations + " = " + result);




    }
}
