package com.tutorial;

public class leapyr3 {
    public static void main(String[] args) {
        int y =2016;
        if (y%4==0){
            System.out.println("leap year1");
            if (y%100==0){
                System.out.println("not a leap year2");
                if (y%400==0){
                    System.out.println("leap year3");
                }
                else {
                    System.out.println("not a leap year3");
                }
            }
            else {
                System.out.println("leap year2");
            }
        }
        else {
            System.out.println("not a leap year1");
        }



//        or


        if ((y%400==0) || ((y%4==0) && (y%100!=0))){
            System.out.println("leap");
        }
        else {
            System.out.println("not leap");
        }



    }
}


