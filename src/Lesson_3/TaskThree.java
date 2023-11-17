package Lesson_3;

import java.util.Scanner;

public class TaskThree {
    public void taskThree(){
        System.out.println("Введите целое число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a>=0){
            System.out.println("Введенное число положительное ");
        }
        else {
            System.out.println("Введенное число отрицательное");
        }
    }
}
