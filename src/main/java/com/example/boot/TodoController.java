package com.example.boot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoController {
    @Autowired
    private ToDoRepository toDoRepository;

    @RequestMapping("/todos")
    public List<Todos> getAllToDos() {
        List<Todos> listTodos = new ArrayList<>();
        toDoRepository.findAll().forEach(listTodos::add);
        return listTodos;
    }
}





