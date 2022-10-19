package com.tutorial;
import java.util.*;

public class multtable7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no");
        int t= sc.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(t*i);
            System.out.println(t+"*"+i +"="+ t*i);
        }
    }
}
