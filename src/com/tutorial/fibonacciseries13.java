package com.tutorial;
import java.util.*;

public class fibonacciseries13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a=0,b=1,c;
        for (int i =0; i<=10;i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }


    }
}
