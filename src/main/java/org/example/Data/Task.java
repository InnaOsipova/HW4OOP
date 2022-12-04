package org.example.Data;

import java.sql.Time;
import java.util.Date;

//Файл должен содержать следующие данные: id, дату добавления записи,
// время добавления записи, дедлай задачи, ФИО автора,
public abstract class  Task {
    private Date enteredDate;
    private String deadline;
   private String textTask;


    public Task(Date enteredDate, String deadline, String textTask) {
        this.enteredDate = enteredDate;
        this.deadline = deadline;
        this.textTask = textTask;
    }

   public Date getEnteredDate() {

        return enteredDate;
    }

    public void setEnteredDate(Date enteredDate) {

        this.enteredDate = enteredDate;
    }

    public String getDeadline() {

        return deadline;
    }

    public void setDeadline(String deadline) {

        this.deadline = deadline;
    }

    public String getTextTask() {
        return textTask;
    }

    public void setTextTask(String textTask) {
        this.textTask = textTask;
    }

    @Override
    public String toString() {
        return "Task{" +
                "enteredDate=" + enteredDate +
                ", deadline=" + deadline +
                ", textTask='" + textTask + '\'' +
                '}';
    }
}
