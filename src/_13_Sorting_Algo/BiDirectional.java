package _13_Sorting_Algo;

public class BiDirectional {
    public static void main(String[] args) {
        int arr[] = {64, 25, 12, 22, 11};

        biDirectionSort(arr);

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void biDirectionSort(int arr[]) {
        boolean swapped = true;
        int start = 0;
        int end = arr.length - 1;

        while(swapped) {
            swapped = false;

            // Left to Right
            for(int i = start; i < end; i++) {
                if(arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }

            if(!swapped) break;

            swapped = false;
            end--;

            // Right to Left
            for(int i = end; i > start; i--) {
                if(arr[i] < arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    swapped = true;
                }
            }

            start++;
        }
    }
}