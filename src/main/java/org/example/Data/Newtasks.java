package org.example.Data;

import java.util.Date;

public class Newtasks extends Task{

    private Boolean priorityTask;


    public Newtasks( Date enteredDate, String deadline, String textTask, Boolean priorityTask) {
        super(enteredDate, deadline, textTask );
        this.priorityTask = priorityTask;

    }


    public Boolean getPriorityTask() {
        return priorityTask;
    }

    public void setPriorityTask(Boolean priorityTask) {
        this.priorityTask = priorityTask;
    }


    @Override
    public String toString() {
        return "Newtasks{" +
                "priorityTask=" + priorityTask +
                ", id=" +
                '}'+super.toString();
    }
}
