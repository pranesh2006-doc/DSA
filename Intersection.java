 import java.util.*;

public class Intersection {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        // Add nums1 elements to set1
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }

        // Find common elements
        for (int i = 0; i < nums2.length; i++) {
            if (set1.contains(nums2[i])) {
                set2.add(nums2[i]);
            }
        }

        // Convert HashSet to array
        int[] arr = new int[set2.size()];

        int i = 0;

        for (int num : set2) {
            arr[i] = num;
            i++;
        }

        return arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size of nums1
        System.out.print("Enter size of nums1: ");
        int n = sc.nextInt();

        int[] nums1 = new int[n];

        System.out.println("Enter nums1 elements:");
        for (int i = 0; i < n; i++) {
            nums1[i] = sc.nextInt();
        }

        // Input size of nums2
        System.out.print("Enter size of nums2: ");
        int m = sc.nextInt();

        int[] nums2 = new int[m];

        System.out.println("Enter nums2 elements:");
        for (int i = 0; i < m; i++) {
            nums2[i] = sc.nextInt();
        }

        // Create object
        Intersection obj = new Intersection();

        // Call intersection
        int[] result = obj.intersection(nums1, nums2);

        // Print result
        System.out.println("Intersection:");

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}