package com.tutorial;

import java.util.Scanner;

public class resno10recus2 {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         int n = sc.nextInt();
         int res= resno(n,0);
        System.out.println(res);
    }
    public static int resno(int n, int sum){
        while (n!=0){
            return sum;
        }
        int rem=n%10;
        sum=sum*10+rem;
        int res=resno(n/10,sum);
        return res;
    }
}
