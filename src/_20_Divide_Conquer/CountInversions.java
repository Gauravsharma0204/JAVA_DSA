class CountInversions {

    static int mergeSort(int arr[], int l, int r) {
        int count = 0;

        if (l < r) {
            int mid = l + (r - l) / 2;

            count += mergeSort(arr, l, mid);
            count += mergeSort(arr, mid + 1, r);
            count += merge(arr, l, mid, r);
        }

        return count;
    }

    static int merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int left[] = new int[n1];
        int right[] = new int[n2];

        for (int i = 0; i < n1; i++)
            left[i] = arr[l + i];

        for (int j = 0; j < n2; j++)
            right[j] = arr[m + 1 + j];

        int i = 0, j = 0, k = l;
        int invCount = 0;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
                
                // 🔥 KEY LINE
                invCount += (n1 - i);
            }
        }

        while (i < n1)
            arr[k++] = left[i++];

        while (j < n2)
            arr[k++] = right[j++];

        return invCount;
    }

    public static void main(String[] args) {
        int arr[] = {8, 4, 2, 1};

        int result = mergeSort(arr, 0, arr.length - 1);

        System.out.println("Inversions = " + result);
    }
}