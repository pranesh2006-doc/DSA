import java.util.*;

public class Boats {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of people: ");
        int n = sc.nextInt();

        int[] people = new int[n];

        System.out.println("Enter the weights:");
        for (int i = 0; i < n; i++) {
            people[i] = sc.nextInt();
        }

        System.out.print("Enter boat weight limit: ");
        int limit = sc.nextInt();

        Arrays.sort(people);

        int l = 0;
        int r = n - 1;
        int boats = 0;

        while (l <= r) {

            if (people[l] + people[r] <= limit) {
                l++;
                r--;
            } else {
                r--;
            }

            boats++;
        }

        System.out.println("Minimum number of boats = " + boats);

        sc.close();
    }
}