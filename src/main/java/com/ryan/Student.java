package com.ryan;

public class Student {

    private String studentName;
    private int score;

    public Student(String studentName, int score) {
        this.studentName = studentName;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student {" +
                "name = '" + studentName + '\'' +
                ", score = " + score +
                '}';
    }
}
