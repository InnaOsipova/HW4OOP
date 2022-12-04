package org.example.Data;


public class Customer extends Person{

    private Boolean priority;
    private  Integer id;

    public Customer(Integer id, String firstName, String patronymic, String lastName, String position, String phoheNamber, Boolean priority) {
        super(firstName, patronymic, lastName, position, phoheNamber);
        this.priority = priority;
        this.id = id;


    }

    public Customer(String firstName, String patronymic, String lastName, String position, String phoheNamber, Integer id) {
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

    @Override
    public String toString() {
        return "Customer{" +
                "priority=" + priority +
                ", id=" + id +
                '}'+ super.toString();
    }
}
