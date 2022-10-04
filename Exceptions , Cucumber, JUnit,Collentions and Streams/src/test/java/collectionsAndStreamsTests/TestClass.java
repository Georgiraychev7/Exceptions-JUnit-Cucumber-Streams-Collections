package collectionsAndStreamsTests;

import collectionsAndStreams.Book;
import collectionsAndStreams.Utils;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import java.util.HashSet;
import java.util.Set;

public class TestClass {

    private Set<Book> store = new HashSet<>();

    @BeforeAll
    public void listWithBooks() {

        Book b1 = new Book("Lord of the Rings Fellowship of the ring", 100, 50);
        Book b2 = new Book("Lord of the Rings Two Towers", 50, 35);
        Book b3 = new Book("Lord of the Rings Return of the King", 50, 30);
        Book b4 = new Book("Harry Potter", 70, 60);
        Book b5 = new Book("Meri Popins", 50, 20);
        Book b6 = new Book("Game of thrones", 80, 40);
        Book b7 = new Book("Game of thrones Clash of Kings", 50, 10);
        Book b8 = new Book("Game of thrones A Storm of Swords", 50, 15);
        Book b9 = new Book("Game of thrones A feast of crows", 50, 25);
        Book b10 = new Book("Game of thrones Dance with dragons", 30, 5);

        store.add(b1);
        store.add(b2);
        store.add(b3);
        store.add(b4);
        store.add(b5);
        store.add(b6);
        store.add(b7);
        store.add(b8);
        store.add(b9);
        store.add(b10);
    }


    @Test
    public void printElementsFromSet() {
        Utils.printSecondFourthAndSixthCharacters("I love writing methods so much");
    }

    @Test
    public void returnSizeOfSet() {
        System.out.println(Utils.getSize(Utils.makeSetFromString("My methods are the best methods")));
    }

    @Test
    public void findCheapestBook() {
        Book thirdCheapestBook = Utils.findBookWithCheapestPrice(store);
        System.out.println(thirdCheapestBook);
    }

    @Test
    public void findThirdCheapestBook(){
        Book thirdCheapestBook = Utils.findThirdCheapestBook(store);
        System.out.println(thirdCheapestBook);
    }

}
