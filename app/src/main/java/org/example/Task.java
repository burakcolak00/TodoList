package org.example;

public class Task {
    private String name = "";
    private boolean isCompleted;

    public Task(String name) {
        if (name == null || name.isEmpty()) {
        this.name = "Unnamed Task";
        } else {
            this.name = name;
        }
        this.isCompleted = false;
    }

    public Task(String name, boolean isCompleted) {
        this.name = name;
        this.isCompleted = isCompleted;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void complete() {
        this.isCompleted = true;
    }

    public boolean isCompleted() {
        return this.isCompleted;
    }
}
