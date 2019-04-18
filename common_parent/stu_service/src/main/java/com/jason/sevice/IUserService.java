package com.jason.sevice;

import com.jason.model.User;
import com.jason.sevice.base.IBaseService;

import java.util.List;

public interface IUserService extends IBaseService<User>{
    //特有的方法
    public User login(String username, String password);

    /**
     * 查询所有用户
     * @return
     */
    public List<User> findAll();

    public List<User> findByCondition(String username,String gender,String email,String name);

    public void updateById(User user);


}
