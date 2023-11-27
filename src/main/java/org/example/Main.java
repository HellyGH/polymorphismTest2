package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        var person = new Person("Helly",20);
        var student = new Student("Helly",15,5.57);
        person.PrintDetails();
        student.PrintDetails();
       }
    }
