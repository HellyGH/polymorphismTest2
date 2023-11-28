package org.example;

public class Person implements Printable{
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    //void introduce() {
      //  System.out.println("Hello, this is " + name + ".");
        //System.out.println("I am " + age + " years old.");
    //}


    @Override
    public void PrintDetails() {
        System.out.println("Person: " + getName()+ " age: " +getAge());


    }


}
