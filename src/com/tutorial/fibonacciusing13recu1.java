package com.tutorial;

public class fibonacciusing13recu1 {
    static int a=0, b=1, c;
    public static void main(String[] args) {
        fibonacciusing13recu1 ob = new fibonacciusing13recu1();
        ob.printFib(10);

    }
    void printFib(int i){
        if (i>=1) {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
            printFib(i-1);
        }
    }
}
