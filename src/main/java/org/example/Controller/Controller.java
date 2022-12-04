package org.example.Controller;

import org.example.Data.*;
import org.example.Servis.AddTask;
import org.example.Servis.AdministrantServis;
import org.example.Servis.CustomerServes;
import org.example.Servis.PerformTask;
import org.example.view.SendConsole;

import java.util.List;
import java.util.Map;

public class Controller {
    private AddTask addTask = new AddTask();
    private AdministrantServis administrantServis = new AdministrantServis();
    private CustomerServes customerServes = new CustomerServes();
    private PerformTask performTask = new PerformTask();
    private SendConsole sendConsole = new SendConsole();



    public void setNewAdministrant(String firstName, String patronymic, String lastName, String position, String phoheNamber, Boolean rank){
        administrantServis.userCreate(firstName, patronymic, lastName, position, phoheNamber, rank);
    }
    public void  setNewCustomer(String firstName, String patronymic, String lastName, String position, String phoheNamber, Boolean priority){
        customerServes.userCreate(firstName,patronymic, lastName, position, phoheNamber, priority);
    }
    public void setNewTask(String enterLastName, String textTask, Boolean priorityTask, String deadline) {
        for (Person customer : customerServes.getAll()) {
            if (enterLastName.equalsIgnoreCase(customer.getLastName())) {
                addTask.AddNewTask((Customer) customer, textTask, priorityTask, deadline);
            }

        }
    }
    public void setperformTask(Integer id, String adminsLastName){
        List<AddedNewTask> addedNewTasks = addTask.getAll();
        for (AddedNewTask task:addedNewTasks) {
            if(id.equals(task.getId())){
                for (Person admin: administrantServis.getAll()) {
                    if(adminsLastName.equalsIgnoreCase(admin.getLastName())){
                        performTask.CompletTask(task,(Administrant) admin);
                    }

                }
            }

        }

    }
    public void printNewTask(){
        List<AddedNewTask> newTask = addTask.getAll();
        System.out.println(newTask);

    }
    public void printPerformTask(){
        List<CompletedTask> completedTasks = performTask.getAll();
        System.out.println(completedTasks);

    }
    public void printAdministrant(){
        List<Person> administrantList = administrantServis.getAll();
        sendConsole.SendPerson(administrantList);

    }

    public void printCustomer(){
        List<Person> customer = customerServes.getAll();
        sendConsole.SendPerson(customer);

    }

}
