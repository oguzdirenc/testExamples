package com.testexample.demo;

import com.testexample.demo.stub.TodoServiceStub;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class TodoBusinessImplMockTest {
    @Mock
    TodoService mockTodoService;

    @Test
    public void test_usingMock(){



        TodoService todoServiceStub = new TodoServiceStub();
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);

        List<String> filteredTodos =todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");

        assertEquals(1,filteredTodos.size());
    }
}
