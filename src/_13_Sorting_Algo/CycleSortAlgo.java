package _13_Sorting_Algo;

import javax.swing.*;

public class CycleSortAlgo {
    void main(){
        int arr[] = {10,15,10,10,19,18,16,20};
        CycleSortAlgo cs = new CycleSortAlgo();
        int res[] = cs.cycleSort(arr);
        for(int ans : res){
            System.out.print(ans + " ");
        }
    }

    private int[] cycleSort(int arr[]){
        int n = arr.length;
        for (int c = 0; c < n-1; c++){
            int elemnt = arr[c];
            int pos = c;

            for (int i = c+1; i < n; i++){
                if(arr[i] < elemnt){
                    pos++;
                }
            }

            if (pos == c) continue;

            while (elemnt == arr[pos]){
                pos++;
            }

            if(pos != c){
                int temp = arr[pos];
                arr[pos] = elemnt;
                elemnt = temp;
            }

            while (pos != c){
                pos = c;

                for (int i = c+1; i < n; i++){
                    if(arr[i] < elemnt){
                        pos++;
                    }
                }

                while (elemnt == arr[pos]){
                    pos++;
                }

                int temp = arr[pos];
                arr[pos] = elemnt;
                elemnt = temp;

            }
        }
        return arr;
    }
}
