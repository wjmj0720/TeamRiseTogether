package com.metaverse.risetogether.chap02;

public class GradeStudent extends Student {
    private int grade;

    public GradeStudent(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }


    public void printStudentInfo(){
        System.out.print("Name : " +  getName());
        System.out.print(", Age : " +  getAge());
        System.out.print(", Grade : " +  getGrade());
    }
}
