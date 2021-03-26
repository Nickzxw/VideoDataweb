package com.springboot.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dbvgdata {

  private long id;
  private String name;
  private String platform;
  private String year;
  private String genre;
  private String publisher;
  private double naSales;
  private double euSales;
  private double jpSales;
  private double otherSales;
  private double globalSales;
  private double criticScore;
  private long criticCount;
  private double userScore;
  private long userCount;
  private String rating;

  @Id
  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }


  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }


  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }


  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }


  public double getNaSales() {
    return naSales;
  }

  public void setNaSales(double naSales) {
    this.naSales = naSales;
  }


  public double getEuSales() {
    return euSales;
  }

  public void setEuSales(double euSales) {
    this.euSales = euSales;
  }


  public double getJpSales() {
    return jpSales;
  }

  public void setJpSales(double jpSales) {
    this.jpSales = jpSales;
  }


  public double getOtherSales() {
    return otherSales;
  }

  public void setOtherSales(double otherSales) {
    this.otherSales = otherSales;
  }


  public double getGlobalSales() {
    return globalSales;
  }

  public void setGlobalSales(double globalSales) {
    this.globalSales = globalSales;
  }


  public double getCriticScore() {
    return criticScore;
  }

  public void setCriticScore(double criticScore) {
    this.criticScore = criticScore;
  }


  public long getCriticCount() {
    return criticCount;
  }

  public void setCriticCount(long criticCount) {
    this.criticCount = criticCount;
  }


  public double getUserScore() {
    return userScore;
  }

  public void setUserScore(double userScore) {
    this.userScore = userScore;
  }


  public long getUserCount() {
    return userCount;
  }

  public void setUserCount(long userCount) {
    this.userCount = userCount;
  }


  public String getRating() {
    return rating;
  }

  public void setRating(String rating) {
    this.rating = rating;
  }

  @Override
  public String toString() {
    return "Class{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", platform='" + platform + '\'' +
            ", year=" + year + '\'' +
            ", genre='" + genre + '\'' +
            ", publisher='" + publisher + '\'' +
            ", naSales=" + naSales + '\'' +
            ", euSales=" + euSales + '\'' +
            ", jpSales=" + jpSales + '\'' +
            ", otherSales=" + otherSales + '\'' +
            ", globalSales='" + globalSales + '\'' +
            ", criticScore='" + criticScore + '\'' +
            ", criticCount='" + criticCount + '\'' +
            ", userScore='" + userScore + '\'' +
            ", userCount='" + userCount + '\'' +
            ", rating='" + rating + '\'' +
            '}';
  }
}
