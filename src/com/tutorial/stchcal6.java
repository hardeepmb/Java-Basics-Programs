package com.tutorial;
import java.util.*;

public class stchcal6 {
    public static void main(String[] args) {
//        calculator using switch statements

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        int a = sc.nextInt();
        System.out.println("Enter b no");
        int b = sc.nextInt();
        System.out.println("Enter a symbol(+,-,*,/");
        String sym=sc.next();
        int res;
        switch (sym)
        {
            case "+":res=a+b;
                System.out.println(res);
                break;
            case "-":res=a-b;
                System.out.println(res);
                break;
            case "*":res=a*b;
                System.out.println(res);
                break;
            case "/":res=a/b;
                System.out.println(res);
                break;
            default:
                System.out.println("invalid input");
        }
    }

}
