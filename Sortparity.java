import java.util.*;

public class Sortparity {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int l = 0;
        int r = n - 1;

        while (l < r) {

            // Left is already even
            if (nums[l] % 2 == 0) {
                l++;
            }

            // Right is already odd
            else if (nums[r] % 2 != 0) {
                r--;
            }

            // Left is odd and right is even
            else {
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;

                l++;
                r--;
            }
        }

        System.out.println("Result:");

        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}
