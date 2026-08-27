import java.util.*;

public class Kthelement {

    public static int[] topKFrequent(int[] nums, int k) {

        // Step 1: Count frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Convert HashMap entries into ArrayList
        List<Map.Entry<Integer, Integer>> list =
                new ArrayList<>(map.entrySet());

        // Step 3: Sort by frequency - highest first
        list.sort(
            Map.Entry.<Integer, Integer>comparingByValue().reversed()
        );

        // Step 4: Store top k elements
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = list.get(i).getKey();
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int[] result = topKFrequent(nums, k);

        System.out.println("Top " + k + " frequent elements:");

        System.out.println(Arrays.toString(result));

        sc.close();
    }
}