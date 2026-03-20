package _14_Matrix;

public class SpiralMatrix2 {

    public static void main(String[] args) {

        int n = 3;

        int[][] result = generateMatrix(n);

        // Print matrix
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] generateMatrix(int n){

        int[][] matrix = new int[n][n];

        int startRow = 0, endRow = n - 1;
        int startCol = 0, endCol = n - 1;

        int num = 1;

        while(startRow <= endRow && startCol <= endCol){

            // ➡️ Left to Right
            for(int j = startCol; j <= endCol; j++){
                matrix[startRow][j] = num++;
            }
            startRow++;

            // ⬇️ Top to Bottom
            for(int i = startRow; i <= endRow; i++){
                matrix[i][endCol] = num++;
            }
            endCol--;

            // ⬅️ Right to Left
            if(startRow <= endRow){
                for(int j = endCol; j >= startCol; j--){
                    matrix[endRow][j] = num++;
                }
                endRow--;
            }

            // ⬆️ Bottom to Top
            if(startCol <= endCol){
                for(int i = endRow; i >= startRow; i--){
                    matrix[i][startCol] = num++;
                }
                startCol++;
            }
        }

        return matrix;
    }
}