package com.metaverse.risetogether.chap01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ApplicationTest {
        @Test
        void TestProcessing() {
                Application homeWork01 = new Application();
                int[] input = {2, 4, 5, 7};

                String value = homeWork01.numberCounting(input);
                String result = "Even, Even, Odd, Odd";
                Assertions.assertEquals(result, value);  // 예상 결과와 실제 결과 비교
    }
}