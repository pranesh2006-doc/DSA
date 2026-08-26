import java.util.HashMap;
import java.util.Scanner;

public class ContainsDuplicates {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            // Check if number already exists
            if (map.containsKey(nums[i])) {

                // Check distance between current and previous index
                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            }

            // Store the latest index of the number
            map.put(nums[i], i);
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get array size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        // Create array
        int[] nums = new int[n];

        // Get array elements
        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Get k
        System.out.print("Enter k: ");
        int k = sc.nextInt();

        // Call method
        boolean result = containsNearbyDuplicate(nums, k);

        // Print result
        System.out.println("Result: " + result);

        sc.close();
    }
}