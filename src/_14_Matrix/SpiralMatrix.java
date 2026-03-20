package _14_Matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        SpiralMatrix obj = new SpiralMatrix();
        List<Integer> result = obj.spiralOrder(matrix);

        System.out.println("Spiral Order:");
        System.out.println(result);
    }

    public List<Integer> spiralOrder(int[][] matrix){
        List<Integer> result = new ArrayList<>();

        int n = matrix.length;
        int m = matrix[0].length;

        int startRow = 0, endRow = n - 1;
        int startCol = 0, endCol = m - 1;

        while (startRow <= endRow && startCol <= endCol){

            // First Row
            for(int j = startCol; j <= endCol; j++){
                result.add(matrix[startRow][j]);
            }
            startRow++;

            // End Column
            for(int i = startRow; i <= endRow; i++){
                result.add(matrix[i][endCol]);
            }
            endCol--;

            // Last Row
            if(startRow <= endRow){
                for(int j = endCol; j >= startCol; j--){
                    result.add(matrix[endRow][j]);
                }
                endRow--;
            }

            // First Column
            if(startCol <= endCol){
                for(int i = endRow; i >= startRow; i--){
                    result.add(matrix[i][startCol]);
                }
                startCol++;
            }
        }

        return result;
    }
}