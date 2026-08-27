import java.util.*;

public class Validpalindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get input
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        // Convert to lowercase
        String str = s.toLowerCase();

        // Store only letters and digits
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                result.append(ch);
            }
        }

        // Two pointers
        int left = 0;
        int right = result.length() - 1;

        while (left < right) {

            if (result.charAt(left) != result.charAt(right)) {
                System.out.println("Not a Palindrome");
                return;
            }

            left++;
            right--;
        }

        System.out.println("Palindrome");
    }
}