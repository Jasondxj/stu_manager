package com.jason.stu.web.controller;

import com.jason.model.Course;
import com.jason.model.PageBean;
import com.jason.model.Student;
import com.jason.model.Teacher;
import com.jason.sevice.IStudentService;
import com.jason.sevice.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("teacher")
public class TeacherController {
    @Autowired
    private ITeacherService teacherService;
    @Autowired
    private IStudentService studentService;

    @RequestMapping("info")
    public String info(Model model) {
        List<Teacher> teachers = teacherService.findAll();
        model.addAttribute("teachers", teachers);
        return "teacher/info";
    }

    @RequestMapping("toUpdate")
    public String toUpdate(Model model, String id) {
        Teacher teacher = teacherService.findById(id);
        model.addAttribute("teacher", teacher);
        return "teacher/update";
    }

    @RequestMapping("update")
    public String update(Teacher teacher) {
        teacherService.updateById(teacher);
        return "forward:findById.do";
    }

    @RequestMapping("edit")
    public String edit() {
        return "teacher/edit";
    }

    @RequestMapping("add")
    public String add(Teacher teacher) {
        teacherService.addTeacher(teacher);
        return "forward:info.do";
    }

    @RequestMapping("delete")
    public String delete(String id) {
        teacherService.deleteTeacher(id);
        return "forward:info.do";
    }

    @RequestMapping("search")
    public String search(String username, String jobtitle, String name, Model model) {
        List<Teacher> teachers = teacherService.findByCondition(username, jobtitle, name);
        model.addAttribute("teachers", teachers);
        return "teacher/info";
    }

    @RequestMapping("pageQuery")
    public String PageQuery(Model model, HttpSession session, Integer currentPage) {
        session.setAttribute("currentPage", currentPage);
        int pageSize = 2;
        PageBean<Teacher> pb = teacherService.pageQuery(currentPage, pageSize);
        model.addAttribute("teachers", pb.getList());
        session.setAttribute("pb", pb);
        return "teacher/info";
    }

    @RequestMapping("findById")
    public String findTeacher(Model model, String id) {
        Teacher teacher = teacherService.findById(id);
        model.addAttribute("teacher", teacher);
        return "teacher/Myinfo";
    }

    @RequestMapping("manage")
    public String manage() {
        return "teacher/manage";
    }

    @RequestMapping("stumanage")
    public String stumanage() {
        return "teacher/stumanage";
    }

    @RequestMapping("stuUpdate")
    public String stuUpdate(Student student, HttpSession session) {
        studentService.updateBySno(student);
        PageBean<Student> pb = (PageBean<Student>) session.getAttribute("pb");
        return "forward:/student/pageQuery.do?currentPage=" + pb.getCurrentPage() + "";
    }

    @RequestMapping("toStuUpdate")
    public String toStuUpdate(String sno, Model model) {
        Student student = studentService.findBySno(sno);
        model.addAttribute("student", student);
        return "teacher/stuUpdate";
    }

    @RequestMapping("courseManage")
    public String courseManage() {
        return "teacher/courseManage";
    }

    @RequestMapping("toCourseAdd")
    public String tocourseAdd() {
        return "teacher/courseAdd";
    }

    @RequestMapping("courseAdd")
    public String courseAdd(Course course,HttpSession session) {
        int count = teacherService.addCourse(course);
        if (count > 0) {
            session.setAttribute("courseMsg","添加课程成功");
            session.setMaxInactiveInterval(10);
        }
        return "forward:allCourse.do";
    }

    @RequestMapping("allCourse")
    public String allCourse(Model model) {
        List<Course> courses = teacherService.allCourse();
        model.addAttribute("courses", courses);
        return "teacher/allCourse";
    }
    @RequestMapping("courseSearch")
    public String courseSearch(Course course,Model model){
        List<Course> courses = teacherService.findCourseByContidion(course);
        model.addAttribute("courses",courses);
        return "teacher/allCourse";
    }
}
