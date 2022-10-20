package com.tutorial;
import java.util.*;

public class primeno12 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter a no");
        int n= s.nextInt();
        int temp=0;
        for (int i=2;i<=n-1;i++){
            if (n%i==0){
                temp=temp+1;
            }
        }
        if (temp>0){
            System.out.println("not a prime");
        }else {
            System.out.println("prime");
        }
    }
}
