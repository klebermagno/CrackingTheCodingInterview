package com.klebermagno.code.advanced.stream;

import java.util.ArrayList;

public class Library {

    public static void main(String[] args){

        ArrayList<Book> books = populateLibrary();
        books.stream().filter(book -> {return book.getAuthor().startsWith("A");}).forEach(book -> System.out.println(book));
        books.stream().filter(book ->{
            return book.getTitle().startsWith("P");}).
                filter(book->{
                    return book.getAuthor().startsWith("B");}).
                forEach(System.out::println);
        //Parallel
        books.parallelStream().filter(book ->{
                    return book.getTitle().startsWith("P");}).
                filter(book->{
                    return book.getAuthor().startsWith("B");}).
                forEach(System.out::println);
    }

    static ArrayList<Book> populateLibrary(){
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Alberto","Guerra e paz"));
        books.add(new Book("Belberto","Paz e Guerra"));
        books.add(new Book("Calberto","Canudos"));
        books.add(new Book("Dalberto","WWI"));
        books.add(new Book("Elaberto","WWII"));
        books.add(new Book("Alberto","Guerra e paz 2"));

        return books;
    }
}

class Book{
    private String author;
    private String title;

    public Book(String author, String title){
        this.author = author;
        this.title=title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}