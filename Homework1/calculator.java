package Homework1;

import java.util.Scanner;

public class calculator{
    /**
     * [3*] Реализовать простой калькулятор
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите операцию (+ - * /): ");
        char op = scanner.next().charAt(0);
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        switch (op) {
            case '+' -> System.out.println(a + " + " + b + " = " + add(a, b));
            case '-' -> System.out.println(a + " - " + b + " = " + minus(a, b));
            case '*' -> System.out.println(a + " * " + b + " = " + multi(a, b));
            case '/' -> System.out.println(a + " * " + b + " = " + divide(a, b));
            default -> System.out.println("Wrong operation!");
        }
    }

    private static int divide(int a, int b) {
        if (b != 0) return a / b;
        return -1;
    }

    private static int multi(int a, int b) {
        return a * b;
    }

    private static int minus(int a, int b) {
        return a - b;
    }

    private static int add(int a, int b) {
        return a + b;
    }
}    

