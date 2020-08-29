package com.grupo5.University;

public class Departamentodequimica extends University {
	  // ATRIBUTOS
private String encargado;
  private int trabajadores;
  private String edificio;



  // ASIGNAR VALORES
  public Departamentodequimica(String encargado,int trabajadores, String edificio){
      this.encargado=encargado;
  	  this.trabajadores=trabajadores;
      this.edificio=edificio;
     
  }
  public void datos() {
	 System.out.println("nombre de la encargado del departamento de quimica "+encargado+",  numero de trabajadores  "+trabajadores+",  edificio  "+edificio);
  }
 
}



