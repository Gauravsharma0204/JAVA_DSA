package _16_Two_Pointer;

public class SeparateBlackAndWhiteBalls {

    public static void main(String[] args) {
        int arr[] = {1,0,1,0,1,0,0,1};

        separate(arr);

        for(int num : arr){
            System.out.print(num + " ");
        }

        System.out.println();
        System.out.println();


        String s = "11010";
        long result = minimumStep(s);
        System.out.println("Minimum swaps required: " + result);
    }

    static long minimumStep(String s){
        int n = s.length();
        int last = 0;
        int swapCount = 0;
        for (int i = 0; i < n; i++) {
            if(s.charAt(i) == '0'){
                swapCount += (i - last);
                last++;
            }
        }
        return swapCount;
    }

    static void separate(int arr[]){
        int left = 0;
        int right = arr.length - 1;

        while(left < right){

            if(arr[left] == 1 && arr[right] == 0){
                // swap
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            else if(arr[left] == 0){
                left++;
            }
            else if(arr[right] == 1){
                right--;
            }
        }
    }
}