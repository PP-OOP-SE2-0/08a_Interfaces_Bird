package com.cc.java;

public class Bird implements Flyable, IFeathers {

    @Override
    public String fly() {
        return "I'm a bird, I can fly";
    }

    @Override
    public String hasFeathers() {
        // TODO Auto-generated method stub
        return "I'm a bird, I have feathers!";
    }
    



}
