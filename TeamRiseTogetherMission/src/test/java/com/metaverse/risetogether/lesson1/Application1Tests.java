package com.metaverse.risetogether.lesson1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Application1Tests {
    @Test
    void calculate(){
        String result = Application1.lengthCalculate("HIII MY NAME");
        Assertions.assertEquals("HIII: 4, MY: 2, NAME: 4, 총 길이: 10",result);
    }
}
