package com.example.config;

import com.example.ioc.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringJavaConfigFile {

    @Bean
    public Student StdId3(){
        Student std1= new Student();

        std1.setName("Akash");
        std1.setRollno(103);
        std1.setEmail("akash@outlook.com");

        return std1;

    }

    @Bean
    public Student StdId4(){
        Student std2= new Student();

        std2.setName("Vishal");
        std2.setRollno(104);
        std2.setEmail("vishal@outlook.com");

        return std2;
    }
}
