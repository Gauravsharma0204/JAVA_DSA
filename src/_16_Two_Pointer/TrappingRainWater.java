package _16_Two_Pointer;

public class TrappingRainWater {

    public static int trap(int[] height){
        int n = height.length;
        int leftMax = 0;
        int rightMax = 0;
        int l = 0;
        int r = n - 1;
        int ans = 0;

        while (l < r){

            leftMax = Math.max(leftMax, height[l]);
            rightMax = Math.max(rightMax, height[r]);

            if(leftMax < rightMax){
                ans += leftMax - height[l];
                l++;
            } else {
                ans += rightMax - height[r];
                r--;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {4,2,0,3,2,5};
        System.out.println(trap(arr)); // Output: 9
    }
}