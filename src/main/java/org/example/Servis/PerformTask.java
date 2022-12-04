package org.example.Servis;

import org.example.Data.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class PerformTask {
    private List<CompletedTask> administrantCompletedTask;

    public PerformTask() {
        this.administrantCompletedTask = new ArrayList<>();
    }

    public void CompletTask (AddedNewTask addedNewTask, Administrant administrant) {
        administrantCompletedTask.add(new CompletedTask(addedNewTask,administrant));
    }
    public  List<CompletedTask> getAll(){
        return administrantCompletedTask;
    }
}
