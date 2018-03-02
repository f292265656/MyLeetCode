package com.algorithm;


public class NimGame {

    public static void main(String[] args) {
        System.out.println(canWinNim(12));
    }

    public static boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}
