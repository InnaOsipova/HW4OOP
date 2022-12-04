package org.example.Servis;

import org.example.Data.Administrant;
import org.example.Data.Customer;
import org.example.Data.Person;

import java.util.ArrayList;
import java.util.List;

public class AdministrantServis implements DataServis{

    private final List<Person> administrantList;

    private Integer id;

    public AdministrantServis() {
        this.administrantList = new ArrayList<>();
    }

    @Override
    public void userCreate(String firstName, String patronymic, String lastName, String position, String phoheNamber,Boolean rank) {
        id =0;
        for (Person item:this.administrantList) {
            if(item instanceof Administrant){

                if(id<((Administrant)item).getId()){
                    id = ((Administrant)item).getId();
                }
            }
        }
        id++;
        //Integer id, String firstName, String patronymic, String lastName, String position, String phoheNamber, Boolean rank
        this.administrantList.add(new Administrant(id,firstName,patronymic,lastName, position, phoheNamber,rank));
    }

    @Override
    public List<Person> getAll() {
        return administrantList;
    }

    @Override
    public void userDelete(Integer param) {
      for (Person item:this.administrantList) {
                if(item instanceof Administrant){
                    if(param.equals(((Administrant)item).getId())){
                        this.administrantList.remove(item);
                    }
                }
            }

        }


}
