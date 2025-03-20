package com.metaverse.risetogether.z_activity.lesson1;

import com.metaverse.risetogether.z_activity.lesson1.model.Book;
import com.metaverse.risetogether.z_activity.lesson1.model.Member;
import com.metaverse.risetogether.z_activity.lesson1.util.FileStorageManager;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        //     - 도서 정보를 담은 Book 객체 리스트
        List<Book> books = List.of(
                new Book("Clean Code","Robert C. Martin " ,45.0),
                new Book("Effective Java","Joshua Bloch", 55.0)
        );
        //    - 회원 정보를 담은 Member 객체 리스트
        List<Member> members = List.of(
                new Member("Alice","LM001"),
                new Member("Bob","LM002")
        );

        FileStorageManager.saveBooksToFile(books,"books.txt");
        FileStorageManager.saveMembersToFile(members,"members.txt");
    }
}

