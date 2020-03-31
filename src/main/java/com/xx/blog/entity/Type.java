package com.xx.blog.entity;


import java.io.Serializable;

public class Type implements Serializable {

  private long id;
  private String type;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

}
