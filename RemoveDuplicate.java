import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get array size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Get array elements
        System.out.println("Enter sorted array elements:");
        for (int k = 0; k < n; k++) {
            nums[k] = sc.nextInt();
        }

        // Two pointers
        int i = 0;
        int j = 0;

        while (j < n) {

            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
            else {
                j++;
            }
        }

        int count = i + 1;

        // Print number of unique elements
        System.out.println("Number of unique elements: " + count);

        // Print modified array
        System.out.print("Array after removing duplicates: ");

        for (int k = 0; k < count; k++) {
            System.out.print(nums[k] + " ");
        }
    }
}