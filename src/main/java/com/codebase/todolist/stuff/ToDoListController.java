package com.codebase.todolist.stuff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ToDoListController {
    @Autowired
    private TodoListServices todoListServices;

    @GetMapping("/tasks")
    public List<TodoList> getAllTasks() {
        return todoListServices.getAllTasks();
    }

    @GetMapping("/tasks/{id}")
    public Optional<TodoList> getTask(@PathVariable String id) {
        return todoListServices.getTask(id);
    }
    @PostMapping("/tasks")
    public void addTask(@RequestBody TodoList todoList){
        todoListServices.addTask(todoList);
    }

    @PutMapping("/tasks/complete/{id}")
    public void completeTask(@PathVariable String id, @RequestBody TodoList todoList){
        todoListServices.completeTask(id);
    }

    @DeleteMapping("/tasks/{id}")
    public void deleteTaskById(@PathVariable String id){
        todoListServices.deleteTaskById(id);
    }

    @DeleteMapping("/tasks")
    public void deleteAllTasks() {
        todoListServices.deleteAllTasks();
        return;
        // return empty json
    }
}
