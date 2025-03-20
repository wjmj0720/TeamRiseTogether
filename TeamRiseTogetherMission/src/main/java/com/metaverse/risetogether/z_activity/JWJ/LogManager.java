package com.ohgiraffers.z_activity.mission.JWJ;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LogManager {
    String record;
    String filePath;

    public LogManager(String record, String filePath) {
        this.record = record;
        this.filePath = filePath;
    }
    public String getFilePath() {
        return filePath;
    }
    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }



    public static void Managing(String record, String filePath){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath,true))) {
            //전에 했던 것과는 다르게 리스트에 값이 들어가는 것이 아닌
            //filePath에 String record을 적는 것이기 때문에 for문으로 배회해서 넣어줄 필요x
            //append => 덮어쓰기
                writer.write(record); //record를 파일에 저장
                writer.newLine();
            } catch (IOException e) {
            System.err.println("로그 파일 저장중 요류 발생! "+e.getMessage());

        }
    }
}
