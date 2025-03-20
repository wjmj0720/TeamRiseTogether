package com.metaverse.risetogether.z_activity.lesson;

import java.util.ArrayList;
import java.util.List;

public class BookManager {

    private List<Book> books;

    public BookManager() {
        books = new ArrayList<Book>();
    }

    // 도서 추가 하는 메서드
    public void addBook(Book book) {
        books.add(book);
    }

    // 도서 삭제하는 메서드
    public boolean removeBook(String title){
        for (Book book : books) {
            if(book.getTitle().equals(title)){
                books.remove(book);
                return true;
            }
        }
        return false;
    }

    // 도서 목록을 문자열로 반환 하는 메서드
    public String listBook() {
        String result = "";
        if (books.isEmpty()) {
            return "도서 목록에 책이 없습니다.";
        }

        for (Book book : books) {
            result += book.toString() +"; ";
        }

        return result;
    }

    public static void main(String[] args) {
        BookManager bookManager = new BookManager();

        // 도서의 정보가 추가 되기전 도서 목록 리스트에 목록이 존재하고 있는지 확인
        System.out.println("Book 정보 추가 되기 전 도서 목록 리스트 확인 : " + bookManager.listBook());

        // bookManager에 Book 정보를 추가
        bookManager.addBook(new Book("Clean Code", "Robert C. Martin", 45.0));
        bookManager.addBook(new Book("Effective Java", "Joshua", 55.0));

        // 도서 목록 리스트에 Book 내용이 정상적으로 추가 되었는지 확인
        System.out.println("도서 목록에 추가된 리스트 확인 : " + bookManager.listBook());

        // 도서 삭제
        bookManager.removeBook("Clean Code");

        // 도서가 정상적으로 삭제되었는지 확인
        System.out.println(bookManager.listBook());
    }
}
