package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("di-beans.xml");
        Person person = context.getBean("person", Person.class);
        person.showInfo();
    }
}
