package Lesson_3;

import java.util.Scanner;

public class TaskOne {
    public void taskOne(){
        boolean c;
        c = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число a");
        int a = scanner.nextInt();
        System.out.println("Введите целое число b");
        int b = scanner.nextInt();
        System.out.println(((a+b)>=10) & ((a+b)<=20));
    }
}
