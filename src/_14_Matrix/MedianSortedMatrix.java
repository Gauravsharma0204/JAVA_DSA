package _14_Matrix;

public class MedianSortedMatrix {

    public static void main(String[] args) {
        int matrix[][] = {
                {1, 3, 5},
                {2, 6, 9},
                {3, 6, 9}
        };

        int R = matrix.length;
        int C = matrix[0].length;

        int ans = median(matrix, R, C);
        System.out.println("Median is: " + ans);
    }


    static int median(int matrix[][], int R, int C){
        int N = R*C;
        int medianIndex = N/2;
        int start = 1;
        int end = 2000;

        while (start<=end){
            int assumedMid = start + (end-start) / 2;
            int lesserElement = findSmallerElement(matrix, assumedMid);
            if(lesserElement <= medianIndex){
                start = assumedMid + 1;
            } else {
                end = assumedMid - 1;
            }
        }
        return start;
    }

    static int findSmallerElement(int matrix[][], int assumedMid){
        int noOfSmallerElements = 0;

        for (int i = 0; i < matrix.length; i++){
            int start = 0;
            int end = matrix[i].length-1;
            while (start <= end){
                int mid = start + (end - start) / 2;
                if(matrix[i][mid] <= assumedMid){
                    start = mid+1;
                } else {
                    end = mid-1;
                }
            }
            noOfSmallerElements += start;
        }
        return noOfSmallerElements;
    }
}
