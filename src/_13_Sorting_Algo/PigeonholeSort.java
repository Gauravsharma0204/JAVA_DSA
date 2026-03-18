package _13_Sorting_Algo;

import javax.swing.plaf.PanelUI;

public class PigeonholeSort {

    public static void main(String[] args) {
        int arr[] = {64, 25, 12, 22, 11};

        pigeonHoleSort(arr);

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void pigeonHoleSort(int arr[]){
        int n = arr.length;
        int maxEl = Integer.MIN_VALUE;
        int minEl = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            if(arr[i] > maxEl){
                maxEl = arr[i];
            }
            if(arr[i] < minEl){
                minEl = arr[i];
            }
        }
        if (maxEl == Integer.MIN_VALUE){
            System.out.println("Empyt Array ");
            return;
        }
        int size = maxEl - minEl + 1;
        int pigeonHole[] = new int[size];

        for (int i = 0; i < n; i++){
            int index = arr[i] - minEl;
            pigeonHole[index]++;
        }

        int insertionIndex = 0;
        for (int j = 0; j < size; j++){
            while (pigeonHole[j] > 0){
                arr[insertionIndex] = j + minEl;
                insertionIndex++;
                pigeonHole[j]--;
            }
        }
    }
}
