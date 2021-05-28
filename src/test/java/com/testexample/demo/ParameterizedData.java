package com.testexample.demo;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class ParameterizedData {
    private static Stream<Arguments> addNumbers(){
        return Stream.of(
                Arguments.of(1,1,2),
                Arguments.of(2,3,5),
                Arguments.of(7,3,10)
        );
    }
}
