import java.util.*;

public class WiggleSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get array size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Get array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Make a copy
        int[] temp = nums.clone();

        // Sort the copy
        Arrays.sort(temp);

        int left = (n - 1) / 2;
        int right = n - 1;

        // Wiggle sort
        for (int i = 0; i < n; i++) {

            if (i % 2 == 0) {
                nums[i] = temp[left];
                left--;
            } 
            else {
                nums[i] = temp[right];
                right--;
            }
        }

        // Print result
        System.out.println("Wiggle sorted array:");
        System.out.println(Arrays.toString(nums));
    }
}