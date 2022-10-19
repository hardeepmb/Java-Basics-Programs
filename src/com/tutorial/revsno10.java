package com.tutorial;
import java.util.*;

public class revsno10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no");
        int no = sc.nextInt();
        int rem, res=0;
        while (no!=0){
            rem=no%10;
            res=res*10+rem;
            no=no/10;
        }
        System.out.println(res);
    }

}
