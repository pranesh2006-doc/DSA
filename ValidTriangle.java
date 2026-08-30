import java.util.*;

public class ValidTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);

        int count = 0;

        for (int k = n - 1; k >= 2; k--) {

            int l = 0;
            int r = k - 1;

            while (l < r) {

                if (nums[l] + nums[r] > nums[k]) {

                    count += r - l;
                    r--;

                } else {

                    l++;
                }
            }
        }

        System.out.println("Number of valid triangles = " + count);

        sc.close();
    }
}