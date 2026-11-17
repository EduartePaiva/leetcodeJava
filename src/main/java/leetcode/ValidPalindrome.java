package leetcode;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        int[] palindrome = s.chars().filter(v -> (v >= 'a' && v <= 'z') || (v >= '0' && v <= '9')).toArray();

        for (int i = 0, j = palindrome.length - 1; i < palindrome.length / 2; i++, j--) {
            if (palindrome[i] != palindrome[j]) {
                return false;
            }
        }

        return true;
    }
}