package com.company;

class Circle{
    public int radius;

    public Circle(){
        System.out.println("I am Circle's non-parametrized constructor");
        this.radius = 5;
    }

    public Circle(int r){
        System.out.println("I am Circle's parametrized constructor");
        this.radius = r;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double area(int r){//Note double here
        return Math.PI * Math.pow(r, 2);
    }
}

class Cylinder_1 extends Circle{//We had duplicate class "Cylinder" in package com.company and so change this class's name
    public int radius, height;

    public Cylinder_1(){
        System.out.println("I am Cylinder_1's non-parametrized constructor");
        radius = 1;
        height = 10;
    }

    public Cylinder_1(int r, int h){
        //super(r);
        System.out.println("I am Cylinder_1's parametrized constructor");
        this.radius = r;
        this.height = h;
    }

    public int getRadius(){
        return radius;
    }
    public void setRadius(int r){
        radius = r;
    }

    public int getHeight(){
        return height;
    }

    public void setHeight(int h){
        height = h;
    }

    public float surfaceArea(){
        return (float)((2 * Math.PI * this.getRadius() * this.getHeight()) + (2 * Math.PI * Math.pow(this.getRadius(), 2)));
    }

    public float volume(){
        return (float) (Math.PI * Math.pow(this.getRadius(), 2) * this.getHeight());
    }
}

class Rectangle_1{
    public double length, breadth;

    public Rectangle_1(){
        System.out.println("I am Rectangle_1's non-parametrized constructor");
        this.length = 3;
        this.breadth = 6;
    }

    public Rectangle_1(double l, double b){
        System.out.println("I am Rectangle_1's parametrized constructor");
        this.length = l;
        this.breadth = b;
    }
    public double perimeter(double l, double b){
        return 2 * (l + b);
    }

    public double area(double l, double b){
        return l * b;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double getBreadth() {
        return breadth;
    }
}

class Cuboid extends Rectangle_1{
    public double length, breadth, height;

    public Cuboid(){
        System.out.println("I am Cuboid's non-parametrized constructor");
        this.length = 3;
        this.breadth = 6;
        this.height = 9;
    }

    public Cuboid(double l, double b, double h){
        super(l, b);
        System.out.println("I am Cuboid's parametrized constructor");
        this.length = l;
        this.breadth = b;
        this.height = h;
    }

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getBreadth() {
        return breadth;
    }

    @Override
    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double surfaceArea(double l, double b, double h){
        return 2 * (l*b + b*h + l*h);
    }

    public double volume(double l, double b, double h){
        return l * b * h;
    }
}
public class PracticeSet_Ch10 {
    public static void main(String[] args) {
        //Q1
        System.out.println("Q1: ");
        Cylinder_1 Cy = new Cylinder_1(2, 10);
        //Q2
        System.out.println("Q2: ");
        Cuboid C = new Cuboid(1, 2, 3);
        Rectangle_1 R0 = new Cuboid();
        Rectangle_1 R = new Cuboid(4, 8, 12);
        //Not allowed: Cuboid C_test = new Rectangle_1();
        System.out.println("Breadth of R is: "+R.getBreadth());//The overridden getBreadth gets run
    }
}
