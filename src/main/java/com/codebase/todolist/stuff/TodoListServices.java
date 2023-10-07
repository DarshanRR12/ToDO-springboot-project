package com.codebase.todolist.stuff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TodoListServices {
    @Autowired
    private TodoListRepository todoListRepository;

    public List<TodoList> getAllTasks(){
        List<TodoList> todoLists = new ArrayList<>();
        todoListRepository.findAll().forEach(todoLists::add);
        return todoLists;
    }

    public void addTask(TodoList todoList) {
        todoListRepository.save(todoList);
    }

    public Optional<TodoList> getTask(String id) {
        return todoListRepository.findById(id);
    }

    public void deleteTaskById(String id) {
        todoListRepository.deleteById(id);
    }

    public void deleteAllTasks() {
        todoListRepository.deleteAll();
    }

    public void completeTask(String id) {
        Optional<TodoList> todo = todoListRepository.findById(id);
        if(todo.isEmpty()){
            return;
        }
        TodoList todoSave = todo.get();
        todoSave.setTaskStatus("Complete");
        todoListRepository.save(todoSave);
    }
}
