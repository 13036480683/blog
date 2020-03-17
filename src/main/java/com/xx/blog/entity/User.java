package com.xx.blog.entity;


//import javax.persistence.*;

import java.io.Serializable;

/**
 * 用户表
 */


public class User implements Serializable {

	/**
	 * null
	 * default value: null
	 */

    private Integer id;

	/**
	 * 姓名
	 * default value: null
	 */
    private String name;

	/**
	 * 密码
	 * default value: null
	 */
    private String password;

	/**
	 * 创建时间
	 * default value: CURRENT_TIMESTAMP(6)
	 */
    private java.util.Date gmtCreate;

	/**
	 * 修改时间
	 * default value: CURRENT_TIMESTAMP(6)
	 */
    private java.util.Date gmtModify;

	/**
	 * 昵称
	 * default value: null
	 */
    private String nick;

	/**
	 * 性别
	 * default value: null
	 */
    private Integer sex;

	/**
	 * 生日
	 * default value: null
	 */
    private java.util.Date birthday;

	/**
	 * 手机号码
	 * default value: null
	 */
    private String phone;

	/**
	 * 头像地址
	 * default value: null
	 */
    private String avatarImgUrl;

	/**
	 * 个人简介
	 * default value: null
	 */
    private String personBrief;

	/**
	 * 最后登录
	 * default value: null
	 */
    private java.util.Date lastLoginTime;
}
