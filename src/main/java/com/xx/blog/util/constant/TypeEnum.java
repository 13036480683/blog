package com.xx.blog.util.constant;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * 枚举文章type类型，弃用
 * 我写这个逼玩意儿干嘛？？？？
 * @Author xuxiao
 * @create 2020-03-24
 */
public enum TypeEnum {
    ALGORITHM("算法", 0),
    STRUCT("数据结构", 1),
    SOURCECODE("源码分析", 1),
    LINUX("Linux学习", 1),
    JAVA("Java", 1),
    SPRINGBOOT("SpringBoot", 2);
    private String name;
    private Integer index;

    public String getName() {
        return name;
    }


    public Integer getIndex() {
        return index;
    }

    private TypeEnum(String name, Integer index) {
        this.name = name;
        this.index = index;
    }

    public static List typeEnumsList() {
        List<String> list = new ArrayList<>();
        for (TypeEnum t : TypeEnum.values()) {
            list.add(t.getName());
        }
        return list;
    }

}



