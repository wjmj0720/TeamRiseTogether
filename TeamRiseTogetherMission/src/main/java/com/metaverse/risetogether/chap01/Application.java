package com.metaverse.risetogether.chap01;

public class Application {
    public static void main(String[] args) {
        Application h = new Application();
        int[] i = {2, 4, 5, 7};
        System.out.println(h.numberCounting(i));
    }

    public String numberCounting(int[] arr) {
        int length = arr.length;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < length; i++) {
            switch (arr[i] % 2) {
                case 0:
                    result.append("Even");
                    break;
                case 1:
                    result.append("Odd");
                    break;
            }
            if (i < length - 1) {
                result.append(", "); // 마지막 요소가 아닐 때만 쉼표 추가
            }
        }

        return result.toString(); // StringBuilder에서 String으로 변환하여 반환
    }
}
