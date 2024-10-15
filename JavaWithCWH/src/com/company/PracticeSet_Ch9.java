package com.company;
//import java.lang.Math;(Not necessary to import this)

class Cylinder{
    int radius, height;
    public Cylinder(){
        radius = 1;
        height = 10;
    }
    public Cylinder(int r, int h){
        radius = r;
        height = h;
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
        return (float)((2 * 3.14f * this.getRadius() * this.getHeight()) + (2 * 3.14f * Math.pow(this.getRadius(), 2)));
    }
    public float volume(){
        return (float) (3.14f * Math.pow(this.getRadius(), 2) * this.getHeight());
    }
}
class Rectangle{
    int length, breadth;
    public Rectangle(){
        this.length = 4;
        this.breadth = 5;
    }
    public Rectangle(int l, int b){
        this.length = l;
        this.breadth = b;
    }
}
class Sphere{
    int radius;
    public Sphere(){
        radius = 1;
    }
    public Sphere(int r){
        radius = r;
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int r){
        radius = r;
    }
    public float surfaceArea(){
        return (float)( 4 * 3.14f * Math.pow(this.getRadius(), 2));
    }
    public float volume(){
        return (float) (4f/3 * 3.14f * Math.pow(this.getRadius(), 3));//Writing f after f is essential
    }
}
public class PracticeSet_Ch9 {
    public static void main(String[] args) {
        //Q1
        System.out.println("Q1: ");
        Cylinder C = new Cylinder(11, 29);
        //int rad = C.getRadius();
        System.out.println("Radius of cylinder: "+C.getRadius());
        //int hei = C.getHeight();
        System.out.println("Height of cylinder: "+C.getHeight());
        C.setRadius(15);
        C.setHeight(50);
        System.out.println("Updated radius: "+C.getRadius());
        System.out.println("Updated height: "+C.getHeight());
        //Q2
        System.out.println("Q2: ");
        System.out.println("Surface area of this cylinder: "+C.surfaceArea());
        System.out.println("Volume of this cylinder: "+C.volume());
        //Q3
        System.out.println("Q3: ");
        Cylinder newCylinder = new Cylinder();
        System.out.println("Radius of new cylinder: "+newCylinder.getRadius());
        System.out.println("Height of new cylinder: "+newCylinder.getHeight());
        //Q4
        System.out.println("Q4: ");
        Rectangle R = new Rectangle();
        System.out.println("Our rectangle has length "+R.length+" & breadth "+R.breadth);
        //Q5
        System.out.println("Q5: ");
        Sphere S = new Sphere(5);
        System.out.println("Surface area of this sphere: "+S.surfaceArea());
        System.out.println("Volume of this sphere: "+S.volume());
    }
}
