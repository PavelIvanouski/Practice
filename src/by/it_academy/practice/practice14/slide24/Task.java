package by.it_academy.practice.practice14.slide24;

import java.util.UUID;
//Программа для управления задачами на проекте.
//
//Описать задачу. Каждая задача характеризуется уникальным идентификатором, описанием,
//статусом (например, “выполнена”, “в ожидании”, “в процессе выполнения”) и приоритетом.
//Ваша задача - создать класс Task, который будет представлять задачу в проекте.
//
//Описать проект. Каждый проект имеет название, содержит список задач.
public class Task {
    private String discription;
    private UUID id;
    private Status status;
    private Priority prioraty;

    public Task(Status status, Priority prioraty,String discription) {
        this.discription=discription;
        this.status = status;
        this.prioraty = prioraty;
        this.id=UUID.randomUUID();
    }

    public String getDiscription() {
        return discription;
    }

    public UUID getId() {
        return id;
    }

    public Status getStatus() {
        return status;
    }

    public Priority getPrioraty() {
        return prioraty;
    }

    @Override
    public String toString() {
        return "Task{" +
                "discription='" + discription + '\'' +
                ", id=" + id +
                ", status=" + status +
                ", prioraty=" + prioraty +
                '}';
    }
}