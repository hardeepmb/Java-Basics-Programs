package com.tutorial;

public class arraylec {
    public static void main(String[] args) {
        int emp_id[]= new int[1000];
        emp_id[0]= 101;
        System.out.println(emp_id[0]);
        int[] a = new int[0]; //(Null Array)
//      int[] b= new int[-3]; //(NegativeArraySizeException)

        int[] c = new int[3];
        c[0] =10;
        c[1] =20;
        c[2] =30;
//      c[3] =40; //(ArrayIndexOutOfBoundsException)

        int[] d ={10, 20,30,40};
        for (int i=0;i<d.length;i++){
            System.out.print(d[i]+", ");
        }

        System.out.println();

        for (int i:d){
            System.out.print(i +", ");
        }
        

    }
}
