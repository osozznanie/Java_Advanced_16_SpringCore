package com.example.dao.impl;

import com.example.dao.StudentDAO;
import com.example.domain.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDAOImpl implements StudentDAO {
    List<Student> studentList = new ArrayList<>();

    @Override
    public void create(Student student) {
        studentList.add(student);
        System.out.println("Студент с именем " + student.getName() + " успешно добален!");
    }

    @Override
    public List<Student> readAll() {
        return studentList;
    }

    @Override
    public void update(Student student) {
        studentList.set(student.getId() - 1 , student);
    }

    @Override
    public void deleteById(int id) {
        studentList.remove(id - 1);
    }
}
