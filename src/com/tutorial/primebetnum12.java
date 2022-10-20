package com.tutorial;
import java.util.*;
public class primebetnum12 {
    public static void main(String[] args) {
        int temp = 0, i , j;
        for ( i= 1;i<=100;i++){
            for ( j=2;j<=i-1;j++){
                if (i%j==0){
                     temp= temp + 1;
                }
            }
            if (temp==0){
                System.out.println(i);
            }else {
                temp=0;
            }
        }
    }
}
