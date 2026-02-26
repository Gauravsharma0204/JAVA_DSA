package _05_Array;

import java.util.Scanner;

public class Array2D {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the Rows : ");
        int row = sc.nextInt();
        System.out.print("Enter the Cols : ");
        int col = sc.nextInt();

        int arr[][] = new int[row][col];

        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                System.out.print("Enter the Elements : ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Display the Elements : ");
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
