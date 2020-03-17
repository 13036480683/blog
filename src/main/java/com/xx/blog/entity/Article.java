package com.xx.blog.entity;

import java.io.Serializable;


/**
 * null
 */
public class Article implements Serializable {

	/**
	 * null
	 * default value: null
	 */

	private Integer id;

	/**
	 * null
	 * default value: null
	 */
	private String title;

	/**
	 * null
	 * default value: null
	 */
	private String type;

	/**
	 * null
	 * default value: null
	 */
	private String context;

	/**
	 * null
	 * default value: CURRENT_TIMESTAMP(6)
	 */
	private java.util.Date gmtCreate;

	/**
	 * null
	 * default value: CURRENT_TIMESTAMP(6)
	 */
	private java.util.Date gmtModify;
	
	public Integer getId() {
		return this.id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getType() {
		return this.type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getContext() {
		return this.context;
	}
	
	public void setContext(String context) {
		this.context = context;
	}
}
