package com.test;

public class Person {

    private String name;
    private Integer age;

    //构造方法

    public Person(){

    }

    public Person(String dawd,Integer Age){
        this.name = dawd;
        this.age = Age;
    }



    //吃饭
    public void eat(){
        System.out.println("在吃饭");
    }

    //聊天
    public void chat(){
        System.out.println("聊天");
    }

    //get方法
    //得到名字
    public String getName(){
        return this.name;
    }
    //set方法
    //改名
    public void setName(String newName){
        this.name = newName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
