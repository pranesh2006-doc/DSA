import java.util.HashMap;
import java.util.Scanner;

public class WordPattern {

    public static boolean wordPattern(String pattern, String s) {

        int n = pattern.length();

        String[] words = s.split(" ");

        int m = words.length;

        // Number of characters must equal number of words
        if (n != m) {
            return false;
        }

        // pattern -> word
        HashMap<Character, String> map = new HashMap<>();

        // word -> pattern
        HashMap<String, Character> rev = new HashMap<>();

        for (int i = 0; i < n; i++) {

            char a = pattern.charAt(i);
            String b = words[i];

            // Normal check
            if (map.containsKey(a)) {

                if (!map.get(a).equals(b)) {
                    return false;
                }

            } else {
                map.put(a, b);
            }

            // Reverse check
            if (rev.containsKey(b)) {

                if (rev.get(b) != a) {
                    return false;
                }

            } else {
                rev.put(b, a);
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter pattern: ");
        String pattern = sc.nextLine();

        System.out.print("Enter sentence: ");
        String s = sc.nextLine();

        boolean result = wordPattern(pattern, s);

        System.out.println("Result: " + result);

        sc.close();
    }
}