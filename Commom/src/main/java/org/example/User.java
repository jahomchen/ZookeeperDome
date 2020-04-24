package org.example;

import java.io.Serializable;

/*
 *@author jahom
 *@date 2020/4/23 17:14
 */
public class User implements Serializable {
    private static final long serialVersionUID = 346780676810951321L;

    private int id;
    private int age;
    private String Name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", Name='" + Name + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
