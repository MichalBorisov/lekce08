package com.company;

public class Teacher{
    private String name;
    private String surename;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public String getFullName()
    {
        return getName() + " " + getSurename();
    }
    public Teacher(String name, String surename) {
        this.name= name;
        this.surename= surename;
    }
}
