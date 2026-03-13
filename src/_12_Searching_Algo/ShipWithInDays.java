package _12_Searching_Algo;

public class ShipWithInDays {

    void main(){

    }

    public int shipWithinDays(int weightd[], int days){
        int start = Integer.MIN_VALUE;
        int end = 0;
        for(int w : weightd){
            start = Math.max(start, w);
            end = end + w;
        }
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(isShipmentPossible(weightd, mid, days)){
                ans = mid;
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return ans;
    }

    private boolean isShipmentPossible(int[] weightd,int capacity, int days){
        int d = 1;
        int count = 0;
        for(int w : weightd){
            count += w;
            if(count > capacity){
                d++;
                count = w;
            }
            if(d > days) {
                return false;
            }
        }
        return true;
    }

}

