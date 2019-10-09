package com.example.demo;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
public class Todo {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;

        @NotNull
        @Size(min = 4)
        private String taskname;

        @NotNull
//        @DateTimeFormat
        private String date;

        @NotNull
        @Size(min = 10)
        private String prioritory;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPrioritory() {
        return prioritory;
    }

    public void setPrioritory(String prioritory) {
        this.prioritory = prioritory;
    }
}
