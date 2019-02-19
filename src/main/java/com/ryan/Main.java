package com.ryan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean-demo.xml");

        Class firstClass = (Class) context.getBean("class");
        Student firstStudent = (Student) context.getBean("student");

        System.out.println(firstStudent.toString());
        System.out.println(firstClass.toString());

    }

}
