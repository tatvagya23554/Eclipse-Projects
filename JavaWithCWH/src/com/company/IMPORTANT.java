package com.company;
// If you write the Java Doc comment above package, you would get a Dangling Java Doc Comment Error when creating one

/**
 * This is the first time I am hands-on making a Java Doc
 * If you make a change in the description then for it to show in your Java Doc, you would have to generate
 * the Java Doc again (It would not reflect in your Doc in case you simply refresh it)
 * If you were to open the Java Docs on the same page use (after see):
 *  * <a href="https://docs.oracle.com/en/java/javase/22/docs/api/index.html">Java Docs</a>
 *  * Where a is the anchor tag and href tells of the link to go to
 *  You can write HTML in description and it will show up in the generated Java Doc after getting rendered
 *  This is an <i>italic</i> word. <p>This is a new paragraph.</p>
 *  Note: One liner description VS detailed description
 *  In Java Docs, you can write click and Inspect to see the HTML code
 *  Note: In your HTML code spacing has to be done in a particular way
 *  Pending: Try making your doc by mechanically typing commands in Terminal
 *  Interesting: Exploring concept of Java Docs using Oracle's documentation
 * @author Tatvagya
 * @version 1.0
 * @since 2005
 * @see <a href="https://docs.oracle.com/en/java/javase/22/docs/api/index.html"target="_blank">Java Docs</a>
 */

interface MyCamera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4KVideo(){
        greet();
        System.out.println("Recording in 4k...");
    }
}

interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting... ");
    }

}

class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Taking snap");
    }
//    public void record4KVideo(){
//        System.out.println("Taking snap and recoding in 4k");
//    }
    public String[] getNetworks(){
        System.out.println("Getting List of Networks");
        String[] networkList = {"Harry", "Prashanth", "Anjali5G"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
}

public class IMPORTANT {
    /**
     * @param args These are the arguments supplied to the command line
     */
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.record4KVideo();
        // ms.greet(); --> Throws an error!
        String[] ar = ms.getNetworks();
        for (String item: ar) {
            System.out.println(item);
        }
    }

    /**
     *
     * @param a First number to add
     * @param b Second number to add
     * @return The sum of two numbers
     * @throws Exception when a is 11
     * @deprecated This method is deprecated, please use + operator
     */
    public static double add(int a, int b){
        if(a == 11){
            try {
                throw new Exception();
            }catch (Exception e){
                System.out.println("An exception!");
            }
        }
        return a + b;
    }
}
