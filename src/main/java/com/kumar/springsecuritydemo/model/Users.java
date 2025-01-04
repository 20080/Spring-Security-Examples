package com.kumar.springsecuritydemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Users {
    @Id
    private int id;
    private String usename;
    private String password;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUsename() {
        return usename;
    }
    public void setUsename(String usename) {
        this.usename = usename;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", username='" + usename + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
