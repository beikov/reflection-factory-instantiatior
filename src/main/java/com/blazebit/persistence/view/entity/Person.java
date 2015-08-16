package com.blazebit.persistence.view.entity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Person implements Serializable {

    private Long id;
    private String name;
    private long age;
    private Map<Integer, String> localized = new HashMap<Integer, String>();

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Integer, String> getLocalized() {
        return localized;
    }

    public void setLocalized(Map<Integer, String> localized) {
        this.localized = localized;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }
}
