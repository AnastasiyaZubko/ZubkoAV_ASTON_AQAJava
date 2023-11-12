package Lesson_2;

import java.util.Scanner;

public class SelectTask {
    public void selectTask(){
        TaskOne taskOne = new TaskOne();
        TaskTwo taskTwo = new TaskTwo();
        TaskThree taskThree = new TaskThree();
        TaskFour taskFour = new TaskFour();
        System.out.println("Введите номер задания");
        System.out.println("Введите 1 для вызова метода printThreeWords");
        System.out.println("Введите 2 для вызова метода checkSumSign");
        System.out.println("Введите 3 для вызова метода printColor");
        System.out.println("Введите 4 для вызова метода compareNumbers");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 1){
            taskOne.printThreeWords();
        }
        else if (number == 2){
            taskTwo.checkSumSign();
        }
        else if (number == 3){
            taskThree.printColor();
        }
        else if (number == 4){
            taskFour.compareNumbers();
        }
        else {
            System.out.print("Такого задания не существует. Повторите попытку\n");
        }
        System.out.print("\n");
        selectTask();
    }
}
