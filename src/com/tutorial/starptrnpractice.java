package com.tutorial;

public class starptrnpractice {
    public static void main(String[] args) {
        System.out.println("patter 1");
        int i,j,k,l;
        for (i=1;i<=4;i++){
            for (j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("pattern 2");

        for (i=1;i<=4;i++){
            for (j=4;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        System.out.println("----------------------------------------------------");
        System.out.println("pattern 3");

        for (i=1;i<=4;i++){
            for (j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        for (i=1;i<=3;i++){
            for (j=3;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        System.out.println("-------------------------------------------------");
        System.out.println(" pattern 4");

        for (i=1;i<=4;i++){
            for (j=3;j>=i;j--){
                System.out.print("  ");
            }
            for (k=1;k<=i;k++){
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------------");
        System.out.println("pattern 5");

        for (i=1;i<=4;i++){
            for (j=1;j<=i;j++){
                System.out.print("  ");
            }
            for (k=4;k>=i;k--){
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------------------");
        System.out.println("patter 6");

        for (i=1;i<=4;i++){
            for (j=3;j>=i;j--){
                System.out.print("  ");
            }
            for (k=1;k<=i;k++){
                System.out.print(" *");
            }
            System.out.println();
        }
        for (i=1;i<=3;i++){
            for (j=1;j<=i;j++){
                System.out.print("  ");
            }
            for (k=3;k>=i;k--){
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------");
        System.out.println("patter 7");

        for (i=1;i<=4;i++){
            for (j=3;j>=i;j--){
                System.out.print("  ");
            }
            for (k=1;k<=i;k++){
                System.out.print("   *");
            }
            System.out.println();

        }
        System.out.println("--------------------------------------------------------------");
        System.out.println(" pattern 8");

        for (i=1;i<=4;i++){
            for (j=4;j>=i;j--){
                System.out.print(" ");
            }
            for (k=1;k<=i;k++){
                System.out.print("*");
            }
            for (l=2;l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------------");
        System.out.println(" pattern 9");

        for (i=1;i<=4;i++){
            for (j=1;j<=i;j++){
                System.out.print(" ");
            }
            for (k=4;k>=i;k--){
                System.out.print("*");
            }
            for (l=3;l>=i;l--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------------------------");
        System.out.println("pattern 10");

        for (i=1;i<=5;i++){
            for (j=1;j<=i;j++){
                if (i>=2 && j<=i-1 ){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        System.out.println("--------------------------------------------");
        System.out.println("pattern 11");

        for (i=1;i<=5;i++){
            for (j=5;j>i;j--){
                System.out.print(" ");
            }
            for (k=1;k<=i;k++){
                if (j>=2 && k>1) {
                    System.out.print(" ");
                }
                else {
                    System.out.println("*");
                }
            }
            System.out.println();
        }


        System.out.println("---------------------------------------");
        System.out.println("pattern 12");

        for (i=1;i<=5;i++){
            for (j=5;j>=i;j--){
                System.out.print(" ");
            }
            for (k=1;k<(i*2);k++){
                if (k>1 && k<(i*2)-1){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        System.out.println("----------------------------------------");
        System.out.println("pattern 13");

        for (i=5;i>=1;i--){
            for (j=5;j>=i;j--){
                System.out.print(" ");
            }
            for (k=1;k<(i*2);k++){
                if (k>1 && k<(i*2)-1){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        System.out.println("-------------------------------------------------------------");
        System.out.println("pattern 14");

        for (i=0;i<5;i++){
            for (j=1;j<5;j++){
                System.out.print(" *");
            }
            System.out.println();
        }

        System.out.println("----------------------------------------------");
        System.out.println("pattern 15");

        for (i=0;i<5;i++){
            for (j=1;j<5;j++){
                if (i==j || i+j == 5-1){
                    System.out.print(" *");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("--------------------------------------------------------");
        System.out.println("pattern 16");

        for (i=1;i<5;i++){
            for (j=1;j<5;j++){
                if (i>1 && i<4 && j>1 && j<4){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }



        System.out.println("-------------------------------------------------");
        System.out.println("extra qs");

        System.out.println("qs 1");

        for (i=1;i<=5;i++){
            for (j=1;j<=i;j++){
                if (i>1 && j<i){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        System.out.println("qs 2");

        for (i=1;i<=5;i++){
            for (j=1;j<=i;j++){
                System.out.print(" ");
            }
            for (k=5;k>i;k--){
                if (k<5){
                    System.out.print("");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        System.out.println("--------------------------------------------------------------");
        System.out.println("qs 3");

        for (i=1;i<=5;i++){
            for (j=1;j<=i;j++){
                if (j!=i){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        System.out.println("----------------------------------------------------");
        System.out.println("qs 4");

    }
}
