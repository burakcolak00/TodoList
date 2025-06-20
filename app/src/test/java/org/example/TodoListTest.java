package org.example;

import org.junit.jupiter.api.Test;

public class TodoListTest {
    @Test
    public void testAddTask() {
        TodoList todoList = new TodoList();
        Task task = new Task("Test Task");
        todoList.add(task);
        assert(todoList.getTasks().contains(task));
    }

    @Test
    public void testAddTaskByName() {
        TodoList todoList = new TodoList();
        todoList.add("Test Task");
        assert(todoList.getTasks().size() == 1);
        assert(todoList.getTasks().get(0).getName().equals("Test Task"));
    }

    @Test
    public void testRemoveTask() {
        TodoList todoList = new TodoList();
        Task task = new Task("Test Task");
        todoList.add(task);
        todoList.remove(task);
        assert(!todoList.getTasks().contains(task));
    }

    @Test
    public void testCompleteTask() {
        TodoList todoList = new TodoList();
        Task task = new Task("Test Task");
        todoList.add(task);
        todoList.complete("Test Task");
        assert(task.isCompleted());
    }

    @Test
    public void testCompleteAllTasks() {
        TodoList todoList = new TodoList();
        Task task1 = new Task("Task 1");
        Task task2 = new Task("Task 2");
        todoList.add(task1);
        todoList.add(task2);
        for (Task task : todoList.getTasks()) {
            task.complete();
        }
        assert(task1.isCompleted() && task2.isCompleted());
    }

    @Test
    public void testIncompleteTasks() {
        TodoList todoList = new TodoList();
        Task task1 = new Task("Task 1");
        Task task2 = new Task("Task 2");
        todoList.add(task1);
        todoList.add(task2);
        todoList.complete("Task 1");
        todoList.incomplete();
        assert(!task2.isCompleted());
    }

    @Test
    public void testAllTasks() {
        TodoList todoList = new TodoList();
        Task task1 = new Task("Task 1");
        Task task2 = new Task("Task 2");
        todoList.add(task1);
        todoList.add(task2);
        todoList.all();
        assert(todoList.getTasks().size() == 2);
    }

    @Test 
    public void testUnnamedTask() {
        TodoList todoList = new TodoList();
        Task task = new Task("");
        todoList.add(task);
        assert(task.getName().equals("Unnamed Task"));
    }

}
