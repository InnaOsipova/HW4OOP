package org.example.Data;


public class Сustomer extends Person{

    private Boolean priority;
    private  Integer id;

    public Сustomer(Integer id, String firstName, String patronymic, String lastName, String position, String phoheNamber, Boolean priority) {
        super(firstName, patronymic, lastName, position, phoheNamber);
        this.priority = priority;
        this.id = id;


    }

    public Сustomer(String firstName, String patronymic, String lastName, String position, String phoheNamber, Integer id) {
        super(firstName, patronymic, lastName, position, phoheNamber);
        this.id = id;
    }

    public Boolean getPriority() {
        return priority;
    }

    public void setPriority(Boolean priority) {
        this.priority = priority;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
