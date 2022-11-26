package com.tutorial;

public class noptrnpractice {
    public static void main(String[] args) {
        System.out.println("pattern 1");
        int i,j,k,l,m;
        for (i=1;i<=5;i++){
            for (j=1;j<=i;j++){
                System.out.print(" "+j);
            }
            System.out.println();
        }

        System.out.println("------------------------------------------------");
        System.out.println("pattern 2");

        for (i=1;i<=5;i++){
            for (j=1;j<=i;j++){
                System.out.print(" "+i);
            }
            System.out.println();
        }

        System.out.println("------------------------------------------------");
        System.out.println("pattern 3");
        k=0;
        for (i=1;i<5;i++){
            for (j=1;j<=i;j++){
                k=k+1;
                System.out.print(" "+k);
            }
            System.out.println();
        }

        System.out.println("------------------------------------------------");
        System.out.println("pattern 4");

        for (i=1;i<=5;i++){
            for (j=i;j>=1;j--){
                System.out.print(" "+j);
            }
            System.out.println();
        }

        System.out.println("------------------------------------------------");
        System.out.println("pattern 5");

        for (i=1;i<=5;i++){
            for (j=1;j<=i;j++){
                System.out.print(j +" ");
            }
            for (k=i-1;k>=1;k--){
                System.out.print(k+" ");
            }
            System.out.println();
        }

        System.out.println("------------------------------------------------");
        System.out.println("pattern 6");


        for (i=1;i<=5;i++){
            for (j=5;j>=i;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println("------------------------------------------------");
        System.out.println("pattern 7");

        for (i=1;i<=5;i++){
            k=i;
            for (j=1;j<=i;j++){
                System.out.print(k);
                k=k+5-j;
            }
            System.out.println();
        }

        System.out.println("------------------------------------------------");
        System.out.println("pattern 8");

        l=0;
        for (i=1;i<=5;i++){
            for (j=1;j<=3;j++){
                l=l+1;
                System.out.print(l+" ");
            }
            System.out.println();
        }

        System.out.println("------------------------------------------------");
        System.out.println("pattern 9");

//        see again to understand

        m=0;
        for (i=1;i<=5;i++){
            if (i%2!=0){
               for (j=1;j<=3;j++){
                   m=m+1;
                   System.out.print(m+" ");
               }
            }
            else {
                int temp =m+1;
                for (j=m+3;j>=temp;j--){
                    m=m+1;
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }




    }
}
