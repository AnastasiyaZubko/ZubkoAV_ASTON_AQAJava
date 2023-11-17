package Lesson_3;

public class TaskSix {
    public void taskSix(){
        int[] array = new int[10];
        int i;
        System.out.println("Исходный массив");
        for (i = 0; i< 10; i++) {
            int minValue = 0;
            int maxValue = 1;
            array[i] = (minValue + (int) (Math.random() * ((maxValue - minValue) + 1)));
            System.out.print(array[i]);}
        System.out.println();
        System.out.println("Преобразованный массив");
                for (i=0; i<10; i++){
                if (array[i]==1){
                    array[i]=0;
                }
                else if (array[i]==0) {
                    array[i]=1;
                }
                System.out.print(array[i]);}
        System.out.println();
    }
                }


