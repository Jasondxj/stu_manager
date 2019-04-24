package com.jason.stu.web.controller;

import com.jason.model.Department;
import com.jason.model.PageBean;
import com.jason.model.Student;
import com.jason.model.Teacher;
import com.jason.sevice.IStudentService;
import com.jason.sevice.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("student")
public class StudentController {
    @Autowired
    private IStudentService studentService;

    /**
     * 访问管理页面
     * @return
     */
    @RequestMapping("manage")
    public String manage() {
        return "student/manage";
    }

    /**
     * 查找所有学生
     * @param model
     * @return
     */
    @RequestMapping("info")
    public String info(Model model) {
        List<Student> students = studentService.findAll();
        model.addAttribute("students", students);
        return "student/info";
    }

    /**
     * 访问编辑页面
     * @return
     */
    @RequestMapping("edit")
    public String edit() {
        return "student/edit";
    }

    /**
     * 新增学生
     * @param student
     * @return
     */
    @RequestMapping("add")
    public String add(Student student) {
        studentService.add(student);
        return "redirect:info.do";
    }

    /**
     * 删除学生
     * @param sno
     * @return
     */
    @RequestMapping("delete")
    public String delete(String sno) {
        studentService.deleteBySno(sno);
        return "forward:info.do";
    }

    /**
     * 根据条件查询学生
     * @param
     * @return
     */
    @RequestMapping("search")
    public String search(String name,String sex,String dromno,Integer age,Model model) {
        List<Student> students = studentService.findByCondition(name, sex, dromno,age);
        model.addAttribute("students",students);
        return "student/info";
    }
    @RequestMapping("Myinfo")
    public String MyInfo(String sno,Model model){
        Student student = studentService.findBySno(sno);
        model.addAttribute("student",student);
        return "student/Myinfo";
    }
    @RequestMapping("toUpdate")
    public String toUpdate(String sno,Model model){
        System.out.println(sno);
        Student student = studentService.findBySno(sno);
        System.out.println(student);
        model.addAttribute("student",student);
        return "student/update";
    }
    @RequestMapping("update")
    public String update(Student student,Model model){
        studentService.updateBySno(student);
        return "forward:Myinfo.do";
    }
    @RequestMapping("pageQuery")
    public String PageQuery(Model model, HttpSession session, Integer currentPage) {
        session.setAttribute("currentPage", currentPage);
        int pageSize = 3;
        PageBean<Student> pb = studentService.pageQuery(currentPage, pageSize);
        model.addAttribute("students", pb.getList());
        session.setAttribute("pb", pb);
        return "student/info";
    }
}
