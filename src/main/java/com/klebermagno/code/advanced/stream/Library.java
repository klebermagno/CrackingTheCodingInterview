package com.klebermagno.code.advanced.stream;

import java.util.*;
import java.util.stream.Collectors;
public class Library {

    List<Book> books = new ArrayList<>();

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
                
        books.stream()
            .filter(book -> book.getAuthor().startsWith("A"))
            .map(Book::getTitle)
            .forEach(System.out::println);

        books.stream()
            .filter(book -> book.getAuthor().startsWith("A"))
            .map(Book::getTitle)
            .forEach(System.out::println);

        List<Library> libraries = new ArrayList<>();
        Library l1 = new Library();
        l1.books = populateLibrary();
        libraries.add(l1);
        Library l2 = new Library();
        l2.books = populateLibrary2();
        libraries.add(l2);

        libraries.stream()
                .flatMap(library -> library.books.stream())
                .forEach(System.out::println);
        Comparator<Book> byAuthor = (book1, book2) -> {return book1.getAuthor().compareTo(book2.getAuthor());};
        Collections.sort(books, byAuthor);
    }

    static ArrayList<Book> populateLibrary(){
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Dalberto","WWI"));
        books.add(new Book("Elaberto","WWII"));
        books.add(new Book("Alberto","Guerra e paz 2"));
        return books;
    }
    static ArrayList<Book> populateLibrary2(){
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Alberto","Guerra e paz"));
        books.add(new Book("Belberto","Paz e Guerra"));
        books.add(new Book("Calberto","Canudos"));
        return books;
    }

}

class Book{
    private String author;
    private String title;
    List<Pages> pages = new ArrayList<>();

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

class Pages{
    private String content;
    private int number;

    public Pages(String content, int number){
        this.content = content;
        this.number = number;
    }
    public String getContent() {
        return content;
    }
    public int getNumber() {
        return number; 
   }
   public void setContent(String content) {
       this.content = content;
   }
   public void setNumber(int number) {
       this.number = number;
   }
}