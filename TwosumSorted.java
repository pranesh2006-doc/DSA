import java.util.*;

public class TwosumSorted {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get array size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        // Get array elements
        int[] numbers = new int[n];

        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // Get target
        System.out.print("Enter target: ");
        int target = sc.nextInt();

        // Two pointers
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {

            int sum = numbers[left] + numbers[right];

            if (sum > target) {
                right--;
            }
            else if (sum < target) {
                left++;
            }
            else {
                System.out.println("Answer: [" + (left + 1) + ", " + (right + 1) + "]");
                return;
            }
        }

        System.out.println("No pair found.");
    }
}