package com.example.Main;

import com.example.config.SpringJavaConfigFile;
import com.example.ioc.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainUsingJavaConfigFile {
    public static void main(String[] args) {
        ApplicationContext context2= new AnnotationConfigApplicationContext(SpringJavaConfigFile.class);

        Student std1= (Student)context2.getBean("StdId3");
        std1.display();

        System.out.println("----------------------------------");

        Student std2= (Student) context2.getBean("StdId4");
        std2.display();
    }
}
