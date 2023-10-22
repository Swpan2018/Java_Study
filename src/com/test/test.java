package com.test;

import java.io.Serializable;

public class test implements Serializable {
    private String name;
    public test(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

}
