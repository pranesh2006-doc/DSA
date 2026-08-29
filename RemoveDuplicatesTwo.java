import java.util.*;

public class RemoveDuplicatesTwo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get size
        int n = sc.nextInt();

        // Get array
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Remove duplicates - maximum 2 occurrences
        if (n <= 2) {
            System.out.println("Length = " + n);

            for (int i = 0; i < n; i++) {
                System.out.print(nums[i] + " ");
            }

            return;
        }

        int i = 2;

        for (int j = 2; j < n; j++) {

            if (nums[j] != nums[i - 2]) {
                nums[i] = nums[j];
                i++;
            }
        }

        // Output
        System.out.println("Length = " + i);

        for (int j = 0; j < i; j++) {
            System.out.print(nums[j] + " ");
        }
    }
}