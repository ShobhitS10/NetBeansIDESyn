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
public class Politician {
    private String name;
    private int aadharNumber;

    public Politician() {
        System.out.println("Default Constructor");
    }

    public Politician(int aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public Politician(String name) {
        this.name = name;
    }

    public Politician(String name, int aadharNumber) {
        this.name = name;
        this.aadharNumber = aadharNumber;
    }

    @Override
    public String toString() {
        return aadharNumber + ": " + name; //To change body of generated methods, choose Tools | Templates.
    }
}
