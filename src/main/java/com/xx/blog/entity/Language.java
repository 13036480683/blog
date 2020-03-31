package com.xx.blog.entity;


import java.io.Serializable;

public class Language implements Serializable {

  private long id;
  private String language;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

}
