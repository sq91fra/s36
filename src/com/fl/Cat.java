package com.fl;

public class Cat {
    private String name = "Tom";
    public int age = 6;

    public Cat() {
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void hi(){
        System.out.println("hi"+name);
    }
    public void cry(){
        System.out.println(name+"喵喵叫~");
    }
}
