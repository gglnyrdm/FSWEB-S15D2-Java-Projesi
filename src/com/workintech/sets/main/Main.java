package com.workintech.sets.main;

import com.workintech.sets.enums.Priority;
import com.workintech.sets.enums.Status;
import com.workintech.sets.model.Task;
import com.workintech.sets.model.TaskData;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Task task1 = new Task("Java","Write introduction","ann", Priority.LOW, Status.IN_QUEUE);
        Task task2 = new Task("Java", "Write encapsulations","ann",Priority.MED,Status.ASSIGNED);
        Task task3 = new Task("Java","Write inheritance","bob", Priority.HIGH,Status.IN_QUEUE);
        Task task4 = new Task("Java","Write polymorphism","carol",Priority.LOW,Status.ASSIGNED);
        Task task5 = new Task("Java", "Write composition","carol",Priority.MED,Status.IN_QUEUE);
        Task task6 = new Task("Java", "Write abstractions","carol",Priority.HIGH,Status.ASSIGNED);

        Set<Task> allTasks = new HashSet<>();
        allTasks.add(task1);
        allTasks.add(task2);
        allTasks.add(task3);
        allTasks.add(task4);
        allTasks.add(task5);
        allTasks.add(task6);

        Set<Task> annsTasks = new LinkedHashSet<>();
        annsTasks.add(task1);
        annsTasks.add(task2);

        Set<Task> bobsTasks = new LinkedHashSet<>();
        bobsTasks.add(task3);

        Set<Task> carolsTasks = new LinkedHashSet<>();
        carolsTasks.add(task4);
        carolsTasks.add(task5);
        carolsTasks.add(task6);

        TaskData taskData = new TaskData(annsTasks,bobsTasks,carolsTasks);

        System.out.println("All Tasks : " + taskData.getTasks("all"));
        System.out.println("Ann's Tasks : " + taskData.getTasks("ann"));
        System.out.println("Bob's Tasks : " + taskData.getTasks("bob"));
        System.out.println("Carol's Tasks : " + taskData.getTasks("carol"));

        System.out.println("--------------------");
        System.out.println("Differences : " + taskData.getDifference(allTasks, taskData.getTasks("carol")));

        System.out.println("--------------------");
        System.out.println("Ann + Bob : " + taskData.getIntersect(annsTasks,bobsTasks));
        System.out.println("Bob + Carol : " + taskData.getIntersect(bobsTasks,carolsTasks));
    }
}