package com.jason.sevice;

import com.jason.model.*;

import java.util.List;

public interface IStudentService {
    /**
     * 查询某学生所有课程的成绩
     * @param sno
     * @return
     */
    public List<Core> findAllScoreBySno(String sno);
    /**
     * 查询某学生某课程的成绩
     * @param sno
     * @param cno
     * @return
     */
    public Core findScoreBySnoAndCno(String sno,String cno);
    /**
     * 查询选修某课程的所有学生（一个Course对象里面有Student数组）
     * @param cno
     * @return
     */
    public Course findStuByCno(String cno);
    /**
     * 查询学生成绩
     * @param sno
     * @return
     */
    public List<Student> queryScore(String sno);
    /**
     * 查询学生选修的所有课程
     * @param sno
     * @return
     */
    public Student findAllCourse(String sno);
    /**
     * 查询学生选修的指定课程
     * @param sno
     * @param cno
     * @return
     */
    public Core findCoreBySno(String sno,String cno);
    /**
     * 查找所有学生
     *
     * @return
     */
    public List<Student> findAll();

    /**
     * 添加学生
     *
     * @param student
     */
    public void add(Student student);

    /**
     * 通过学号删除学生
     *
     * @param sno
     */
    public void deleteBySno(String sno);

    /**
     * 通过条件查询学生
     *
     * @param name
     * @param sex
     * @param dromno
     * @param
     * @return
     */
    public List<Student> findByCondition(String name, String sex, String dromno, Integer age);

    /**
     * 学生登录
     *
     * @param username
     * @param password
     * @return
     */
    public Student login(String username, String password);

    /**
     * 通过学号查找学生
     *
     * @param sno
     * @return
     */
    public Student findBySno(String sno);

    /**
     * 根据学号修改学生信息
     *
     * @param student
     */
    public void updateBySno(Student student);

    /**
     * 分页查询
     *
     * @param currentPage
     * @param pageSize
     * @return
     */
    public PageBean<Student> pageQuery(int currentPage, int pageSize);

    /**
     * 查找所有课程
     * @return
     */
    public List<Course> findAllCourse();

    /**
     * 添加选课
     * @param sno
     * @param cno
     */
    public void addCourse(String sno,String cno);

}
