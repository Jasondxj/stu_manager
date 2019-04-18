package com.jason.mapper.base;

import com.sun.org.apache.xpath.internal.operations.String;

public interface BaseMapper<T> {
    /**
     * 通过id查找用户
     * @param id
     * @return
     */
    public T findById(Integer id);
    public T findByUUid(String uuid);


    /**
     * 通过id删除用户
     * @param id
     */
    public void deleteById(Integer id);
    public void deleteByUUid(String uuid);
    public void update(T t);
    public void save(T t);
}
