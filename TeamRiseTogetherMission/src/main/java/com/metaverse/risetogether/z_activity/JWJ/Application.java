package com.ohgiraffers.z_activity.mission.JWJ;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("대출/반납");


           Scanner scanner = new Scanner(System.in);
           String record = scanner.nextLine();


        System.out.println("이름 : ");

        System.out.println("도서명 : ");


        //String record = "값";
        LogManager.Managing(record,"transaction.log");

    }

}
