package com.jason.sevice.impl;

import com.jason.model.User;
import com.jason.model.UserExample;
import com.jason.sevice.IUserService;
import com.jason.sevice.base.impl.IBaseServiceImpl;
import com.sun.xml.internal.bind.v2.model.core.ID;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class UserServiceImpl extends IBaseServiceImpl<User> implements IUserService {


    @Override
    public User login(String username, String password) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("username", username);
        map.put("password", password);
        User user = userMapper.findBynameAndPassword(map);
        return user;
    }

    @Override
    public List<User> findAll() {
        List<User> users = userMapper.findAll();
        return users;
    }

    @Override
    public List<User> findByCondition(String username, String gender, String email, String name) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        if (username != null && username != "") {
            criteria.andUsernameLike("%" + username + "%");
        }
        if (email != null && email != "") {
            criteria.andEmailLike("%" + email + "%");
        }
        if (gender != null && gender != "") {
            criteria.andGenderLike("%" + gender + "%");
        }
        if (name != null && name != "") {
            criteria.andNameLike("%" + name + "%");
        }
        List<User> users = userMapper.selectByExample(example);
        return users;
    }

    @Override
    public void updateById(User user) {
        userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public User findById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }


    @Override
    public void deleteById(Integer id) {
        userMapper.deleteByPrimaryKey(id);
    }


    @Override
    public void save(User user) {
        userMapper.insert(user);
    }


}
