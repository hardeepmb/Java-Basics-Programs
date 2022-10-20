package com.tutorial;
import java.util.*;

public class palindrome14res1 {
    static int rem;
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a no");
        int n =s.nextInt();
        int res=palindromeres(n,0);

        if (n==rem){
            System.out.println("palindrome");
        }else {
            System.out.println("not");
        }

    }
    static int palindromeres(int n, int sum){
        while (n!=0){
            return sum;
        }
        rem=n%10;
        sum=sum*10+rem;
        int res=palindromeres(n/10,sum);
        return n;
    }
}
