문제 2: 도서 관리 시스템 (캡슐화 + 상속)
요구사항 명세서
Book 클래스

필드
title: 도서 제목을 나타내는 private 필드.
author: 도서 저자를 나타내는 private 필드.
price: 도서 가격을 나타내는 private 필드.
생성자
title, author, price를 초기화하는 생성자를 정의한다.
메소드
getTitle(): 도서 제목을 반환하는 public 메소드.
getAuthor(): 도서 저자를 반환하는 public 메소드.
getPrice(): 도서 가격을 반환하는 public 메소드.
EBook 클래스

상속
Book 클래스를 상속받는다.
필드
fileSize: 전자책 파일 크기를 나타내는 private 필드.
메소드
getFileSize(): 전자책 파일 크기를 반환하는 public 메소드.
setFileSize(double fileSize): 전자책 파일 크기를 설정하는 public 메소드.
PrintedBook 클래스

상속
Book 클래스를 상속받는다.
필드
pageCount: 책의 페이지 수를 나타내는 private 필드.
메소드
getPageCount(): 책의 페이지 수를 반환하는 public 메소드.
setPageCount(int pageCount): 책의 페이지 수를 설정하는 public 메소드.
Main 클래스

EBook과 PrintedBook 객체를 각각 생성하고, 책 제목, 저자, 가격, 파일 크기 또는 페이지 수를 출력하는 프로그램을 작성한다.

출력 예시:
EBook: Title: Java Programming, Author: John Doe, Price: 20, File Size: 5MB
PrintedBook: Title: Advanced Java, Author: Jane Doe, Price: 25, Page Count: 350
