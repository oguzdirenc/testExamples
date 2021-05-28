package com.testexample.demo;


import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathUtilsTest {


    MathUtils util;

    @BeforeEach
    void init(){
     util  = new MathUtils();
    }

    @BeforeAll
    static void beforeAllInit(){
        System.out.println("Runs before all");
    }

    @AfterAll
    static void afterAllInit(){
        System.out.println("Runs after all");
    }

    @AfterEach
    void cleanUp(){
        System.out.println("Cleaning");
    }

    //@DisplayName("Test add method")
    @Test
    void testAdd(){
        int result = util.add(3,5);
        assertEquals(8, result);
    }

    @RepeatedTest(5)
    void testDivide(){

        boolean isServerUp = false;

        // If conditional false do not run test
       // assumeTrue(isServerUp);

        assertThrows(ArithmeticException.class,() ->util.divide(1,0),"Divide by zero should throw");
    }

    @Test
    void multiplyTest(){
        //assertEquals(4,util.multiply(2,2));
        assertAll();
    }

    @Test
    @Disabled
    void disableAnnotation(){
        fail("This test should fail");
    }

    @Test
    void testComputeCircleArea(){
        assertEquals(314.1592653589793,util.computeCircleArea(10),"Should return right circle area");
    }

}