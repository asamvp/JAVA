package Seminar1;

import java.util.Scanner;

public class Program {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean f = true;
        while (f) {
            System.out.println("\nУкажите номер задачи:");
            System.out.println("1- Задача 1");
            System.out.println("2- Задача 2");
            System.out.println("3- Задача 3");
            System.out.println("0- Выход"); 
            int   no = Integer.parseInt(scanner.nextLine());
            switch (no) {
                case 1:
                    printName();
                    break;
                case 2:
                    task2();
                    break;
                case 3:
                    task3("Добро пожаловать");
                    break;
                case 0:
                    System.out.println("Досвиданья");
                    f = false;
                    break;
                default:
                    System.out.println("номер некорректен");
                    break;
            }
        }
    }

    static void printName() {

        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();
        System.out.println("Привет " + name + "!");
    }

    static void task3(String str) {
        String[] words = str.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.printf("%s ", words[i]);
        }

    }

    static void task2() {
        // int[] array = new int[5];
        int counter = 0;
        int max = 0;
        int[] array1 = { 1, 0, 0, 1, 1, 1, 0, 1 };
        for (int e : array1) {
            if (e == 1)
                counter++;
            else {
                if (counter > max)
                    max = counter;
                counter = 0;
            }
        }
        System.out.printf("Максимальное количество подряд идущих единиц: %d\n", max);
    }
}
