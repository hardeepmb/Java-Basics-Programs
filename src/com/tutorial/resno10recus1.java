package com.tutorial;

public class resno10recus1 {
    public static void main(String[] args) {
        rev(543);


    }
    public static void rev(int no){
        if (no<10){
            System.out.print(no);
            return;
        }else {
            System.out.print(no%10);
            rev(no/10);
        }
    }
}
