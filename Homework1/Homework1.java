package Homework1;

import java.util.Scanner;

public class Homework1 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean f = true;
        while (f) {
            System.out.println("\nУкажите номер задачи:");
            System.out.println("1- Задача 1");
            System.out.println("2- Задача 2");
            System.out.println("0- Выход");
            int no = Integer.parseInt(scanner.nextLine());
            System.out.println("\n");
            switch (no) {
                case 1:
                    task1();
                    break;
                case 2:
                    task2();
                    break;
                case 0:
                    System.out.println("Досвиданья");
                    f = false;
                    break;
                default:
                    System.out.println("Номер некорректен");
                    break;
            }
        }
    }

    /*
     * 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n!
     * (произведение чисел от 1 до n)
     */

    static void task1() {
        System.out.println("Введите число");
        int x = Integer.parseInt(scanner.nextLine());
        int y = (x * (x + 1)) / 2;
        System.out.printf("Треугольное число от %d равно %d", x, y);
        System.out.println("\n");
    }

    /* 2) Вывести все простые числа от 1 до 1000 */

    static void task2() {
        int count = 0;
        for (int i = 1; i < 1000; i++) {
            if (isPrime(i)) {
                System.out.print(i + "\t");
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }

    }

    static boolean isPrime(int i) {
        boolean t = false;
        if (i == 2) {
            t = true;
        }
        for (int j = 2; j < i; j++) {
            if (j == (i - 1)) {
                t = true;
            }
            if ((i % j) == 0) {
                break;
            }
        }
        return t;
    }

}
