package Lesson_2;

import java.util.Scanner;

public class TaskThree {
    public void printColor(){
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        if (value <= 0) {
            System.out.println("Красный");
        }
        else if (value > 0 & value <= 100) {
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }
    }
}
