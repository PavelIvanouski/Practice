package by.it_academy.practice.practice14.slide24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class Project {
    private List<Task> tasks;
    private String name;

    public Project(String name) {
        this.tasks = new ArrayList<>();
        this.name = name;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void addTask(Task... tasks) {
        this.tasks.addAll(Arrays.asList(tasks));
    }


    public void removeTask(Task task) {
        tasks.remove(task);
    }

    public int getTasksCount() {
        return tasks.size();
    }

    public List<Task> getTasksByStatus(Status status) {
        List<Task> result = new ArrayList<>();
        for (Task task : tasks) {
            if (task.getStatus().equals(status)) {
                result.add(task);
            }
        }
        return result;
    }

    public Task getTaskById(UUID id) {

        for (int i = 0; i < tasks.size(); i++) {

            if (tasks.get(i).getId().equals(id)) {

                return tasks.get(i);
            }

        }
        throw new RuntimeException(String.format("Task with ID:%s non found", id));
    }

    @Override
    public String toString() {
        return "Project{" +
                "tasks=" + tasks +
                ", name='" + name + '\'' +
                '}';
    }
}