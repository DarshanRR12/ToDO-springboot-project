package com.codebase.todolist.stuff;

import org.springframework.data.repository.CrudRepository;

public interface TodoListRepository extends CrudRepository<TodoList, String> {

}
