package org.mot.jdbc_Mottainai.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UserAccount {
    //ATRIBUTOS
    private int id;
    private String userName;
    private String email;
    private String password;
    private LocalDate registrationDate; // no banco está e "date"
    private LocalDateTime lastAcces; // no baco está timestamp
    private String status;
    private String position;
    private Employee employee;
    //CONSTRUTOR
    public UserAccount(String userName, String email, String password, Employee employee, String position) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.employee = employee;
        this.position = position;
    }
    //SOBRECARGA
    public UserAccount(int id, String userName, String email, String password, LocalDate registrationDate, LocalDateTime lastAcces, String status, String position, Employee employee) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.registrationDate = registrationDate;
        this.lastAcces = lastAcces;
        this.status = status;
        this.position = position;
        this.employee = employee;
    }
    //GETTERS
    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public LocalDateTime getLastAcces() {
        return lastAcces;
    }

    public String getStatus() {
        return status;
    }

    public String getPosition() {
        return position;
    }

    public Employee getEmployee() {
        return employee;
    }
    //SETTERS
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public void setLastAcces(LocalDateTime lastAcces) {
        this.lastAcces = lastAcces;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    //toString
    public String toString(){
        return "----------- USER ACCOUNT -----------"+ "\n"+
                "ID: "+ this.id+ "\n"+
                "User name: "+ this.userName+ "\n"+
                "Email: "+ this.email+"\n"+
                "Password: "+ this.password+ "\n"+
                "Registration Date: "+ this.registrationDate+ "\n"+
                "Last Access: "+ this.lastAcces+ "\n"+
                "Status: "+ this.status+ "\n"+
                "Position: "+ this.position+ "\n"+
                "Employee: "+ this.employee+ "\n"+
                "----------------------------";
    }
}
