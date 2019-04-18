package com.jason.sevice.impl;

import com.jason.mapper.StudentMapper;
import com.jason.model.Student;
import com.jason.sevice.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class StudentServiceImpl implements IStudentService{
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public List<Student> findAll() {
        List<Student> students = studentMapper.findAll();
        return students;
    }
}
