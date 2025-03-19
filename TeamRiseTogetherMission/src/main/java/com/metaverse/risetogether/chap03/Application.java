package com.metaverse.risetogether.chap03;

public class Application {
    public static void main(String[] args) {
        EBook ebook = new EBook("자바는 어려운거 같은데... 이말 쓰지말고 쉽지 않은데....","Java",20000,300);
        ebook.Ebook();
        ebook.printedBook();

        PrintedBook printedBook = new PrintedBook("자바는 어려운거 같은데.... 이말 쓰지말고 쉽지 않은걸","Java",40000,200);
        printedBook.printEbook();
        printedBook.printedEBook();
    }
}
