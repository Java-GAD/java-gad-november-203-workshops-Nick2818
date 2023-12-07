package org.example;

public class Main {

    // 1
    public static void printHallowPattern(int n){

        for(int i = 0; i < n; i++){

            for(int j = 0; j < n; j++){

                if( i==0 || i == n-1 || j == 0 || j == n-1 ){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }

    // 2

    public static void printLefttHalfTriangle(int n){

        for(int i = 0 ; i < n; i++){
            for(int j = 0; j < n; j++){
                if(j <= i){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void printLefttHalfTriangle2(int n){

        for(int i = 0 ; i < n; i++){

            printCustomLine(i+1);
            System.out.println();
        }
    }

    public static void printCustomLine(int n){
        for(int i = 0; i < n; i++){
            System.out.print("*");
        }
    }


    public static void main(String[] args) {
        System.out.println("Hello world!");

       // printHallowPattern(6);
        printLefttHalfTriangle(6);
        System.out.println();
        printLefttHalfTriangle2(6);
    }
}