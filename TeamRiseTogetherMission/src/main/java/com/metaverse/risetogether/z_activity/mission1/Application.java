package com.metaverse.risetogether.z_activity.mission1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("고객님 대출 또는 반납 인지 작성해 주세요.");
        String message = scanner.nextLine().trim();

        try(BufferedWriter writer = new BufferedWriter(new FileWriter("transaction.log",true))){
            // System.out.print("고객님 대출 또는 반납 인지 작성해 주세요.");
            writer.write("사용자 입력 : " + message);
            writer.newLine();
            // 대출 인지 반납인지 구분 짓기
            if (message.equalsIgnoreCase("대출")) {
                System.out.print("책 제목을 입력해 주세요: ");
                String bookTitle = scanner.nextLine(); // 대출 정보 입력 중 제목 입력
                System.out.print("책 저자를 입력해 주세요: ");
                String author = scanner.nextLine();
                System.out.print("책 고유의 ISBN 을 입력해 주세요: ");
                String isbn = scanner.nextLine(); // ISBN 정보 입력
                System.out.print("대출 하려는 고객님의 아이디 또는 이름을 작성해 주세요: ");
                String customerInfo = scanner.nextLine(); // 대출하는 고객 정보 입력

                // 대출 정보 기록
                writer.write("대출 정보: ");
                writer.newLine();
                writer.write("===============================================================");
                writer.newLine();
                writer.write("책 제목 및 저자: " + bookTitle);
                writer.newLine();
                writer.write("저자: " + author);
                writer.newLine();
                writer.write("ISBN 정보 : " + isbn);
                writer.newLine();
                writer.write("대출 시간: " + java.time.LocalDate.now());
                writer.newLine();
                writer.write("고객 아이디: " + customerInfo);
                writer.newLine();
                writer.write("===============================================================");
                writer.newLine();
                System.out.println("대출 정보가 저장되었습니다.");

            } else if  (message.equalsIgnoreCase("반납")) {
                System.out.print("책 제목을 입력해 주세요: ");
                String bookTitle = scanner.nextLine(); // 대출 정보 입력 중 제목 입력
                System.out.print("책 저자를 입력해 주세요: ");
                String author = scanner.nextLine();
                System.out.print("책 고유의 ISBN 을 입력해 주세요: ");
                String isbn = scanner.nextLine(); // ISBN 정보 입력
                System.out.print("반납 하려는 고객님의 아이디 또는 이름을 작성해 주세요: ");
                String customerInfo = scanner.nextLine(); // 반납하는 고객 정보 입력

                // 반납 정보 기록
                writer.write("반납 정보: ");
                writer.newLine();
                writer.write("===============================================================");
                writer.newLine();
                writer.write("책 제목 및 저자: " + bookTitle);
                writer.newLine();
                writer.write("저자: " + author);
                writer.newLine();
                writer.write("ISBN 정보 : " + isbn);
                writer.newLine();
                writer.write("반납 시간: " + java.time.LocalDate.now());
                writer.newLine();
                writer.write("고객 아이디: " + customerInfo);
                writer.newLine();
                writer.write("===============================================================");
                writer.newLine();
                System.out.println("반납 정보가 저장되었습니다.");
            }
            writer.flush();
        } catch (IOException e) {
            System.out.println("log 파일 저장 실패 : "   + e.getMessage());
        }finally {
            scanner.close();
        }
    }
}
