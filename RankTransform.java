import java.util.*;

public class RankTransform{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get array size
        int n = sc.nextInt();

        // Get array elements
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Clone the original array
        int[] temp = arr.clone();

        // Sort the copy
        Arrays.sort(temp);

        // Create HashMap
        HashMap<Integer, Integer> map = new HashMap<>();

        int size = 1;

        // Store value -> rank
        for (int i = 0; i < n; i++) {

            if (!map.containsKey(temp[i])) {
                map.put(temp[i], size);
                size++;
            }
        }

        // Create result array
        int[] ar = new int[n];

        // Get rank for each original value
        for (int i = 0; i < n; i++) {
            ar[i] = map.get(arr[i]);
        }

        // Print result
        for (int i = 0; i < n; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}