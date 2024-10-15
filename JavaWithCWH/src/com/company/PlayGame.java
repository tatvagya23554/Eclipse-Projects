package com.company;
import java.util.Scanner;
import java.util.Random;

class Game {
    int comp_chosen_num;
    int user_chosen_num;
    int num_attempts;
    public Game(){
        Random ran = new Random();
        this.comp_chosen_num = ran.nextInt(1,101);
    }
    public boolean isCorrectNumber(){
        return user_chosen_num == comp_chosen_num;
    }
    public void feedback(){
        if(user_chosen_num > comp_chosen_num){
            System.out.println("Try for a smaller number!");
        }else{
            System.out.println("Maybe a greater number!");
        }
    }
    public void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        this.user_chosen_num = sc.nextInt();
        this.num_attempts = 1;
        while(!isCorrectNumber()){
            feedback();
            System.out.print("Please try another number: ");
            user_chosen_num = sc.nextInt();
            if(user_chosen_num == 0){
                System.out.println("Your computer chose: "+comp_chosen_num);
                System.out.println("Better luck next time!");
                break;
            }
            num_attempts += 1;
        }
        if(isCorrectNumber()){
            System.out.println("Congratulations! You guessed the correct number in "+num_attempts+" attempts");
        }
    }
}

public class PlayGame{
    public static void main(String[] args) {
        Game G = new Game();
        System.out.println("Welcome to this game!");
        System.out.println("Guess the number, in the interval [1,100], chosen by your computer!");
        System.out.println("Press '0' if you quit. Have fun playing!");
        System.out.print("Guess the number chosen: ");
        G.takeUserInput();
    }
}
