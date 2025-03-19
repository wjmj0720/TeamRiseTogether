package com.metaverse.risetogether.lesson2;

public class Application {
    public static void main(String[] args) {
        Application app = new Application();
        int[] input = {1,2,4,5,9};
        System.out.println(app.dayWeek(input));
    }
    public String dayWeek(int[] input) {
        String result = "";
        int length = input.length;
        // 1. for문을 사용하여 배열의 각 요소를 순차적으로 처리
        for (int i = 0; i < length; i++) {
            int days = input[i];

            String dayofweek = "";

            // 2. switch 문을 사용하여 각 숫자에 해당하는 요일을 문자열로 변환
            switch (days) {
                case 1: dayofweek = "Monday"; break;
                case 2: dayofweek = "Tuesday"; break;
                case 3: dayofweek = "Wednesday"; break;
                case 4: dayofweek = "Thursday"; break;
                case 5: dayofweek = "Friday"; break;
                case 6: dayofweek = "Saturday"; break;
                case 7: dayofweek = "Sunday"; break;
                default: dayofweek = "Unknown"; break;
            }

            // 3. 변환된 요일 문자열들을 콤마로 구분하여 최종 결과 문자열을 생성
            if (i > 0) {
                result += ", ";
            }
                result += dayofweek;
        }
        // 최종 결과 반환
        return result;
    }
}
