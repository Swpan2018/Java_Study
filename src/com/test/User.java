package com.test;

public class User{
    // Field
    Integer no;

    // Constructor
    public User(){

    }
    public User(Integer no){
        this.no = no;
    }

    // Method
    public void setNo(Integer no){
        this.no = no;
    }
    public void getNo(){
        System.out.println(this.no);
    }
}

