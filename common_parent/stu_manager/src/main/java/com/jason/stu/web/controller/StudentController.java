package com.jason.stu.web.controller;

import com.jason.model.Department;
import com.jason.model.Student;
import com.jason.sevice.IStudentService;
import com.jason.sevice.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("student")
public class StudentController {
    @Autowired
    private IStudentService studentService;


    @RequestMapping("manage")
    public String manage() {
        return "student/manage";
    }

    @RequestMapping("info")
    public String info(Model model) {
        List<Student> students = studentService.findAll();
        model.addAttribute("students", students);
        return "student/info";
    }

    @RequestMapping("edit")
    public String edit() {
        return "student/edit";
    }
    @RequestMapping("add")
    public String add(Student student) {
        studentService.add(student);
        return "redirect:info.do";
    }

}
