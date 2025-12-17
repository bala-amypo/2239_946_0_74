package com.example.demo.entity;
import jakarta persistance.*
@entity
public class Student {
private int id;
private String name;
private String email;
private int cgpa ;
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getname() {
    return name;
}
public void setname(String name) {
    this.name = name;
}
public String getemail() {
    return email;
}
public void setemail(String email) {
    this.email = email;
}
public int getCgpa() {
    return cgpa;
}
public void setCgpa(int cgpa) {
    this.cgpa = cgpa;
}
public Student(long id, String name, String email, int cgpa) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.cgpa = cgpa;
}
public Student() {
}

}
