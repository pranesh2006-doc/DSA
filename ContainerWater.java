import java.util.*;

class ContainerWater {
    public static int maxArea(int[] height) {
        int n = height.length;
        int max = 0;

        int l = 0;
        int r = n - 1;

        while (l < r) {
            int w = r - l;
            int h = Math.min(height[l], height[r]);
            int a = w * h;

            if (a > max) {
                max = a;
            }

            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] height = new int[n];

        System.out.println("Enter the heights:");
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }

        int result = maxArea(height);

        System.out.println("Maximum Area = " + result);

        sc.close();
    }
}