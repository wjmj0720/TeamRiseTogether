package com.metaverse.risetogether.chap03;

public class PrintedBook extends Book{
    private int pageCount;

    public PrintedBook(String title, String author, int price, int pageCount) {
        super(title, author, price);
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void printEbook(){
        System.out.print("PrintedBook : ");
    }

    public void printedEBook(){
        System.out.print("Title : " + getTitle());
        System.out.print(", Author : " + getAuthor());
        System.out.print(", Price : " + getPrice());
        System.out.println(", Page Count : " + getPageCount());
    }
}
