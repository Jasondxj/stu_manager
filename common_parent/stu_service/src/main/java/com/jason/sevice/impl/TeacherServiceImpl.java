package com.jason.sevice.impl;

import com.jason.mapper.CourseMapper;
import com.jason.mapper.TeacherMapper;
import com.jason.model.*;
import com.jason.sevice.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class TeacherServiceImpl implements ITeacherService {
    @Autowired
    private TeacherMapper teacherMapper;
    @Autowired
    private CourseMapper courseMapper;

    /**
     * 按条件查询课程
     * @param course
     * @return
     */
    @Override
    public List<Course> findCourseByContidion(Course course) {
        CourseExample example=new CourseExample();
        CourseExample.Criteria criteria = example.createCriteria();
        if (course.getCno()!=null){
            criteria.andCnoLike("%"+course.getCno()+"%");
        }
        if (course.getName()!=null){
            criteria.andNameLike("%"+course.getName()+"%");
        }
        List<Course> courses = courseMapper.selectByExample(example);
        return courses;
    }

    /**
     * 查询所有课程
     * @return
     */
    @Override
    public List<Course> allCourse() {
        List<Course> courses = courseMapper.findAll();
        return courses;
    }

    /**
     * 添加课程
     * @param course
     */
    @Override
    public int addCourse(Course course) {
        int count = courseMapper.insertSelective(course);
        return count;
    }

    /**
     * 登录
     *
     * @param username
     * @param password
     * @return
     */
    @Override
    public Teacher login(String username, String password) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("username", username);
        map.put("password", password);
        Teacher teacher = teacherMapper.findBynameAndPassword(map);
        return teacher;
    }

    /**
     * 查找所有老师
     *
     * @return
     */
    @Override
    public List<Teacher> findAll() {
        List<Teacher> teachers = teacherMapper.findAll();
        return teachers;
    }

    /**
     * 更新老师信息
     *
     * @param teacher
     */
    @Override
    public void updateById(Teacher teacher) {
        teacherMapper.updateByPrimaryKeySelective(teacher);
    }

    /**
     * 添加老师
     *
     * @param teacher
     */
    @Override
    public void addTeacher(Teacher teacher) {
        teacherMapper.insertSelective(teacher);
    }

    /**
     * 删除老师
     *
     * @param id
     */
    @Override
    public void deleteTeacher(String id) {
        teacherMapper.deleteByPrimaryKey(id);
    }

    /**
     * 按条件查询老师
     *
     * @param username
     * @param jobtitle
     * @param name
     * @return
     */
    @Override
    public List<Teacher> findByCondition(String username, String jobtitle, String name) {
        TeacherExample example = new TeacherExample();
        TeacherExample.Criteria criteria = example.createCriteria();
        if (username != null && username != "") {
            criteria.andUsernameLike("%" + username + "%");
        }
        if (jobtitle != null && jobtitle != "") {
            criteria.andJobtitleLike("%" + jobtitle + "%");
        }
        if (name != null && name != "") {
            criteria.andNameLike("%" + name + "%");
        }
        List<Teacher> teachers = teacherMapper.selectByExample(example);
        return teachers;
    }

    /**
     * 分页查询
     *
     * @param currentPage
     * @param pageSize
     * @return
     */
    @Override
    public PageBean<Teacher> pageQuery(int currentPage, int pageSize) {
        //封装pageBean
        PageBean<Teacher> pb = new PageBean<Teacher>();
        pb.setCurrentPage(currentPage);
        pb.setPageSize(pageSize);
        TeacherExample example = new TeacherExample();
        int totalCount = teacherMapper.countByExample(example);
        pb.setTotalCount(totalCount);
        int start = (currentPage - 1) * pageSize;
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("start", start);
        map.put("pageSize", pageSize);
        List<Teacher> teachers = teacherMapper.findByPage(map);
        pb.setList(teachers);
        int totalPage = totalCount % pageSize == 0 ? totalCount / pageSize : (totalCount / pageSize) + 1;
        pb.setTotalPage(totalPage);
        return pb;
    }

    /**
     * 根据id查找老师
     *
     * @param id
     * @return
     */
    @Override
    public Teacher findById(String id) {
        Teacher teacher = teacherMapper.selectByPrimaryKey(id);
        return teacher;
    }
}
