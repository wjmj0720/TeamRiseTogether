package com.metaverse.risetogether.lesson1;


public class Application1 {
    public static void main(String[] args) {

    }

    public static String lengthCalculate(String stringText){

//        1. 입력 문자열을 `split(" ")`으로 분할하여 단어 배열을 생성한다.
        String Texts[] = stringText.split(" ");
//        2. 배열의 인덱스 0, 1, 2의 단어를 변수에 직접 할당한다.
        String text1 = Texts[0];
        String text2 = Texts[1];
        String text3 = Texts[2];
//        3. 각 단어의 길이를 `length()` 메서드로 계산한다.
        int length1 = text1.length();
        int length2 = text2.length();
        int length3 = text3.length();
//        4. 세 단어의 길이의 합계를 계산한다.
        int lengthFinal = length1+length2+length3;
//        5. 출력을 맞춘다
//        *출력:** "단어1: <길이1>, 단어2: <길이2>, 단어3: <길이3>, 총 길이: <합계>" 형태의 결과 문자열.
//          Assertions.assertEquals("HIII: 4, MY: 2, NAME: 4, 총 길이: 10",result);
        return text1 +": " +length1 +", " +text2 + ": " +length2 +", " +text3 + ": " +length3 + ", 총 길이: " +lengthFinal;
    }
}
