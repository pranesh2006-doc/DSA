import java.util.*;

public class foursum {

    public static int[][] intervalIntersection(
            int[][] firstList,
            int[][] secondList) {

        List<int[]> result = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < firstList.length && j < secondList.length) {

            int start = Math.max(
                    firstList[i][0],
                    secondList[j][0]
            );

            int end = Math.min(
                    firstList[i][1],
                    secondList[j][1]
            );

            // Intersection exists
            if (start <= end) {
                result.add(new int[]{start, end});
            }

            // Move the interval that ends first
            if (firstList[i][1] < secondList[j][1]) {
                i++;
            } else {
                j++;
            }
        }

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of intervals in first list: ");
        int m = sc.nextInt();

        int[][] firstList = new int[m][2];

        System.out.println("Enter first list intervals:");
        for (int i = 0; i < m; i++) {
            firstList[i][0] = sc.nextInt();
            firstList[i][1] = sc.nextInt();
        }

        System.out.print("Enter number of intervals in second list: ");
        int n = sc.nextInt();

        int[][] secondList = new int[n][2];

        System.out.println("Enter second list intervals:");
        for (int i = 0; i < n; i++) {
            secondList[i][0] = sc.nextInt();
            secondList[i][1] = sc.nextInt();
        }

        int[][] result = intervalIntersection(firstList, secondList);

        System.out.println("Output:");

        System.out.print("[");

        for (int i = 0; i < result.length; i++) {

            System.out.print(
                    "[" + result[i][0] + "," + result[i][1] + "]"
            );

            if (i < result.length - 1) {
                System.out.print(",");
            }
        }

        System.out.println("]");

        sc.close();
    }
}