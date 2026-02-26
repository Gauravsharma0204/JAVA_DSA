package _05_Array;

import java.util.Scanner;

public class MultiDArray {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);



        System.out.print("Enter the n : ");
        int n = sc.nextInt();
        System.out.print("Enter the n1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter the n2 : ");
        int n2 = sc.nextInt();

        int arr[][][] = new int[n][n1][n2];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n1; j++){
                for (int k = 0; k < n2; k++){
                    System.out.print("Enter the Elements : ");
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }
        System.out.println("Display the Elements : ");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n1; j++){
                for (int k = 0; k < n2; k++){
                    System.out.print(arr[i][j][k]+ " ");
                }
                System.out.println();
            }
            System.out.println();
        }


    }
}
