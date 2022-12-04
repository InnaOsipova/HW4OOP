package org.example.Servis;

import org.example.Data.Person;
import java.util.List;

public interface DataServis {
    void userCreate(String firstName, String patronymic, String lastName, String position, String phoheNamber, Boolean priority);
    List<Person> getAll();
    void userDelete(Integer param);
}
