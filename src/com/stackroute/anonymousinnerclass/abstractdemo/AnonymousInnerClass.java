package com.stackroute.anonymousinnerclass.abstractdemo;

public class AnonymousInnerClass {
    public static void main(String args[]) {
        Fruit fruit = new Fruit() {
            void eat() {
                System.out.println("An Apple a day, keeps a doctor away.");
            }
        };
        fruit.eat();
    }
}
