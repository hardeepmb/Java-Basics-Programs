package com.tutorial;

public class swap2no4 {
    public static void main(String[] args) {
        int a, b;
        a= 10;
        b= 20;
//        using 3rd varialble

        int c;
        c=a;
        a=b;
        b=c;
        System.out.println(a);
        System.out.println(b);

//        without using variable

         a = a+b;
         b = a-b;
         a = a-b;
        System.out.println(a);
        System.out.println(b);
    }
}
