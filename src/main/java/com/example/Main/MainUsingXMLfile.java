package com.example.Main;

import com.example.ioc.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainUsingXMLfile {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Student std1= (Student)context.getBean("StdId1");
        std1.display();

        System.out.println("------------------------------------");

        Student std2= (Student) context.getBean("StdId2");
        std2.display();


    }
}
