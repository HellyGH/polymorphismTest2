package org.example;

public class Student extends Person implements Printable{
    double grade;
    public Student(String name, int age,double grade) {
        super(name, age);
        this.grade=grade;
    }
    public double getGrade() {
        return grade;
    }
    //public void introduce() {
      //  System.out.println("My grade is"+grade);
    //}
    public void PrintDetails() {
        System.out.println("Student: " + getName()+ "age:" +getAge()+ "grade:" +getGrade());



    }


}
