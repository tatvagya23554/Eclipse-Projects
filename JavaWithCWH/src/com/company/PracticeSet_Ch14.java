package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

class MaxRetriesException extends Exception{
    @Override
    public String getMessage(){
        return "You have reached the maximum permissible retries";
    }
}
public class PracticeSet_Ch14 {
    public static int div(int a, int b){
        return a / b;
    }
    public static void meth_Q5(){
        System.out.println("Q5: ");
        Scanner sc = new Scanner(System.in);
        int[] arr_Q5 = new int[5];
        System.out.print("Enter a valid index: ");
        int ind_Q5 = sc.nextInt();
        int count_Q5 = 1;
        while(ind_Q5 >= arr_Q5.length || ind_Q5 < 0){
            System.out.print("Enter a valid index: ");
            ind_Q5 = sc.nextInt();
            count_Q5++;
            if(count_Q5 == 5){
                try {
                    throw new MaxRetriesException();
                }catch(MaxRetriesException e){
                    System.out.println(e.toString());
                    e.printStackTrace();
                    //System.out.println(e.getMessage());Gives output otherwise not required
                    break;
                }
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        //Q1
        /*//Syntax Error: int a = 1

        //Logical Error: //Program for printing first n even numbers:
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println("First n even numbers are: );
        for(int i = 0; i < N; i++){
            System.out.println(2 * i +  1);

        //Runtime Error:
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a / b);//In case user enters b as 0*/

        //Q2
        System.out.println("Q2: ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        try{
            System.out.println("a divided by b is: "+ div(a, b));
        }
        catch (ArithmeticException e){
            System.out.println("HaHa");
        }
        catch (InputMismatchException e){//(IllegalArgumentException e){//Unclear(Not explained properly in video as well)
            System.out.println("HeHe");
        }
        System.out.println();

        //Q3
        System.out.println("Q3: ");
        int[] arr = new int[5];
        System.out.print("Enter a valid index: ");
        int ind = sc.nextInt();
        int count = 1;
        while(ind >= arr.length || ind < 0){
            System.out.print("Enter a valid index: ");
            ind = sc.nextInt();
            count++;
            if(count == 5){
                System.out.println("Error");
                break;
            }
        }
        System.out.println();

        //Q4
        System.out.println("Q4: ");
        int[] arr_Q4 = new int[5];
        System.out.print("Enter a valid index: ");
        int ind_Q4 = sc.nextInt();
        int count_Q4 = 1;
        while(ind_Q4 >= arr_Q4.length || ind_Q4 < 0){
            System.out.print("Enter a valid index: ");
            ind_Q4 = sc.nextInt();
            count_Q4++;
            if(count_Q4 == 5){
                try {
                    throw new MaxRetriesException();
                }catch(MaxRetriesException e){
                    System.out.println(e.toString());
                    e.printStackTrace();
                    //System.out.println(e.getMessage());Gives output otherwise not required
                    break;
                }
            }
        }
        System.out.println();

        //Q5
        meth_Q5();/*First time that I made two scanner objects within the same file of java code*/
    }
}
