package com.example.boot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
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
    @PostMapping (consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addToDo(@RequestBody Todos todos) {
        toDoRepository.save(todos);
    }
}





