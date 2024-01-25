package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Student {
    @Id
    private int rollNo;
    private String name;
    private int marks;
//    @OneToMany(mappedBy = "student",fetch = FetchType.EAGER)
////    private List<Laptop> laptop = new ArrayList<>();
//
//    public List<Laptop> getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(List<Laptop> laptop) {
//        this.laptop = laptop;
//    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", marks=" + marks +
//                ", laptop=" + laptop +
                '}';
    }
}
