import java.util.HashMap;
import java.util.Scanner;

public class Isomorphic{

    public static boolean isIsomorphic(String s, String t) {

        // Step 1: Check length
        if (s.length() != t.length()) {
            return false;
        }

        // s -> t
        HashMap<Character, Character> map = new HashMap<>();

        // t -> s
        HashMap<Character, Character> rev = new HashMap<>();

        // Step 2: Check every character
        for (int i = 0; i < s.length(); i++) {

            char a = s.charAt(i);
            char b = t.charAt(i);

            // Check s -> t
            if (map.containsKey(a)) {

                if (map.get(a) != b) {
                    return false;
                }

            } else {
                map.put(a, b);
            }

            // Check t -> s
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

        System.out.print("Enter first string: ");
        String s = sc.nextLine();

        System.out.print("Enter second string: ");
        String t = sc.nextLine();

        boolean result = isIsomorphic(s, t);

        System.out.println("Isomorphic: " + result);

        sc.close();
    }
}