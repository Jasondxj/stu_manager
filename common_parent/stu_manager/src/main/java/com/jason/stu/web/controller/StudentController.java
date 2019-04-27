package com.jason.stu.web.controller;

import com.jason.model.*;
import com.jason.sevice.IStudentService;
import com.jason.sevice.ITeacherService;
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
    @Autowired
    private ITeacherService teacherService;

    /**
     * 访问管理页面
     *
     * @return
     */
    @RequestMapping("manage")
    public String manage() {
        return "student/manage";
    }

    /**
     * 查找所有学生
     *
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
     *
     * @return
     */
    @RequestMapping("edit")
    public String edit() {
        return "student/edit";
    }

    /**
     * 新增学生
     *
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
     *
     * @param sno
     * @return
     */
    @RequestMapping("delete")
    public String delete(String sno, HttpSession session) {
        PageBean<Student> pb = (PageBean<Student>) session.getAttribute("pb");
        int currentPage = pb.getCurrentPage();
        studentService.deleteBySno(sno);
        return "forward:pageQuery.do?currentPage=" + currentPage;
    }

    /**
     * 根据条件查询学生
     *
     * @param
     * @return
     */
    @RequestMapping("search")
    public String search(String name, String sex, String dromno, Integer age, Model model) {
        List<Student> students = studentService.findByCondition(name, sex, dromno, age);
        model.addAttribute("students", students);
        return "student/info";
    }

    @RequestMapping("Myinfo")
    public String MyInfo(String sno, Model model) {
        Student student = studentService.findBySno(sno);
        model.addAttribute("student", student);
        return "student/Myinfo";
    }

    @RequestMapping("toUpdate")
    public String toUpdate(String sno, Model model) {
        System.out.println(sno);
        Student student = studentService.findBySno(sno);
        System.out.println(student);
        model.addAttribute("student", student);
        return "student/update";
    }

    @RequestMapping("update")
    public String update(Student student, Model model) {
        studentService.updateBySno(student);
        return "forward:Myinfo.do";
    }

    /**
     * 分页查询
     *
     * @param model
     * @param session
     * @param currentPage
     * @return
     */
    @RequestMapping("pageQuery")
    public String PageQuery(Model model, HttpSession session, Integer currentPage) {
        session.setAttribute("currentPage", currentPage);
        int pageSize = 3;
        PageBean<Student> pb = studentService.pageQuery(currentPage, pageSize);
        model.addAttribute("students", pb.getList());
        session.setAttribute("pb", pb);
        return "student/info";
    }

    @RequestMapping("courseInfo")
    public String courseInfo(Model model) {
        List<Course> courses = studentService.findAllCourse();
        model.addAttribute("courses", courses);
        return "student/courseInfo";
    }

    @RequestMapping("addCourse")
    public String addCourse(String sno, String cno, HttpSession session) {
        session.removeAttribute("msg");
        Core core = studentService.findCoreBySno(sno, cno);
        if (core == null) {
            studentService.addCourse(sno, cno);
            session.setAttribute("msg", "选课成功");
            session.setMaxInactiveInterval(10);
        }
        return "forward:courseInfo.do";
    }

    @RequestMapping("myCourse")
    public String myCourse(String sno, Model model) {
        Student student = studentService.findAllCourse(sno);
        model.addAttribute("mycourses", student.getCourses());
        return "student/myCourse";
    }

    @RequestMapping("coreInfo")
    public String myCore(String sno, Model model) {
        List<Core> cores = studentService.findAllScoreBySno(sno);
        model.addAttribute("cores", cores);
        return "student/coreInfo";
    }

    /**
     * 查询选修某课程的所有学生
     *
     * @param cno
     * @return
     */
    @RequestMapping("test1")
    public String test1(String cno) {
        Course course = studentService.findStuByCno(cno);
        for (Student student : course.getStudents()) {
            System.out.println(student.getName());
        }
        return "";
    }

    /**
     * 查询某学生某课程的成绩
     *
     * @param sno
     * @return
     */
    @RequestMapping("test2")
    public String test2(String sno, String cno) {
        Core core = studentService.findScoreBySnoAndCno(sno, cno);
        System.out.println(core.getStudent().getName() + "\t" + core.getCourse().getName() + "\t" + core.getScore());
        return "";
    }
    @RequestMapping("courseSearch")
    public String courseSearch(Course course,Model model){
        List<Course> courses = teacherService.findCourseByContidion(course);
        model.addAttribute("courses",courses);
        return "student/courseInfo";
    }

}
