package com.grupo5.University;

public class Trabajadores extends University{
	  // ATRIBUTOS
	private String nombre;
    private String trabajo;
    private int edad;
    private int sueldo;

 

    // ASIGNAR VALORES
    public Trabajadores(String nombre, String trabajo, int edad, int sueldo){
        this.nombre=nombre;
    	this.trabajo=trabajo;
        this.edad=edad;
        this.sueldo=sueldo;
    }
    public void mostrardatos() {
	 System.out.println("nombre del trabajador  "+nombre+",  trabaja de  "+trabajo+",  edad  "+edad+",  sueldo  "+sueldo);
    }
   
}
