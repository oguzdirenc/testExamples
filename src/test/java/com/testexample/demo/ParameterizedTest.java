package com.testexample.demo;

import org.apache.tomcat.util.buf.StringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.*;


import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class ParameterizedTest {


    MathUtils util;

    @BeforeEach
    void init(){
        util  = new MathUtils();
    }

    @org.junit.jupiter.params.ParameterizedTest
    @ValueSource( ints = {1,2,3})
    void isPalindrome(int a){
        assertTrue(util.isLessThenFive(a));
    }

    @org.junit.jupiter.params.ParameterizedTest
    @NullSource
    @EmptySource
    void nullAndEmptyStrings(String text){
        assertTrue(text==null || text.isEmpty());
    }

    @org.junit.jupiter.params.ParameterizedTest
    @MethodSource("com.testexample.demo.ParameterizedData#addNumbers")
    void addNumbersTest(int a, int b,int expected){
        assertEquals(expected,util.add(a,b));
    }

    @org.junit.jupiter.params.ParameterizedTest
    @ArgumentsSource(ParameterizedTestProvider.class)
    void addTwoNumbersTest(int a, int b,int expected){
        assertEquals(expected,util.add(a,b));
    }


    @Test
    void testAdd(){
        int result = util.add(0,1);
        assertEquals(1, result);
    }
}
