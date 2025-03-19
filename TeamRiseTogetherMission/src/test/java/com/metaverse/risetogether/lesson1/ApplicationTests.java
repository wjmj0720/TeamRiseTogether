package com.metaverse.risetogether.lesson1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ApplicationTests {

    @Test
    void lengthTest(){
        String inputText = "Java Programming Language"; // 3개의단어로 구성된 문자열 입력
        String result = Application.length(inputText); // 메서드 호출

        // 결과 값이 아래와 같은지 확인하기
        String resultWords = "단어1 : 4, 단어2 : 11, 단어3 : 8, 총 길이 : 23";

        // 결과가 예상한 값과 일치하는지 확인
        Assertions.assertEquals(resultWords, result);

    }
}
