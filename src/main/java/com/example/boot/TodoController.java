package com.example.boot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {
    @Autowired
    private ToDoRepository toDoRepository;

    @GetMapping
    public List<Todos> getAllToDos() {
        List<Todos> listTodos = new ArrayList<>();
        toDoRepository.findAll().forEach(listTodos::add);
        return listTodos;
    }
    @PostMapping
    public void addToDo(@RequestBody Todos todos) {
        toDoRepository.save(todos);
    }
}





