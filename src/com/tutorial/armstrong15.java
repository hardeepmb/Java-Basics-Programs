package com.tutorial;
import java.util.*;

public class armstrong15 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a no");
        int n = s.nextInt();
        int t1 = n;
        int     length =0;
        while (t1 !=0){
            length = length +1;
            t1=t1/10;
        }
        int t2=n;
        int arm = 0;
        int rem;
        while (t2!=0){
            int mul= 1;
            rem = t2%10;
            for (int i = 1; i <= length; i++) {
                mul = mul * rem;
            }
            arm=arm+mul;
            t2=t2/10;
        }
        if (arm==n){
            System.out.println("armstrong no");
        }
        else {
            System.out.println("not armstrong");
        }

    }
}
