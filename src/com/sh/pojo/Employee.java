/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sh.pojo;

/**
 *
 * @author Shobhit.Sachdeva
 */
public class Employee {
    private int name;
    private int age;
    private String address;

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return this.name + "(" + this.age + "): " + this.address; //To change body of generated methods, choose Tools | Templates.
    }
}
