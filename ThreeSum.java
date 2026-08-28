
import java.util.*;

class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        int n = nums.length;

        Arrays.sort(nums);

        for (int i = 0; i < n - 2; i++) {

            // Skip duplicate i
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int l = i + 1;
            int r = n - 1;

            while (l < r) {

                int sum = nums[i] + nums[l] + nums[r];

                if (sum > 0) {
                    r--;
                }
                else if (sum < 0) {
                    l++;
                }
                else {

                    result.add(Arrays.asList(
                        nums[i],
                        nums[l],
                        nums[r]
                    ));

                    l++;
                    r--;

                    // Skip duplicate left values
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }

                    // Skip duplicate right values
                    while (l < r && nums[r] == nums[r + 1]) {
                        r--;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        List<List<Integer>> result = threeSum(nums);

        System.out.println("Triplets:");

        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }

        sc.close();
    }
}

