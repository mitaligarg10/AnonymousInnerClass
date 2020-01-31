package com.stackroute.anonymousinnerclass.interfacedemo;

public class AnonymousInnerClass {
    public static void main(String args[]) {
        Fruit fruit = new Fruit() {
            public void eat() {
                System.out.println("An Apple a day, keeps a doctor away.");
            }
        };
        fruit.eat();
    }
}
