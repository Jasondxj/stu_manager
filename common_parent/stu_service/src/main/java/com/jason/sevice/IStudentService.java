package com.jason.sevice;

import com.jason.model.Student;

import java.util.List;

public interface IStudentService {
    /**
     * 查找所有学生
     * @return
     */
    public List<Student> findAll();

    /**
     * 添加学生
     * @param student
     */
    public void add(Student student);

    /**
     * 通过学号删除学生
     * @param sno
     */
    public void deleteBySno(String sno);

    /**
     * 通过条件查询学生
     * @param name
     * @param sex
     * @param dromno
     * @param
     * @return
     */
    public List<Student> findByCondition(String name,String sex,String dromno,Integer age);

}
