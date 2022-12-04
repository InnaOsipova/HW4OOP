package org.example.Data;

public abstract class Person {
    private String firstName;
    private String patronymic;
    private String lastName;
    private String position;
    private String phoheNamber;

    public Person(String firstName, String patronymic, String lastName, String position, String phoheNamber) {

        this.firstName = firstName;
        this.patronymic = patronymic;
        this.lastName = lastName;
        this.position = position;
        this.phoheNamber = phoheNamber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhoheNamber() {
        return phoheNamber;
    }

    public void setPhoheNamber(String phoheNamber) {
        this.phoheNamber = phoheNamber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", phoheNamber='" + phoheNamber + '\'' +
                '}';
    }
}
