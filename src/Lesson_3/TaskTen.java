package Lesson_3;

import java.util.Scanner;

public class TaskTen {
    public void taskTen(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну массива");
        int len = scanner.nextInt();
        System.out.println("Введите значение массива");
        int initialValue = scanner.nextInt();
        int array[] = new int[len];
        for (int i = 0; i<len; i++){
            array[i] = initialValue;
            System.out.print(array[i] + " ");
        }
    }
}
