package com.company;

class Library_0{//Assuming out library does not have duplicate books
    String [] issuedBooks, availableBooks;
    public Library_0(String ...books){
        availableBooks = new String[books.length];
        issuedBooks = new String[0];
        for(int i = 0; i < books.length; i++){
            availableBooks[i] = books[i];
        }
    }
    public boolean isPresent(String [] arr, String key){
        for(String j : arr){
            if(j == key){
                return true;
            }
        }
        return false;
    }
    public void showAvailableBooks(){
        System.out.println("Books available: ");
        for(String book : availableBooks){
            System.out.println(book);
        }
    }
    public void addBook(String ...books){
        for(String book : books) {
            String[] newBooks = new String[availableBooks.length + 1];
            for (int i = 0; i < availableBooks.length; i++) {
                newBooks[i] = availableBooks[i];
            }
            newBooks[availableBooks.length] = book;
            newBooks = availableBooks;
        }
    }
    /*In case of issuing book, availableBooks decreases in size while issuedBooks increases
     In case of returning book , availableBooks increases in size while issuedBooks decreases*/
    public void issueBook(String ...books){
        for(String book : books) {
            if (availableBooks.length > 0 && isPresent(availableBooks, book)) {
                //Handling issuedBooks
                String[] newBooks = new String[issuedBooks.length + 1];
                for(int i = 0; i < issuedBooks.length; i++) {
                    newBooks[i] = issuedBooks[i];
                }
                newBooks[issuedBooks.length] = book;
                issuedBooks = newBooks;
                //Handling availableBooks(Brute force)
                String[] availableBooks_1 = new String[availableBooks.length - 1];
                boolean flag = false;
                int count = 0;
                for (int i = 0; i < availableBooks.length; i++) {
                    if (availableBooks[i] != book && flag == false) {
                        availableBooks_1[i] = availableBooks[i];
                        count += 1;
                    } else {
                        flag = true;
                        if (count + 1 == i) {
                            availableBooks_1[i] = availableBooks[i + 1];
                        } else if (i != availableBooks.length - 1) {
                            availableBooks_1[i] = availableBooks[i + 1];
                        }
                    }
                }
                availableBooks = availableBooks_1;
            } else {
                System.out.println("Sorry, "+book+" is not at the library at present");
            }
        }
    }
    public void returnBook(String ...books) {
        for(String book : books) {
            if (issuedBooks.length > 0 && isPresent(issuedBooks, book)) {
                //Handling availableBooks
                String[] newBooks = new String[availableBooks.length + 1];
                for (int i = 0; i < availableBooks.length; i++) {
                    newBooks[i] = availableBooks[i];
                }
                newBooks[availableBooks.length] = book;
                availableBooks = newBooks;
                //Handling issuedBooks(Brute force)
                String[] issuedBooks_1 = new String[issuedBooks.length - 1];
                boolean flag = false;
                int count = 0;
                for (int i = 0; i < issuedBooks.length; i++) {
                    if (issuedBooks[i] != book && flag == false) {
                        issuedBooks_1[i] = issuedBooks[i];
                        count += 1;
                    } else {
                        flag = true;
                        if (count == i) {
                            issuedBooks_1[i] = issuedBooks[i + 1];
                        } else if (i != issuedBooks.length - 1) {
                            issuedBooks_1[i] = issuedBooks[i + 1];
                        }
                    }
                }
                issuedBooks = issuedBooks_1;
            } else {
                System.out.println("Sorry, your book: "+book+" is not of our library");
            }
        }
    }

}
public class Lib_Erroneous {
    public static void main(String[] args) {
        Library_0 L = new Library_0("Anne Frank", "Autobiography of a Yogi", "The Snow Leopard", "The Alchemist", "The Art of War");
        L.showAvailableBooks();
        System.out.println();
        L.addBook("The 7 Spiritual Laws of Success");
        L.showAvailableBooks();
        System.out.println();
        L.issueBook("The Snow Leopard", "The Alchemist");
        L.showAvailableBooks();
        System.out.println();
        L.returnBook("The Alchemist");
        L.showAvailableBooks();
    }
}
