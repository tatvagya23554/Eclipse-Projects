package com.company;
import java.util.Scanner;

public class PracticeSet_Ch6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Q1
        System.out.println("Q1: ");
        float []  marks = {5.5f, 11.11f, 14.14f, 29.29f, 59.59f};
        float sum=0;
        for(float element : marks){
            sum += element;
        }
        System.out.println("Desired sum: "+sum);
        System.out.println("\n");

        //Q2
        System.out.println("Q2: ");
        System.out.print("Number of elements: ");
        int N = sc.nextInt();
        int [] Q2 = new int[N];
        System.out.print("Enter the elements: ");
        for(int i = 0; i < N; i++){
            Q2[i] = sc.nextInt();
        }
        System.out.print("Check presence of: ");
        int present = sc.nextInt();
        int count = 0;
        for(int element : Q2){
            count++;
            if(element == present){
                System.out.println("Yes, your element is present");
                break;
            }else{
                if(count == Q2.length){
                    System.out.println("No, your element is not present");
                }
                continue;
            }
        }
        System.out.println("\n");

        //Q3
        System.out.println("Q3: ");
        float[] phyMarks = {31.5f, 78.0f, 87.5f, 99.5f, 100.0f};
        float total = 0f;
        int length = 0;
        for(float mark : phyMarks){
            total += mark;
            length += 1;
        }
        float avg = total/length;
        System.out.println("Desired average: "+avg);
        System.out.println("\n");

        //Q4
        System.out.println("Q4: ");
        int [][] matrix_1 = new int [2][3];
        int [][] matrix_2 = new int [2][3];
        matrix_1[0][0] = 1;
        matrix_1[0][1] = 2;
        matrix_1[0][2] = 3;
        matrix_1[1][0] = 4;
        matrix_1[1][1] = 5;
        matrix_1[1][2] = 6;

        matrix_2[0][0] = 7;
        matrix_2[0][1] = 8;
        matrix_2[0][2] = 9;
        matrix_2[1][0] = 10;
        matrix_2[1][1] = 11;
        matrix_2[1][2] = 12;

        int [][] result = new int [2][3];
        System.out.println("Result matrix: ");
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                result[i][j] = matrix_1[i][j] + matrix_2[i][j];
                System.out.printf("%d ",result[i][j]);
            }
            System.out.println("");
        }
        System.out.println("\n");

        //Q5
        System.out.println("Q5: ");
        float [] sample = {11.3f, 44.6f, -60.5f, 83.6f, -130.8f};
        int len = sample.length;
        float [] resultant = new float[len];
        int len_copy = len;
        for(int i = 0; i < len; i++){
            resultant[len_copy - 1] = sample[i];
            len_copy -= 1;
        }
        /*Alternate:
        for(int i = 0; i < len/2; i++){
            float temp = sample[i];
            sample[i] = sample[len - 1- i];
            sample[len -1 - i] = temp;
        }*/
        System.out.print("Reversed sample is: ");
        for(float element : resultant){
            System.out.print(element+" ");
        }
        System.out.println("\n");

        //Q6 & Q7
        System.out.println("Q6 & Q7: ");
        float maxi = sample[0];
        float mini = sample[0];
        for(float element : sample){
            if(element > maxi){
                maxi=element;
            }
            if(element < mini){
                mini=element;
            }
        }
        System.out.println("Max element: "+maxi);
        System.out.println("Min element: "+mini);
        System.out.println("\n");

        //Q8
        System.out.println("Q8: ");
        boolean isSorted = true;
        for(int i=0; i < sample.length-1; i++){
            if(sample[i] > sample[i+1]){
                isSorted = false;
            }
        }
        if(isSorted){
            System.out.println("The array is sorted");
        }else{
            System.out.println("Your array is not sorted");
        }
        System.out.println("\n");
    }
}
