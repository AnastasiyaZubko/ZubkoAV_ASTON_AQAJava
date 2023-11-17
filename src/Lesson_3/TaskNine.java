package Lesson_3;

public class TaskNine {
    public void taskNine(){
        int a = 10;
        int b = 10;
        int[][] array= new int[a][b];
        for (int i = 0; i<a;i++){
        array[i][i] =1;
        array[a-i-1][i]=1;
        }
            for (int i = 0; i<a; i++){
                 for (int j = 0; j<b;j++){
                     System.out.print(array[i][j]  + " ");
            }
            System.out.println();
                 }
    }
}
