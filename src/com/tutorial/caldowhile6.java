package com.tutorial;

import java.util.*;

public class caldowhile6 {
    public static void main(String[] args) {

    String yn;
        do {
            Scanner s = new Scanner(System.in);
            System.out.println("enter a no1");
            int no1= s.nextInt();
            System.out.println("enter no2");
            int no2= s.nextInt();
            System.out.println("enter a symbol(+,-,/,*)");
            String sym=s.next();
            int res;
            switch (sym) {
                case "+":
                    res = no1 + no2;
                    System.out.println("add is " + res);
                    break;
                case "-":
                    res = no1 - no2;
                    System.out.println("sub is" + res);
                    break;
                case "/":
                    res = no1 / no2;
                    System.out.println("div is" + res);
                    break;
                case "*":
                    res = no1 * no2;
                    System.out.println("multiplication is" + res);
                    break;
                default:
                    System.out.println("enter vaild sym");

                }
            System.out.println("continue?(press y or n");
            yn=s.next();
            } while(yn.equals("Y") || yn.equals("y"));
    }
}
