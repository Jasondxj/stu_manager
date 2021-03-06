package com.jason.model;

import java.util.List;

public class Course {
    private String detail;
    private Major major;//一门课程属于一个专业
    private List<Student> students;//一门课程被多名学生选修

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.cno
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    private String cno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.name
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.major_id
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    private Integer majorid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.cno
     *
     * @return the value of course.cno
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    public String getCno() {
        return cno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.cno
     *
     * @param cno the value for course.cno
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    public void setCno(String cno) {
        this.cno = cno == null ? null : cno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.name
     *
     * @return the value of course.name
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.name
     *
     * @param name the value for course.name
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.major_id
     *
     * @return the value of course.major_id
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    public Integer getMajorid() {
        return majorid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.major_id
     *
     * @param majorid the value for course.major_id
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    public void setMajorid(Integer majorid) {
        this.majorid = majorid;
    }
}