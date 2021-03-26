package com.springboot.entity;

import javax.persistence.Id;
import javax.persistence.Entity;


/**
 * 游戏开发商实体类
 */
@Entity
public class UserInterestPublisher {

  private long id;
  private String publisher;
  private long publisherValue;



  @Id
  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }


  public long getPublisherValue() {
    return publisherValue;
  }

  public void setPublisherValue(long publisherValue) {
    this.publisherValue = publisherValue;
  }


  @Override
  public String toString() {
    return "Class{" +
            "id='" + id + '\'' +
            ", publisher='" + publisher + '\'' +
            ", publishervalue='" + publisherValue + '\'' +
            '}';
  }
}
