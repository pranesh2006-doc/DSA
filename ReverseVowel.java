import java.util.*;

public class ReverseVowel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        String result = reverseVowels(s);

        System.out.println("Output: " + result);

        sc.close();
    }

    public static String reverseVowels(String s) {

        char[] arr = s.toCharArray();

        int l = 0;
        int r = arr.length - 1;

        while (l < r) {

            if (isVowel(arr[l]) && isVowel(arr[r])) {

                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;

                l++;
                r--;

            } 
            else if (!isVowel(arr[l])) {

                l++;

            } 
            else {

                r--;
            }
        }

        return new String(arr);
    }

    public static boolean isVowel(char ch) {

        return ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' ||
               ch == 'O' || ch == 'U';
    }
}