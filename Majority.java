 import java.util.*;

class Majority {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get array size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        // Create array
        int[] nums = new int[n];

        // Get array elements
        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Create HashMap
        HashMap<Integer, Integer> map = new HashMap<>();

        // Find majority element
        for (int i = 0; i < nums.length; i++) {

            // Count frequency
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            // Check majority
            if (map.get(nums[i]) > n / 2) {
                System.out.println("Majority Element: " + nums[i]);
                return;
            }
        }

        System.out.println("No majority element exists.");

        sc.close();
    }
}