package com.metaverse.risetogether.z_activity.LJH.Module06Mission;
import java.util.*;

public class RentalManager {
    Map<String, List<Book>>bookInfo = new HashMap<String, List<Book>>();

    String rentBook(String memberId,Book book){
        if(bookInfo.get(memberId) != null){
            bookInfo.get(memberId).add(book);

            return "회원ID: "+memberId+", "+book.getTitle()+"대출.";
        }else{
            /*
             * arrayList의 생명주기는 bookInfo와 함께함.
             * new 키워드가 동시에 참조를 반환하여 전역변수 bookInfo에 기록하기 때문!
             * */
            bookInfo.put(memberId, new ArrayList<>());
            bookInfo.get(memberId).add(book);

            return "회원ID: "+memberId+", "+book.getTitle()+"대출.";
        }
    }
    String returnBook(String memberId,Book book){
        if(bookInfo.get(memberId) != null){
            if(bookInfo.get(memberId) != null){
                bookInfo.get(memberId).remove(book);
                return "회원ID: "+memberId+", "+book.getTitle()+"반납.";
            }else{
                return "반납할 책이 존재하지 않습니다.";
            }
        }else{
            return "반납할 회원이 존재하지 않습니다.";
        }
    }



    String getRentalList(String memberId){
        StringJoiner result = new StringJoiner("];[");
        for(Book book : bookInfo.get(memberId) ){
            result.add(book.getTitle());
        }
        return "회원ID: "+memberId+" -> 대여 도서: "+"["+result.toString()+"]";
    }
}
/*
 * RentalManager
 *
 * rentBook-> LibraryMember.getid로 키 , 리스트 ㅏㄹ당
 *
 * */