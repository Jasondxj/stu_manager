package com.jason.sevice.impl;

import com.jason.mapper.StudentMapper;
import com.jason.model.*;
import com.jason.sevice.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class StudentServiceImpl implements IStudentService{
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public List<Student> findAll() {
        List<Student> students = studentMapper.findAll();
        return students;
    }

    @Override
    public void add(Student student) {
        studentMapper.insertSelective(student);
    }

    @Override
    public void deleteBySno(String sno) {
        studentMapper.deleteByPrimaryKey(sno);
    }

    @Override
    public List<Student> findByCondition(String name, String sex, String dromno,Integer age) {
        StudentExample studentExample=new StudentExample();
        StudentExample.Criteria criteria = studentExample.createCriteria();
//        criteria.andNameLike(name);
//        criteria.andSexLike(sex);
//        criteria.andDormnoLike(dromno);
        if (name!=null&&name!=""){
            criteria.andNameLike("%"+name+"%");
        }
        if (sex!=null&&sex!=""){
            criteria.andSexLike("%"+sex+"%");
        }
       if (dromno!=null&&dromno!=""){
           criteria.andDormnoLike("%"+dromno+"%");
       }
       if (age!=null&&age>0){
            criteria.andAgeEqualTo(age);
       }

        List<Student> students = studentMapper.selectByExample(studentExample);
        return students;
    }

    @Override
    public Student login(String username, String password) {
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("username",username);
        map.put("password",password);
        Student student = studentMapper.findBynameAndPassword(map);
        return student;
    }

    @Override
    public Student findBySno(String sno) {
        Student student = studentMapper.findBySno(sno);
        return student;
    }

    @Override
    public void updateBySno(Student student) {
        studentMapper.updateByPrimaryKeySelective(student);
    }

    @Override
    public PageBean<Student> pageQuery(int currentPage, int pageSize) {
        PageBean<Student> pb = new PageBean<Student>();
        pb.setCurrentPage(currentPage);
        pb.setPageSize(pageSize);
        StudentExample example=new StudentExample();
        int totalCount = studentMapper.countByExample(example);
        pb.setTotalCount(totalCount);
        int start = (currentPage - 1) * pageSize;
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("start", start);
        map.put("pageSize", pageSize);
        List<Student> students = studentMapper.findByPage(map);
        pb.setList(students);
        int totalPage = totalCount % pageSize == 0 ? totalCount / pageSize : (totalCount / pageSize) + 1;
        pb.setTotalPage(totalPage);
        return pb;

    }
}
