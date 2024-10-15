package com.company;
import java.util.Scanner;

public class PracticeSet_Ch4 {
    public static void main(String[] args) {
        //Q3 I am altering this question according to the actual new slabs in the country
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you income in lakhs per annum: ");
        double income = sc.nextDouble();
        double income_tax = 0;
        if(income <= 3){
            income_tax = 0;
        }else if(income <= 6){
            income_tax += 0.05 * (income - 3);
        }else if(income <= 9){
            income_tax += 0.05 * (6 - 3);
            income_tax += 0.1 * (income - 6);
        }else if(income <= 12){
            income_tax += 0.05 * (6 - 3);
            income_tax += 0.1 * (9 - 6);
            income_tax += 0.15 * (income - 9);
        }else if(income <= 15){
            income_tax += 0.05 * (6 - 3);
            income_tax += 0.1 * (9 - 6);
            income_tax += 0.15 * (12 - 9);
            income_tax += 0.2 * (income - 12);
        }else{
            income_tax += 0.05 * (6 - 3);
            income_tax += 0.1 * (9 - 6);
            income_tax += 0.15 * (12 - 9);
            income_tax += 0.2 * (15 - 12);
            income_tax += 0.3 * (income - 15);
        }
        System.out.println("Your income tax is expected to be: "+income_tax);

        //Q
    }
}
