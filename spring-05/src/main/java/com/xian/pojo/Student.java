package com.xian.pojo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student {
    private Integer id;
    private String name;


    public Student() {
        System.out.println("Student.........Constructor");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void init(){
        System.out.println("init......");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroy.....");
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


}
