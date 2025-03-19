package com.metaverse.risetogether.chap03;

public class EBook extends Book {
    private int fileSize;

    public EBook(String title, String author, int price, int fileSize) {
        super(title, author, price);
        this.fileSize = fileSize;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public void Ebook(){
        System.out.print("EBook : ");
    }

    public void printedBook(){
        System.out.print("Title : " + getTitle());
        System.out.print(", Author : " + getAuthor());
        System.out.print(", Price : " + getPrice());
        System.out.println(", File Size : " + getFileSize() + "MB");
    }
}
