import java.util.*;

public class mergesort {

    static void merge(int[] arr, int l, int r) {

        if (l >= r) {
            return;
        }

        int mid = l + (r - l) / 2;

        merge(arr, l, mid);
        merge(arr, mid + 1, r);

        mergesort(arr, l, mid, r);
    }

    static void mergesort(int[] arr, int l, int mid, int r) {

        int[] k = new int[r - l + 1];

        int h = 0;
        int i = l;
        int j = mid + 1;

        while (i <= mid && j <= r) {

            if (arr[i] <= arr[j]) {
                k[h++] = arr[i];
                i++;
            } else {
                k[h++] = arr[j];
                j++;
            }
        }

        while (i <= mid) {
            k[h++] = arr[i];
            i++;
        }

        while (j <= r) {
            k[h++] = arr[j];
            j++;
        }

        for (i = l, h = 0; i <= r; i++, h++) {
            arr[i] = k[h];
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Enter size
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Enter array elements
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Merge Sort
        merge(nums, 0, n - 1);

        // Print sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}
