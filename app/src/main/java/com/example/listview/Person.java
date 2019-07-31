package com.example.listview;

public class Person {
    String name, sexe;
    String age;

    public Person(String name, String sexe, String age) {
        this.name = name;
        this.sexe = sexe;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
