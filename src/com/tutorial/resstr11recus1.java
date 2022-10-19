package com.tutorial;

import java.util.*;

public class resstr11recus1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        System.out.println(res(s));
    }

    static String res(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        return res(s.substring(1))+s.charAt(0);
    }
}
