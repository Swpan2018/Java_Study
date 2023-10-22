package com.test;

public class Bird extends Animal{
    @Override
    public void breed() {
        System.out.println("小鸟");
    }

    @Override
    public void behavior() {
        System.out.println("叽叽叽");
    }
}
