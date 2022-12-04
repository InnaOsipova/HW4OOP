package org.example.Data;

import javax.xml.crypto.Data;
import java.sql.Time;
import java.util.Date;

//Файл должен содержать следующие данные: id, дату добавления записи,
// время добавления записи, дедлай задачи, ФИО автора,
public abstract class  ToDoPlanner {
    private Integer id;
    private Date enteredDate;
    private Time enteredTime;
    private Date deadline;
    private Boolean 
    private String patronymicAutor;
    private String lastNameAutor;

    public ToDoPlanner(Integer id, Date enteredDate, Time enteredTime, Date deadline, String firstNameAutor, String patronymicAutor, String lastNameAutor) {
        this.id = id;
        this.enteredDate = enteredDate;
        this.enteredTime = enteredTime;
        this.deadline = deadline;
        this.firstNameAutor = firstNameAutor;
        this.patronymicAutor = patronymicAutor;
        this.lastNameAutor = lastNameAutor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getEnteredDate() {
        return enteredDate;
    }

    public void setEnteredDate(Date enteredDate) {
        this.enteredDate = enteredDate;
    }

    public Time getEnteredTime() {
        return enteredTime;
    }

    public void setEnteredTime(Time enteredTime) {
        this.enteredTime = enteredTime;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getFirstNameAutor() {
        return firstNameAutor;
    }

    public void setFirstNameAutor(String firstNameAutor) {
        this.firstNameAutor = firstNameAutor;
    }

    public String getPatronymicAutor() {
        return patronymicAutor;
    }

    public void setPatronymicAutor(String patronymicAutor) {
        this.patronymicAutor = patronymicAutor;
    }

    public String getLastNameAutor() {
        return lastNameAutor;
    }

    public void setLastNameAutor(String lastNameAutor) {
        this.lastNameAutor = lastNameAutor;
    }

}
