package ru.startandroid.task3;

import java.io.Serializable;

public class Recept implements Serializable {
    private String name;
    private String the_complexity_cooking;
    private String description;
    private String time;
    private String full_description;


    public Recept(String name, String the_complexity_cooking, String description, String time, String full_description){
        this.name = name;
        this.the_complexity_cooking = the_complexity_cooking;
        this.description = description;
        this.time = time;

        this.full_description = full_description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getThe_complexity_cooking() {
        return the_complexity_cooking;
    }

    public String getDescription() {
        return description;
    }

    public String getTime() {
        return time;
    }
}
