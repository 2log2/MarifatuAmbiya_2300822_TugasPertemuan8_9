/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspertemuan8_9.nomor2;

/**
 *
 * @author marif
 */
public class Test {
    public static void main(String[] args) {
        Person person = new Person("Dodi", "darmawangsa", "123-456-7890", "dodi@example.com");
        Student student = new Student("Brodi", "darmawangsa", "234-567-8901", "brodi@example.com", Student.FRESHMAN);
        Employee employee = new Employee("Chardi", "darmawangsa", "345-678-9012", "chardi@example.com",
                "Room 101", 50000, new MyDate());
        Faculty faculty = new Faculty("Davidi", "darmawangsa", "456-789-0123", "davidi@example.com",
                "Room 102", 60000, new MyDate(), "9am-5pm", "Professor");
        Staff staff = new Staff("Uxup", "darmawangsa", "567-890-1234", "uxup@example.com",
                "Room 103", 40000, new MyDate(), "Administrator");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}

