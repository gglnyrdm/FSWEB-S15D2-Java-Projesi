package com.workintech.sets.model;

import java.util.HashSet;
import java.util.Set;

public class TaskData {
    private Set<Task> annsTasks;
    private Set<Task> bobsTasks;
    private Set<Task> carolsTasks;

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
    }

    public Set<Task> getAnnsTasks() {
        return annsTasks;
    }

    public Set<Task> getBobsTasks() {
        return bobsTasks;
    }

    public Set<Task> getCarolsTasks() {
        return carolsTasks;
    }

    public Set<Task> getTasks(String name){
        if (name.equals("ann")){
            return annsTasks;
        }
        if (name.equals("bob")){
            return bobsTasks;
        }
        if (name.equals("carol")){
            return annsTasks;
        }
        if (name.equals("all")){
            Set<Task> allTasks = new HashSet<>();
            allTasks.addAll(annsTasks);
            allTasks.addAll(bobsTasks);
            allTasks.addAll(carolsTasks);
            return allTasks;
        }
        return null;
    }
    public Set<Task> getUnion(Set<Task>... tasks){
        Set<Task> unionTasks = new HashSet<>();
        for (Set<Task> task: tasks){
            unionTasks.addAll(task);
        }
        return unionTasks;
    }

    public Set<Task> getIntersect(Set<Task> taskList, Set<Task> taskList2){
        Set<Task> intersectTasks = new HashSet<>(taskList);
        intersectTasks.retainAll(taskList2);
        return intersectTasks;
    }

    public Set<Task> getDifference(Set<Task> taskList, Set<Task> taskList2){
        Set<Task> differenceTasks = new HashSet<>(taskList);
        differenceTasks.removeAll(taskList2);
        return differenceTasks;
    }
}
