package _14_Matrix;

public class Rotate {
    void main(){
        int[][] matrix = {{1,1,1,1},
                {2,2,2,2},
                {3,3,3,3},
                {4,4,4,4}};

        int n = matrix.length;
        System.out.println("Before Transpose Matrix ");
        printArray(matrix);

        System.out.println("After Transpose Matrix ");
        rotateClockwise(matrix);
        printArray(matrix);
    }

    static void printArray(int matrix[][]){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void rotateClockwise(int matrix[][]){
        int n = matrix.length;
        transpose(matrix, n);

//      Reverse Rows
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;

            }
        }
    }

    static void swap(int matrix[][], int i, int j){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }

    static void transpose(int matrix[][], int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                swap(matrix, i, j);
            }
        }
    }



}
