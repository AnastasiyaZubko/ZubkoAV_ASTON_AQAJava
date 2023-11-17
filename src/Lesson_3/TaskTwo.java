package Lesson_3;

import java.util.Scanner;

public class TaskTwo {
    public void taskTwo(){
        System.out.println("Введите строку");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        System.out.println("Введите число");
        int b = scanner.nextInt();
        int i;
        for(i=1; i<=b; i++){
            System.out.println(a);
        }
    }
}
