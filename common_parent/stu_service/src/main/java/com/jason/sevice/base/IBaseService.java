package com.jason.sevice.base;

import com.sun.org.apache.xpath.internal.operations.String;

public interface IBaseService<T> {
    /**
     * 通过id查找用户
     * @param id
     * @return
     */
    public T findById(Integer id);

    /**
     * 通过id删除用户
     * @param id
     */
    public void deleteById(Integer id);

    public void save(T t);

}
