import java.util.Scanner;

public class MoveZeroes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Slow pointer
        int i = 0;

        // Fast pointer
        for (int j = 0; j < n; j++) {

            if (nums[j] != 0) {

                if (i != j) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }

                i++;
            }
        }

        System.out.println("Array after moving zeroes:");

        for (int x : nums) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}
