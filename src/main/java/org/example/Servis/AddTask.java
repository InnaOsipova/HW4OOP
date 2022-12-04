package org.example.Servis;
import java.text.DateFormat;
import java.util.*;

import org.example.Data.*;

public class AddTask {
    private List<AddedNewTask>  newTasksList;

    public AddTask() {
        this.newTasksList = new ArrayList<>();
    }

    public void AddNewTask(Customer customer, String textTask, Boolean priorityTask, String deadline){
        Integer id = 0;
        if(customer instanceof Customer){
            System.out.println(customer);

            for ( AddedNewTask task : newTasksList) {
                     if (id < ((AddedNewTask) task).getId()) {
                            id = ((AddedNewTask) task).getId();
                     }
                }
            }
            id++;
            Locale local = new Locale("ru","RU");
            DateFormat df = DateFormat.getDateInstance(DateFormat.DEFAULT, local);
            Date currentDate = new Date();
            Newtasks newtasks = new Newtasks(currentDate, deadline, textTask, priorityTask);
            this.newTasksList.add(new AddedNewTask(id,customer, newtasks));


    }

    public List<AddedNewTask> getAll() {

        return newTasksList;
    }
    public AddedNewTask getTaskById(Integer taskId){
        for (AddedNewTask newtask: newTasksList) {
            if (taskId.equals(((AddedNewTask)newtask).getId())){
                return newtask;
            }

        }
        return null;
    }

    public void taskDelete(Integer param) {
        if(newTasksList.isEmpty()){
            System.out.println("Нет новых задач на выполнение");
        } else {
                for (AddedNewTask task :this.newTasksList) {
                    if (param.equals(((AddedNewTask) task).getId())) {
                        this.newTasksList.remove(task);
                    }
                }
        }

    }
}
