package com.metaverse.risetogether.z_activity.lesson1.util;

import com.metaverse.risetogether.z_activity.lesson1.model.Book;
import com.metaverse.risetogether.z_activity.lesson1.model.Member;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileStorageManager {

    // Book 객체와 LibraryMember 객체의 정보를 파일(예: "books.txt", "members.txt")에 저장한다.
    // 도서 정보를 담은 Book 객체 리스트
    public static void  saveBooksToFile(List<Book> books, String filePath){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))){
            for (Book book : books){
                writer.write(book.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("도서 파일 저장 중 오류 발생 : " + e.getMessage());
        }
    }

    // Book 객체와 LibraryMember 객체의 정보를 파일(예: "books.txt", "members.txt")에 저장한다.
    // 회원 정보를 담은 Member 객체 리스트
    public static void saveMembersToFile(List<Member> members, String filePath){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))){
            for (Member member : members){
                writer.write(member.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("회원 정보 저장 중 오류 발생 : " + e.getMessage());
        }
    }
}

