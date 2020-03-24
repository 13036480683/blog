package com.xx.blog.util.constant;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author xuxiao
 * @create 2020-03-24
 */
public enum TypeEnum {
    CPP("C/C++", 0),
    C("python", 1),
    JAVA("Java", 2);
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



