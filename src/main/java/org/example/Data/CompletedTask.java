package org.example.Data;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class CompletedTask{

    private AddedNewTask addedNewTask;
    private Administrant administrant;

    public CompletedTask(AddedNewTask addedNewTask, Administrant administrant) {
        this.addedNewTask = addedNewTask;
        this.administrant = administrant;
    }

    public AddedNewTask getAddedNewTask() {
        return addedNewTask;
    }

    public void setAddedNewTask(AddedNewTask addedNewTask) {
        this.addedNewTask = addedNewTask;
    }

    public Administrant getAdministrant() {
        return administrant;
    }

    public void setAdministrant(Administrant administrant) {
        this.administrant = administrant;
    }

    @Override
    public String toString() {
        return "CompletedTask{" +
                "addedNewTask=" + addedNewTask +
                ", administrant=" + administrant +
                '}';
    }
}
