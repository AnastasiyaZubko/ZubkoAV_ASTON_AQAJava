package Lesson_3;

import java.util.Scanner;

public class TaskFive {
    public void taskFive(){
        System.out.println("Введите год");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        boolean b;
        b = true;
        System.out.println((year%4==0) & (year%100!=0) | (year%400==0));
        }
        }

