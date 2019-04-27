package com.jason.stu.web.controller;

import com.jason.model.User;
import com.jason.sevice.IStudentService;
import com.jason.sevice.ITeacherService;
import com.jason.sevice.IUserService;
import com.jason.stu.web.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
@RequestMapping("user")
public class UserController extends BaseController<User> {

    @Autowired
    private IUserService userService;
    @Autowired
    private IStudentService studentService;
    @Autowired
    private ITeacherService teacherService;

    /**
     * 登录
     *
     * @param user
     * @param request
     * @return
     */
    @RequestMapping("login")
    public String login(User user, HttpServletRequest request, String role) {
        Object loginUser = null;
        HttpSession session = request.getSession();
        if ("管理员".equals(role)) {
            loginUser = userService.login(user.getUsername(), user.getPassword());
            if (loginUser != null) {
                session.setAttribute("user", loginUser);
                return "user/Default";
            }
            session.setAttribute("msg", "用户名或密码错误");
            return "login";
        }
        if ("学生".equals(role)) {
            loginUser = studentService.login(user.getUsername(), user.getPassword());
            if (loginUser != null) {
                session.setAttribute("student", loginUser);
                return "student/default";
            }
            session.setAttribute("msg", "用户名或密码错误");
            return "login";
        }
        if ("老师".equals(role)) {
            loginUser = teacherService.login(user.getUsername(), user.getPassword());
            if (loginUser != null) {
                session.setAttribute("teacher", loginUser);
                return "teacher/default";
            }
            session.setAttribute("msg", "用户名或密码错误");
            return "login";
        }
        return "login";
    }

    /**
     * 返回管理页面
     *
     * @return
     */
    @RequestMapping(MANAGE)
    public String manage() {
        return MANAGE_PAGE;
    }

    /**
     * 返回详情页面
     *
     * @param model
     * @return
     */
    @RequestMapping(INFO)
    public String info(Model model) {
        //查询用户数据
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "user/info";
    }

    /**
     * 返回修改页面
     *
     * @return
     */
    @RequestMapping(EDIT)
    public String edit() {
        return EDIT_PAGE;
    }

    /**
     * 注销
     *
     * @param session
     * @return
     */
    @RequestMapping("exit")
    public String exit(HttpSession session) {
        session.invalidate();
        return "login";
    }

    /**
     * 访问注册页面
     *
     * @return
     */
    @RequestMapping("toRegister")
    public String toRegister() {
        return "user/register";
    }

    /**
     * 注册
     *
     * @param user
     * @return
     */
    @RequestMapping("register")
    public String register(User user) {
        userService.save(user);
        return "user/register_ok";
    }

    /**
     * 条件查找
     *
     * @param username
     * @param gender
     * @param email
     * @param name
     * @param model
     * @return
     */
    @RequestMapping("search")
    public String search(String username, String gender, String email, String name, Model model) {
        System.out.println(gender);
        List<User> users = userService.findByCondition(username, gender, email, name);
        model.addAttribute("users", users);
        return "user/info";
    }

    /**
     * 添加用户
     *
     * @param user
     * @return
     */
    @RequestMapping("add")
    public String add(User user) {
        userService.save(user);
        return "forward:info.do";
    }

    @RequestMapping("delete")
    public String delete(Integer id) {
        userService.deleteById(id);
        return "forward:info.do";
    }

    @RequestMapping("toUpdate")
    public String toUpdate(Integer id, Model model) {
        User user = userService.findById(id);
        model.addAttribute("user", user);
        return "user/update";
    }

    @RequestMapping("update")
    public String update(User user) {
        userService.updateById(user);
        return "forward:info.do";
    }
}
