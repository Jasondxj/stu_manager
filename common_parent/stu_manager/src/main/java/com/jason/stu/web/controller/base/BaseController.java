package com.jason.stu.web.controller.base;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public abstract class BaseController<T> {
    public static String MANAGE_PAGE;//管理页面
    public static String INFO_PAGE;//信息页面
    public static String EDIT_PAGE;//编辑页面
    public static final String MANAGE = "manage";
    public static final String INFO = "info";
    public static final String EDIT = "edit";

    public BaseController() {
        //1.获取泛型的真实类型
        ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
        Class<?> modelClass = (Class<?>) type.getActualTypeArguments()[0];
        //2.获取模块名
        String modelName = modelClass.getSimpleName().toLowerCase();
        //3.给静态页面赋值
        MANAGE_PAGE = modelName + "/"+MANAGE;
        INFO_PAGE = modelName + "/"+INFO;
        EDIT_PAGE = modelName + "/"+EDIT;
    }
}
