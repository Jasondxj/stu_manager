package com.jason.sevice;

import com.jason.model.Student;

import java.util.List;

public interface IStudentService {
    /**
     * 查找所有学生
     * @return
     */
    public List<Student> findAll();

    public void add(Student student);

}
