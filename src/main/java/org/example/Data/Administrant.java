package org.example.Data;

import java.util.ArrayList;
import java.util.List;

public class Administrant extends Person{

    private Boolean rank;
    private Integer id;

    public Administrant(Integer id, String firstName, String patronymic, String lastName, String position, String phoheNamber, Boolean rank) {
        super(firstName, patronymic, lastName, position, phoheNamber);
        this.rank = rank;
        this.id = id;


    }

    public Boolean getRank() {
        return rank;
    }

    public void setRank(Boolean rank) {
        this.rank = rank;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Administrant{" +
                "rank=" + rank +
                ", id=" + id +
                '}' + super.toString();
    }
}
