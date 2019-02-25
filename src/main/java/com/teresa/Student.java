package com.teresa;

public class Student {
    int english;
    int math;

    public Student(int english, int math){
        this.english = english;
        this.math = math;
    }

    public static void main(String[] args) {
        Student stu = new Student(77, 88);
    }
}
