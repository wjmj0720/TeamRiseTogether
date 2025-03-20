package com.metaverse.risetogether.z_activity.LJH.Module06Mission;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LogManager {
    public void logTransaction(String record, String filePath){
        System.out.println("=== 서버에서 파일 로그 쓰기 시뮬레이션 ===");
        // log.txt 파일에 로그 추가
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("transaction.log", true))) { // true는 파일에 데이터를 추가하는 모드
            // 문자 데이터를 효율적으로 쓰기 위한 클래스로 이 클래스는 내부적으로 버퍼를 사용하여 데이터를 저장하고,
            // 한 번에 여러 문자를 파일에 쓰는 방식으로 I/O 작업의 성능이 향상된다.
                writer.write(record);
                writer.newLine(); // 줄바꿈
            System.out.println("로그 메시지가 transaction.log에 추가되었습니다.");
        } catch (IOException e) {
            System.out.println("파일 쓰기 실패: " + e.getMessage());
            /*
             * 예외 처리: 파일 쓰기 실패 시 사용자에게 오류 메시지를 반환할 수 있다.
             */
        }

    }
}
