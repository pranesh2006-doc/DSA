import java.util.*;

public class reverse {

    public static void reverseString(char[] s) {

        int l = 0;
        int r = s.length - 1;

        while (l < r) {

            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;

            l++;
            r--;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char[] s = str.toCharArray();

        reverseString(s);

        System.out.print("Reversed string: ");

        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
        }

        sc.close();
    }
}