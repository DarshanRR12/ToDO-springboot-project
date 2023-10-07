package com.codebase.todolist.stuff;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TodoList { // can change TodoList to Todo
    @Id
    private String id; // can replace string with int
    private String taskName;
    private String taskStatus;
    // can use enum to store fixed states

    public TodoList(){

    }

    public TodoList(String id, String taskName){
        this.taskName = taskName;
        this.id = id;
        this.taskStatus = "not done";
    }

    public TodoList(String id, String taskName, String taskStatus){
        this.id = id;
        this.taskName = taskName;
        this.taskStatus = taskStatus==null ? "Not done": taskStatus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus==null ? "Not done": taskStatus;
    }
}
