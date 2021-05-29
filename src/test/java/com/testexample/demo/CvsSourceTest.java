package com.testexample.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CvsSourceTest {

    MathUtils util;

    @BeforeEach
    void init(){
        util  = new MathUtils();
    }

    @ParameterizedTest
    @CsvSource({"1,2,3"})
    void testAdd(int a,int b, int expected){
        int result = util.add(a,b);
        assertEquals(expected, result);
    }
}
