import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {

    static ArrayList<Float> bucketSort(float arr[]) {

        int n = arr.length;

        // Create buckets
        ArrayList<Float>[] buckets = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }

        // Put elements into buckets
        for (int i = 0; i < n; i++) {
            int index = (int)(arr[i] * n);
            buckets[index].add(arr[i]);
        }

        // Sort each bucket
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }

        // Merge all buckets into result list
        ArrayList<Float> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (float val : buckets[i]) {
                result.add(val);
            }
        }

        return result; // ✅ returning result
    }

    public static void main(String[] args) {

        float arr[] = {0.42f, 0.32f, 0.23f, 0.52f, 0.25f};

        ArrayList<Float> sorted = bucketSort(arr);

        System.out.println(sorted);
    }
}