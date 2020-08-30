package com.grupo5.University;

public class Departamento extends University{
  private String name;
  
  public Departamento(){
    name = "";
  }
  
  public void setName(String name){
    this.name = name;
  }
  
  public String getName(){
    return name;
  }
}
