package com.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


/**
 * 用户兴趣实体类
 */
@Entity
public class UserInterestGenre {

  private String genre;
  private long genreValue;
  private long id;

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }


  public long getGenreValue() {
    return genreValue;
  }

  public void setGenreValue(long genreValue) {
    this.genreValue = genreValue;
  }


  @Id
  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "Class{" +
            "id='" + id + '\'' +
            ", genre='" + genre + '\'' +
            ", genrevalue='" + genreValue + '\'' +
            '}';
  }

}
