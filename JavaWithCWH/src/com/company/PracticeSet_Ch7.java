package com.company;
import java.util.Scanner;

public class PracticeSet_Ch7 {
    //Q2
    static void pattern(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*  ");
            }
            System.out.print("\n");
        }
    }
    //Q3
    static int sum(int n){
       if(n==1){
           return n;
       }else{
           return sum(n-1) + n;
       }
    }
    //Q4
    static void patt_ern(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i; j++){
                System.out.print("*  ");
            }
            System.out.print("\n");
        }
    }
    //Q5
    static int fibonacci(int n){//returns fibonacci number at nth index((n+1)th fibonacci number)
        if(n == 0 || n == 1){//Fib series begins with 0 and then 1
            return n;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    //Q6
    static float average(float...arr){
        float net = 0;
        for(int i = 0; i < arr.length; i++){
            net += arr[i];
        }
        return (net / arr.length);
    }
    //Q7
    static void pattern_Q7(int n){
        if(n > 0) {
            for(int i = 0; i < n; i++){
                System.out.print("*  ");
            }
            System.out.println("");
        }else{
            return;//Added this as otherwise, the method recursed infinitely
        }
        pattern_Q7(n-1);
    }
    //Q8
    static void pattern_Q8(int n) {
        if (n > 0) {
            pattern_Q8(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*  ");
            }
            System.out.println();
        } else {
            return;//Added this as otherwise, the method recursed infinitely
        }
    }
    //Q9
    static float CtoF(float C){
        return (9/5f)*C + 32;//mention f here like this
    }
    //Q10
    static int Q10(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Q2: ");
        pattern(num);
        System.out.println("Q3: ");
        int sum = sum(num);
        System.out.print("Desired sum: " + sum);
        System.out.print("\n");
        System.out.println("Q4: ");
        patt_ern(num);
        System.out.println("Q5: ");
        int fib_num = fibonacci(num);
        System.out.println("Desired fibonacci number: "+fib_num);
        System.out.println("Q6: ");
        System.out.print("Enter number of numbers: ");
        int num_nums = sc.nextInt();
        float [] numbers = new float[num_nums];
        System.out.print("Enter numbers to find average of: ");
        for(int i = 0; i < num_nums; i++){
            float t = sc.nextFloat();
            numbers[i] = t;
        }
        float average = average(numbers);
        System.out.println("Desired average: "+average);
        System.out.println("Q7: ");
        pattern_Q7(num);
        System.out.println("NOTE: In Q7 and Q8, make sure to keep the recursive call inside the if statement\nOtherwise we have a StackOverflowError(An infinite recursion causing a stack overflow)");
        System.out.println("Q8: ");
        pattern_Q8(num);
        System.out.println("Q9: ");
        float tempe = CtoF(num);
        System.out.println("Temperature in Fahrenheit: "+tempe);
        System.out.println("Q10: ");
        int ans = Q10(num);
        System.out.println("Desired sum: "+ans);
    }
}