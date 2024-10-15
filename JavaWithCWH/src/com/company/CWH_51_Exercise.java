package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Libr {
    String[] books;

    Libr(String ...names){
        books = new String[names.length];

        for(int i=0; i<names.length; i++) {
            books[i] = names[i];
        }
    }

    void addBook(String name){
        int length = books.length;
        String[] newBooks = new String[length+1];
        for(int i=0; i<length; i++){
            newBooks[i] = books[i];
        }

        newBooks[length] = name;
        books = newBooks;
    }

    void showAvailableBooks(){
        for(String book: books){
            System.out.println(book);
        }
    }

    void issueBook(String name){
        List<String> list = new ArrayList<String>(Arrays.asList(books));
        list.remove(name);
        books = list.toArray(new String[0]);
    }

    void returnBook(String name){
        int length = books.length;
        String[] newBooks = new String[length+1];
        for(int i=0; i<length; i++){
            newBooks[i] = books[i];
        }

        newBooks[length] = name;
        books = newBooks;
    }
}

public class CWH_51_Exercise {
    public static void main(String[] args) {
        Libr l = new Libr("Harry Potter", "Five point someone");

        l.showAvailableBooks();

        l.issueBook("Harry Potter");
        l.returnBook("Harry Potter");

        l.addBook("NCERT Maths");

        l.showAvailableBooks();
    }
}