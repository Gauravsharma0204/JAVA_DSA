package _14_Matrix;

public class KthElementInSortedMatrix {

    public static void main(String[] args) {
        int matrix[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int ans = kthElement(matrix, 6);
        System.out.println("K th Element : " + ans);
    }



    static int kthElement(int matrix[][], int k){
        int R = matrix.length;
        int C = matrix[0].length;
        int N = R*C;
        int requiredSmallerElement = k-1;
        int start = matrix[0][0];
        int end = matrix[R-1][C-1];

        while (start<=end){
            int assumedMid = start + (end-start) / 2;
            int lesserElement = findSmallerElement(matrix, assumedMid);
            if(lesserElement <= requiredSmallerElement){
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
