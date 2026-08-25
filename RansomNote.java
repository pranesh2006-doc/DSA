import java.util.Scanner;

public class RansomNote {

    public static boolean canConstruct(String ransomNote, String magazine) {

        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        int[] ar1 = new int[256];
        int[] ar2 = new int[256];

        // Count characters in magazine
        for (int i = 0; i < magazine.length(); i++) {
            ar1[magazine.charAt(i)]++;
        }

        // Count characters in ransomNote
        for (int i = 0; i < ransomNote.length(); i++) {
            ar2[ransomNote.charAt(i)]++;
        }

        // Compare frequencies
        for (int i = 0; i < 256; i++) {
            if (ar2[i] > ar1[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ransom note: ");
        String magazine = sc.nextLine();

        System.out.print("Enter magazine: ");
        String ransomNote = sc.nextLine();

        if (canConstruct(ransomNote, magazine)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        sc.close();
    }
}