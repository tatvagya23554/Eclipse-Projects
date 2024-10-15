package com.company;
import java.util.Scanner;

public class Test {
    public static void increasingTriangle(int n){
        if(n > 0){
            for(int i = 0; i < n; i++) {
                System.out.print("*  ");
            }
            System.out.print("\n");
            increasingTriangle(n - 1);
        }
    }

    public static int sum(int n){
        if(n == 1){
            return n;
        }else{
            return n + sum(n - 1);
        }
    }

    public static void decreasingTriangle(int n){
        if(n > 0){
            decreasingTriangle(n - 1);
            for(int i = 0; i < n ; i++){
                System.out.print("*  ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = sc.nextInt();
        //Increasing triangle using recursion
        System.out.println("Increasing triangle: ");
        increasingTriangle(N);
        //Sum using recursion
        int s = sum(N);
        System.out.println("Required sum is: " +  s);
        //Decreasing triangle using recursion
        System.out.println("Decreasing triangle: ");
        decreasingTriangle(N);
    }
}
