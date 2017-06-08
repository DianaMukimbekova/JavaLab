package multiplication.arrays;
 import java.util.Scanner;
 import java.util.Random;
public class MultiplicationArrays {
    public static void main(String[] args) {
        int m;
        int n;
        int h;
        int k;  
          System.out.println("Введите количество строк первой матрицы m");
          Scanner scn1=new Scanner(System.in);
          m=scn1.nextInt();
          System.out.println("Введите количество столбцов первой матрицы n");
          Scanner scn2=new Scanner(System.in);
          n=scn2.nextInt();
          System.out.println("Введите количество строк второй матрицы h");
          Scanner scn3=new Scanner(System.in);
          h=scn3.nextInt();
          System.out.println("Введите количество столбцов второй матрицы k");
          Scanner scn4=new Scanner(System.in);
          k=scn4.nextInt();    
        int[][] firstArray = new int[m][n];
        int[][] secondArray = new int[h][k];
        int[][] resultArray = new int[m][k];
        Random rand=new Random();
         System.out.println("Первая матрица:");
            for (int i = 0; i < m; i++) 
                for (int j = 0; j < n; j++) 
                  firstArray[i][j]=rand.nextInt(10);
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) 
                  System.out.print(firstArray[i][j]+"   ");
                  System.out.println();  
            }
         System.out.println("Вторая матрица:");
            for (int i = 0; i < h; i++) 
                for (int j = 0; j < k; j++) 
                  secondArray[i][j]=rand.nextInt(10);
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < k; j++) 
                  System.out.print(secondArray[i][j]+"   ");
                  System.out.println();  
            }    
        if (h==n){
            System.out.println("Произведение матриц:");    
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < k; j++) {
                    for (int l = 0; l <n; l++) {
                      resultArray[i][j] += firstArray[i][l] * secondArray[l][j]; 
                    }
                }
            }
            for (int i = 0; i < resultArray.length; i++) {
                for (int j = 0; j < resultArray[0].length; j++) 
                  System.out.print(resultArray[i][j]+"   ");
                  System.out.println(); 
            }  
        } else {System.out.println("Произведение матриц не возможно, т.к. "
                 + "количество столбцов первой матрицы и строк второй матрицы не равны");
                }         
    }
}

    

