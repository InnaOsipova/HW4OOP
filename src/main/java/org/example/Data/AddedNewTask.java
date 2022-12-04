package org.example.Data;

public class AddedNewTask {
    private Customer customer;
    private Newtasks newtasks;
    private Integer id;

    public AddedNewTask(Integer id, Customer customer, Newtasks newtasks) {
        this.customer = customer;
        this.newtasks = newtasks;
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Newtasks getNewtasks() {
        return newtasks;
    }

    public void setNewtasks(Newtasks newtasks) {
        this.newtasks = newtasks;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "AddedNewTask{" +
                "customer=" + customer +
                ", newtasks=" + newtasks +
                ", id=" + id +
                '}';
    }
}

