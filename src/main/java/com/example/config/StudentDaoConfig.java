package com.example.config;

import com.example.dao.StudentDAO;
import com.example.dao.impl.StudentDAOImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentDaoConfig {

    @Bean(name = "studentDAOImpl")
    public StudentDAO studentDAO() {
        return new StudentDAOImpl();
    }

}
