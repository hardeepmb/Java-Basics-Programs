package com.tutorial;

import java.util.*;

public class resstr11recus1 {
    public static void main(String[] args) {

        String s = "Hardeep";
        System.out.println(res(s));
    }

    static String res(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        return res(s.substring(1))+s.charAt(0);
    }
}
