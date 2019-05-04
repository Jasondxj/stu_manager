package com.jason.sevice;

import com.jason.model.Course;
import com.jason.model.PageBean;
import com.jason.model.Teacher;

import java.util.List;
import java.util.Map;

public interface ITeacherService {
    /**
     * 按条件查询课程
     * @param course
     * @return
     */
    public List<Course> findCourseByContidion(Course course);
    /**
     * 查询所有课程
     * @return
     */
    public List<Course> allCourse();
    /**
     * 添加课程
     * @param course
     */
    public int addCourse(Course course);
    /**
     * 老师登录
     * @param username
     * @param password
     * @return
     */
    public Teacher login(String username, String password);


    public List<Teacher> findAll();

    public void updateById(Teacher teacher);

    public void addTeacher(Teacher teacher);

    public void deleteTeacher(String id);

    public List<Teacher> findByCondition(String username,String jobtitle,String name);

    public PageBean<Teacher> pageQuery(int currentPage,int pageSize);

    public Teacher findById(String id);
}
