package org.example.view;

import org.example.Data.*;

import java.util.List;
import java.util.Map;

public class SendConsole {
    public void SendNewTask(List<AddedNewTask> newtasksCustomer){

        System.out.println(newtasksCustomer);
    }
    public void SendPerformTask(List<CompletedTask> completedTasks){
        System.out.println(completedTasks);
    }
    public void SendPerson (List<Person> personList){
        for (Person person:personList) {
            System.out.println(person);
        }

    }


}
