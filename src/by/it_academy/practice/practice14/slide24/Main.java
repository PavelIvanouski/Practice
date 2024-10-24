package by.it_academy.practice.practice14.slide24;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Project project = new Project("New project");
        Task task1 = new Task(Status.WAITING, Priority.LOW, "disp1");
        Task task2 = new Task(Status.IN_PROGRESS, Priority.HIGH, "disp2");
        Task task3 = new Task(Status.IN_PROGRESS, Priority.MEDIUM, "disp3");
        Task task4 = new Task(Status.WAITING, Priority.HIGH, "disp4");
        System.out.println(project);
        project.addTask(task1, task2, task3, task4);
        System.out.println(project);
        project.removeTask(task1);
        System.out.println(project);
        Task taskById = project.getTaskById(task2.getId());
        System.out.println(taskById);

        List<Task> tasksWaiting = project.getTasksByStatus(Status.WAITING);
        System.out.println("Waiting :" + tasksWaiting);


    }
}