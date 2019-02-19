package com.ryan;

public class Class {

    private String className;

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Class { " +
                "className = '" + className + '\'' +
                '}';
    }
}
