package com.testexample.demo;


import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class TodoBusinessImplMockTest {

    @Mock
    TodoService mockTodoService;

    @InjectMocks
    TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl();

    @Test
    public void test_usingMock(){

       // TodoService mockTodoService =mock(TodoService.class);
        MockitoAnnotations.openMocks(this);

        List<String> todos = Arrays.asList("Spring MVC","Learning Spring","watch udemy");

        when(mockTodoService.retrieveTodos("Dummy")).thenReturn(todos);

        List<String> filteredTodos =todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");

        assertEquals(2,filteredTodos.size());
    }
}
