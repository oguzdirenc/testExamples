package com.testexample.demo;

import java.util.ArrayList;
import java.util.List;


public class TodoBusinessImpl {

    TodoService todoService;

    public TodoBusinessImpl() {
       todoService = new TodoService() {
           @Override
           public List<String> retrieveTodos(String user) {
               return null;
           }
       };
    }


    public List<String> retrieveTodosRelatedToSpring(final String user){
        List<String> filteredTodos = new ArrayList<>();
        List<String> todos = todoService.retrieveTodos(user);

        for (String todo : todos){
            if(todo.contains("Spring")){
                filteredTodos.add(todo);
            }
        }
        return filteredTodos;
    }

}
