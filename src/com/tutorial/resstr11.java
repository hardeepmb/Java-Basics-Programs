package com.tutorial;

import java.util.*;

public class resstr11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int length = name.length();
        String res="";
        for (int i=length-1;i>=0;i-- ){
            res=res+name.charAt(i);
        }
        System.out.println(res);

    }
}
