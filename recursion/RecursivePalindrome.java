package com.ava.recursion;

public class RecursivePalindrome {

    public static void main(String[] args) {
        System.out.println("Is moon a palindrome? " + isPalindrome("moon"));
        System.out.println("Is noon a palindrome? " + isPalindrome("noon"));
        System.out.println("Is a a palindrome? " + isPalindrome("a"));
        System.out.println("Is aba a palindrome? " + isPalindrome("aba"));
        System.out.println("Is ab a palindrome? " + isPalindrome("ab"));
    }

    // 判断字符串是否为回文
    public static boolean isPalindrome(String s) {
        return isPalindrome(s, 0, s.length() - 1);
    }

    // 递归方法判断字符串是否为回文
    private static boolean isPalindrome(String s, int low, int high) {
        if (high <= low) {
            // 如果高指针小于或等于低指针，说明检查完毕，是回文
            return true;
        } else if (s.charAt(low) != s.charAt(high)) {
            // 如果低指针和高指针指向的字符不相等，则不是回文
            return false;
        } else {
            // 递归调用，检查下一对字符
            return isPalindrome(s, low + 1, high - 1);
        }
    }
}
