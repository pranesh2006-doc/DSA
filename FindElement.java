import java.util.*;

public class FindElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get array size
        int n = sc.nextInt();

        // Get array elements
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Get target
        int target = sc.nextInt();

        // Sort the array
        Arrays.sort(nums);

        // Create list
        List<Integer> list = new ArrayList<>();

        // Find target indices
        for (int i = 0; i < n; i++) {
            if (nums[i] == target) {
                list.add(i);
            }
        }

        // Print result
        System.out.println(list);
    }
}