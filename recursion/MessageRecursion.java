package com.ava.recursion;

public class MessageRecursion {
    // Ye Cong 1306248
    public static void main(String[] args) {
        nPrintln("Welcome", 5);
    }

    // 将 nPrintln 方法设为静态
    public static void nPrintln(String message, int times) {
        if (times >= 1) {
            System.out.println(message);
            nPrintln(message, times - 1);
        }
    }
}

