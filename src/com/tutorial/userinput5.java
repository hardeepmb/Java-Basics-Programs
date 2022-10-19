package com.tutorial;
import java.util.Scanner;

public class userinput5 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter name");
        String name = s.next();
        System.out.println("enter gender");
        char gender = s.next().charAt(0);
        System.out.println("enter age");
        int age= s.nextInt();
        System.out.println("Enter phno");
        long phno = s.nextLong();
        System.out.println("Name :" +name);
        System.out.println("Gender :"+ gender);
        System.out.println("Age :"+age);
        System.out.println("Phone Number :"+ phno);
    }
}


