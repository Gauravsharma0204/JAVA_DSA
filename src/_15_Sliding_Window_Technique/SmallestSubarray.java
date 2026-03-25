package _15_Sliding_Window_Technique;

public class SmallestSubarray {

    public static int smallestSubWithSum(int a[], int n, int x){
        int windowStart = 0;
        int windowEnd = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;
        int len = 0;

        while (windowEnd < n){
            sum += a[windowEnd];

            if(sum > x){
                len = windowEnd - windowStart + 1;
                minLen = Math.min(minLen, len);

                while (windowStart < windowEnd && sum > x){
                    sum -= a[windowStart];
                    windowStart++;

                    if(sum > x){
                        len = windowEnd - windowStart + 1;
                        minLen = Math.min(minLen, len);
                    }
                }
            }
            windowEnd++;
        }
        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
    }

    public static void main(String[] args) {

        int arr[] = {1, 4, 45, 6, 0, 19};
        int x = 51;

        int n = arr.length;

        int result = smallestSubWithSum(arr, n, x);

        System.out.println("Smallest subarray length with sum > " + x + " is: " + result);
    }
}