package com.jason.model;

import java.util.Date;

public class Student {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private Department department;//一个学生属于一个院系

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.sno
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    private String sno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.classNo
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    private String classno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.sex
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    private String sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.name
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.dormNo
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    private String dormno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.age
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    private Integer age;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.jointime
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    private Date jointime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.department_id
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    private Integer departmentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.address
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.phone
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.email
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.qq
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    private String qq;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.sno
     *
     * @return the value of student.sno
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    public String getSno() {
        return sno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.sno
     *
     * @param sno the value for student.sno
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    public void setSno(String sno) {
        this.sno = sno == null ? null : sno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.classNo
     *
     * @return the value of student.classNo
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    public String getClassno() {
        return classno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.classNo
     *
     * @param classno the value for student.classNo
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    public void setClassno(String classno) {
        this.classno = classno == null ? null : classno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.sex
     *
     * @return the value of student.sex
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.sex
     *
     * @param sex the value for student.sex
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.name
     *
     * @return the value of student.name
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.name
     *
     * @param name the value for student.name
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.dormNo
     *
     * @return the value of student.dormNo
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    public String getDormno() {
        return dormno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.dormNo
     *
     * @param dormno the value for student.dormNo
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    public void setDormno(String dormno) {
        this.dormno = dormno == null ? null : dormno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.age
     *
     * @return the value of student.age
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.age
     *
     * @param age the value for student.age
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.jointime
     *
     * @return the value of student.jointime
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    public Date getJointime() {
        return jointime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.jointime
     *
     * @param jointime the value for student.jointime
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    public void setJointime(Date jointime) {
        this.jointime = jointime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.department_id
     *
     * @return the value of student.department_id
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    public Integer getDepartmentId() {
        return departmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.department_id
     *
     * @param departmentId the value for student.department_id
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.address
     *
     * @return the value of student.address
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.address
     *
     * @param address the value for student.address
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.phone
     *
     * @return the value of student.phone
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.phone
     *
     * @param phone the value for student.phone
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.email
     *
     * @return the value of student.email
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.email
     *
     * @param email the value for student.email
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.qq
     *
     * @return the value of student.qq
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    public String getQq() {
        return qq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.qq
     *
     * @param qq the value for student.qq
     *
     * @mbggenerated Thu Apr 18 14:12:51 CST 2019
     */
    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    @Override
    public String toString() {
        return "Student{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", department=" + department +
                ", sno='" + sno + '\'' +
                ", classno='" + classno + '\'' +
                ", sex='" + sex + '\'' +
                ", name='" + name + '\'' +
                ", dormno='" + dormno + '\'' +
                ", age=" + age +
                ", jointime=" + jointime +
                ", departmentId=" + departmentId +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", qq='" + qq + '\'' +
                '}';
    }
}