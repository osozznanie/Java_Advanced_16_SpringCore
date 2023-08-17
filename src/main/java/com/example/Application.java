package com.example;

import com.example.config.ConsoleEventLogger;
import com.example.dao.StudentDAO;
import com.example.dao.impl.StudentDAOImpl;
import com.example.domain.Student;
import com.example.share.CrudDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);

        StudentDAOImpl studentDAOImpl = (StudentDAOImpl) ctx.getBean("studentDAOImpl");

        ConsoleEventLogger cel = (ConsoleEventLogger) ctx.getBean("consoleEventLogger");

        System.out.println("----------------------");
        studentDAOImpl.create(new Student(1, "Polina", 19));
        studentDAOImpl.create(new Student(2, "Vlad", 17));
        studentDAOImpl.readAll().forEach(System.out::println);

        System.out.println("----------------------");
        studentDAOImpl.create(new Student(3, "Veronika", 16));
        studentDAOImpl.readAll().forEach(System.out::println);

        System.out.println("----------------------");
        System.out.println("Update student Vlad");
        studentDAOImpl.update(new Student(2, "Vlad", 18));
        studentDAOImpl.readAll().forEach(System.out::println);


        System.out.println("----------------------");
        System.out.println("Delete student");
        studentDAOImpl.deleteById(3);
        studentDAOImpl.readAll().forEach(System.out::println);


    }

}
