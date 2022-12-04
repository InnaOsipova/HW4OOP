package org.example.Servis;
import java.text.DateFormat;
import java.util.*;

import org.example.Data.Administrant;
import org.example.Data.Customer;
import org.example.Data.Newtasks;

public class WorkWithTasks {
    Newtasks newtasks;
    List <Customer> customersList;
    Map<Integer,Map<Customer, Newtasks>> newTasksList;
    Integer id;
    String enterLastName;
    List<Newtasks> newtasksList;

    public void AddNewTask(String enterLastName, String textTask, Boolean priorityTask, Date deadline){
        id=0;
        Map<Customer,Newtasks> newTask = new HashMap<>();
        for (Customer customer: customersList     ) {
            if(enterLastName.equalsIgnoreCase(customer.getLastName())){
                for (Map.Entry<Integer, Map<Customer, Newtasks>> task :this.newTasksList.entrySet()) {
                     if (id < ((Newtasks) task).getId()) {
                            id = ((Newtasks) task).getId();
                     }
                }
            }
            id++;
            Locale local = new Locale("ru","RU");
            DateFormat df = DateFormat.getDateInstance(DateFormat.DEFAULT, local);
            Date currentDate = new Date();

                this.administrantList.add(new Customer(firstName,patronymic,lastName, position, phoheNamber,id));
            }

        }



    }

}
