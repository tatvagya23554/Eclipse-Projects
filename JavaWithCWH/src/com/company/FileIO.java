package com.company;

//import jdk.swing.interop.SwingInterOpUtils;

import java.io.*;


public class FileIO {//Note we write the entire reading and writing part inside a try block
    public static void main(String[] args){
        System.out.println("11 July 2024");
        //The file class
        System.out.println("OUR FIRST TIME USING THE FILE CLASS!");
        File file = new File("secret_message.txt");//If file is outside project give absolute path
        if(file.exists()){
            System.out.println("This file exists! :o!");
            System.out.println(file.getPath());//Gives what all we passed inside the constructor
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            //file.delete();
        }else{
            System.out.println("This file does not exist! :(!");
        }


        //Reading a file
        //Reading a file is considered dangerous code so we tend to surround it with a try-catch block
        //Instead of having double back-slashes in the path, we rather have a single forward-slashes
        System.out.println("OUR FIRST TIME READING A FILE IN JAVA!");
        try {
            FileReader reader = new FileReader("/Users/tatvagyanahar/Desktop/Java/txt fiels/art.txt");
            int data = reader.read();
            while (data != -1){
                System.out.print((char)data);//Make sure to use print and not println
                data = reader.read();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException("File not found " + e.getMessage());
        }  catch (IOException e) {
            throw new RuntimeException("Error reading or writing " + e.getMessage());
        }//throwing, as per the IDE, here appears to be more robust logging than e.printStackTrace()


        //Writing to a file
        System.out.println("\n");
        System.out.println("OUR FIRST TIME WRITING TO A FILE IN JAVA!");
        try {/*Second argument for FileWriter is a boolean value related to appending which MUST be true
            in case you want to just append to an already existing file*/
            FileWriter writer = new FileWriter("/Users/tatvagyanahar/Desktop/Java/txt fiels/poems.txt");
            writer.write("Roses are red\nViolets are blue\nSugar is sweet\nAnd so are you!");
            writer.append("\nAn adorable poem :D");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException("Error in writing to the file " + e.getMessage());
        }
    }
}