package org.example;

import org.example.Controller.Controller;
import org.example.Data.Customer;
import org.example.Data.Person;
import org.example.Servis.CustomerServes;

import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.setNewAdministrant("Ivan","Ivanovich","Ivanov","it", "899999999", true);
        controller.setNewAdministrant("Alex", "Vitalievich", "Veret","main it","8777779999", false);
        //controller.printAdministrant();
        controller.setNewCustomer("Inna","Viktorovna","Osipova","acounter","86677888", true);
        //controller.printCustomer();
        controller.setNewTask("Osipova","Не работает ноут",true,"2022-12-06-14-36-00");
        controller.printNewTask();
        controller.setperformTask(1, "Ivanov");
        controller.printPerformTask();
    }

}