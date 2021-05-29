package com.testexample.demo.stub;

import com.testexample.demo.TodoService;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService {
    @Override
    public List<String> retrieveTodos(String user) {
        return Arrays.asList("Spring MVC","Learn to dance");
    }
}