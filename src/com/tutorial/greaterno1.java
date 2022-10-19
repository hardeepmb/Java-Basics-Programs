package com.tutorial;

public class greaterno1 {
    public static void main(String[] args) {

//        Condiotional Statement

//     a) if else

//       1)
        int a=10, b=20;
        if (a>b){
            System.out.println("a greater than b");
        }
        else {
            System.out.println("b greater than a");
        }

//     b) if else if

        int c=10, d=20,e=30;
        if (c>d && c>e){
            System.out.println("c is greater");
        }
        else if (d>c && d>e){
            System.out.println(" d is greater");
        }
        else {
            System.out.println("e is greater");
        }

//     c) nested if

        if (c>d){
            if (c>e){
                System.out.println(" c is greater");
            }
            else {
                System.out.println("e is greater");
            }
        }
        else if (d>e){
            System.out.println(" d is greater");
        }
        else{
            System.out.println(" e is greater");
        }

    }
}
