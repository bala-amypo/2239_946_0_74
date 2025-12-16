package com.example.demo.entity;

public class Student {
private int id;
private String stuname;
private String studentemail;
private int cgpa ;
package com.example.demo.entity;

public class Student {
private int id;
private String stuname;
private String studentemail;
private int cgpa ;
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getStuname() {
    return stuname;
}
public void setStuname(String stuname) {
    this.stuname = stuname;
}
public String getStudentemail() {
    return studentemail;
}
public void setStudentemail(String studentemail) {
    this.studentemail = studentemail;
}
public int getCgpa() {
    return cgpa;
}
public void setCgpa(int cgpa) {
    this.cgpa = cgpa;
}
public Student(int id, String stuname, String studentemail, int cgpa) {
    this.id = id;
    this.stuname = stuname;
    this.studentemail = studentemail;
    this.cgpa = cgpa;
}
public Student() {
}

}
