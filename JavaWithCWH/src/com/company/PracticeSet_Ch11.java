package com.company;

//Q1
abstract class Pen{
    abstract public void write();
    abstract public void refill();
}
//Q2
class FountainPen extends Pen{
    public void changeNib(){
        System.out.println("Changing nib...");
    }
    public void write(){
        System.out.println("Starting to write...");
    }
    public void refill(){
        System.out.println("Proceeding to refill ink...");
    }
}
//Q3
class Monkey{
    public void jump(){
        System.out.println("About to jump!");
    }
    public void bite(){
        System.out.println("About to bite!");
    }
}
interface BasicAnimal{//Correction in Q: () after sleep is missing
    public void eat();
    public void sleep();
}
class Human extends Monkey implements BasicAnimal{
    public void speak(){
        System.out.println("Starting to speak...");
    }
    public void eat(){
        System.out.println("Eating food...");
    }
    public void sleep(){
        System.out.println("Sleeping...");
    }
}
//Q4
abstract class Telephone{
    abstract public void ring();
    abstract public void lift();
    abstract public void disconnect();
}
class SmartTelephone extends  Telephone{
    public SmartTelephone(){
        System.out.println("This is a smart telephone");
    }
    public void greet(){
        System.out.println("Welcome user");
    }
    public void ring(){
        System.out.println("Ringing...");
    }
    public void lift(){
        System.out.println("Picking up the call");
    }
    public void disconnect(){
        System.out.println("Cutting the call");
    }
}
//Q6
interface TV_Remote{
    void chooseChannel(int channel);
    void pressOK();
}
interface SmartTV_Remote extends TV_Remote{
    void swipe();
    void manageScreenLight();
    void navigateTo();
}
class TV implements TV_Remote{
    public void chooseChannel(int channel){
        System.out.println("Starting channel "+channel);
    }
    public void pressOK(){
        System.out.println("OK");
    }
}
public class PracticeSet_Ch11 {
    public static void main(String[] args) {
        //Q3
        System.out.println("Q3: ");
        Human H = new Human();
        H.jump();
        H.bite();
        Monkey M = new Human();
        //M.speak();
        M.jump();
        M.bite();
        //Q4
        System.out.println("Q4: ");
        SmartTelephone st = new SmartTelephone();
        st.greet();
        Telephone T = new SmartTelephone();
        T.ring();
        T.lift();
        T.disconnect();
        //T.greet();
        //Q6
        System.out.println("Q6: ");
        TV tv = new TV();
        tv.chooseChannel(357);
        tv.pressOK();
    }
}
