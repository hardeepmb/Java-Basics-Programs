package com.tutorial;
import java.util.*;

public class factusrecus9 {

//    main method

    int fact =1;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no");
        int no = sc.nextInt();
        int res;
         factusrecus9 f = new factusrecus9();
         res = f.calfacta(no);
        System.out.println(res);

    }

//    method named calfact

    int calfacta(int no){
        if (no>1){
            fact= fact*no;
            calfacta(no-1);
        }return fact;


    }
}
