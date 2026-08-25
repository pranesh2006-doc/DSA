import java.util.Scanner;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] arr = new int[256];
        int[] ar = new int[256];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)]++;
            ar[t.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (arr[i] != ar[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s = sc.nextLine();

        System.out.print("Enter second string: ");
        String t = sc.nextLine();

        if (isAnagram(s, t)) {
            System.out.println("True - They are Anagrams");
        } else {
            System.out.println("False - They are not Anagrams");
        }

        sc.close();
    }
}