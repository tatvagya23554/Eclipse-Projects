package com.company;
import java.util.Scanner;

public class PracticeSet_Ch5 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //Q1
        System.out.println("Q1:");
        for(int i=0; i<N; i++){
            for(int j=0; j<N-i; j++){
                System.out.print("*  ");
            }
            System.out.print("\n");
        }
        System.out.println("\n");

        //Q2
        System.out.println("Q2:");
        int i = 2;
        int sum = 0;
        int copy_N = N;//Making copy for questions ahead
        while(N > 0){
            sum += i;
            i += 2;
            N--;
        }
        N = copy_N;
        /*Alternate:
        int sum = 0;
        int i = 1;
        while(i <= N){
            sum += 2*i;
            i++;
        }*/

        System.out.println("The desired sum is: " + sum);
        System.out.println("\n");

        //Q3
        System.out.println("Q3:");
        for(int t = 1; t <= 10; t++){
            System.out.printf("%d x %d = %d \n", N, t, N* t);
        }
        System.out.println("\n");

        //Q4
        System.out.println("Q4:");
        for(int t = 10; t >= 1; t--){
            System.out.printf("%d x %d = %d \n", 10, t, 10* t);
        }
        System.out.println("\n");

        //Q5
        System.out.println("Q5:");
        switch(N){
            case 0 -> System.out.println("Factorial: 1");
            default -> {
                int factorial=1;
                for(int t = 1; t <= N; t++){
                    factorial*=t;
                }
                System.out.println("Factorial: " + factorial);
            }
        }
        System.out.println("\n");

        //Q6
        System.out.println("Q6:");
        switch(N) {
            case 0 -> System.out.println("Factorial: 1");
            default -> {
                int t = 1, factorial = 1;
                while (t <= N) {
                    factorial*=t;
                    t++;
                }
                System.out.println("Factorial: "+factorial);
            }
        }
        System.out.println("\n");

        //Q7
        System.out.println("Q7:");
        int row = 0, column = 0;
        while(row < N){
            column=0;
            while(column < N - row){
                System.out.print("*  ");
                column++;
            }
            row++;
            System.out.print("\n");
        }
        System.out.println("\n");

        //Q9
        System.out.println("Q9:");
        int sum_table8=0;
        for(int t = 10; t >= 1; t--){
            sum_table8 += 8*t;
        }
        System.out.println("Desired sum: "+sum_table8);
        System.out.println("\n");

        //Q11
        System.out.println("Q11:");
        int sum_Q11 = 0;
        for(int t=1; t <= N; t++){
            sum_Q11 += 2*t;
        }
        System.out.println("The desired sum is: " + sum_Q11);
        System.out.println("\n");
    }
}
