package org.example;

import java.util.ArrayList;

public class TodoList {
    ArrayList<Task> tasks;

    public TodoList() {
        this.tasks = new ArrayList<Task>();
    }

    public void add(Task task) {
        this.tasks.add(task);
    }

    public void add(String name) {
        Task task = new Task(name);
        this.tasks.add(task);
    }

    public void add(ArrayList<Task> tasks) {
        this.tasks.addAll(tasks);
    }

    public void remove(Task task) {
        this.tasks.remove(task);
    }

    public ArrayList<Task> getTasks() {
        return this.tasks;
    }

    public void complete(String name){
        for (Task task : this.tasks) {
            if (task.getName().equals(name)) {
                task.complete();
                return;
            }
        }
        System.out.println("Task not found.");
    }

    public void complete(){
        System.out.println("Completed Tasks: \n");
        for (Task task : this.tasks) {
            if (task.isCompleted()) {
                System.out.println("- " + task.getName() + "\n");
            }
        }
    }

    public void incomplete(){
        System.out.println("Incomplete Tasks: \n");
        for (Task task : this.tasks) {
            if (!task.isCompleted()) {
                System.out.println("- " + task.getName() + "\n");
            }
        }
    }

    public void all(){
        System.out.println("All Tasks: \n");
        for (Task task : this.tasks) {
            String status = task.isCompleted() ? "[x]" : "[ ]";
            System.out.println(status + " " + task.getName() + "\n");
        }
    }

    public void clear() {
        this.tasks.clear();
    }
}
