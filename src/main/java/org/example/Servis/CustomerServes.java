package org.example.Servis;

import org.example.Data.Person;
import org.example.Data.Customer;


import java.util.ArrayList;
import java.util.List;

public class CustomerServes implements DataServis {

    private final List<Person> castomerList;

    private Integer id;

    public CustomerServes() {

        this.castomerList = new ArrayList<Person>();
    }

    @Override
    public void userCreate(String firstName, String patronymic, String lastName, String position, String phoheNamber, Boolean priority) {
        id = 0;
        for (Person item:this.castomerList) {
            if(item instanceof Customer){
                if(id<((Customer)item).getId()){
                    id = ((Customer)item).getId();
                }
            }
        }
        id++;
        // id,  firstName, patronymic, lastName,  position,  phoheNamber, priority
        this.castomerList.add(new Customer(id, firstName,patronymic,lastName, position, phoheNamber, priority ));

    }

    @Override
    public List<Person> getAll() {

        return castomerList;
    }

    @Override
    public void userDelete(Integer param) {
        for (Person item:this.castomerList) {
            if(item instanceof Customer){
                if(param.equals(((Customer)item).getId())){
                    this.castomerList.remove(item);
                }
            }
        }

    }

    @Override
    public String toString() {
        return "CustomerServes{" +
                "castomerList=" + castomerList +
                ", id=" + id +
                '}';
    }
}
