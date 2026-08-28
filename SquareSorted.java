import java.util.*;

public class SquareSorted {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get array size
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Get array elements
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] arr = new int[n];

        // Square each element
        for (int i = 0; i < n; i++) {
            arr[i] = nums[i] * nums[i];
        }

        // Sort the squared array
        Arrays.sort(arr);

        // Print result
        System.out.println(Arrays.toString(arr));
    }
}
