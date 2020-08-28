package com.grupo5.Hospital;

public class Hospital {
//Atributos
public String name;
public int doctores;
public int enfermeros; 
    
public  int  paciente ;
public  int  limpieza ;
public  int  Seguridad ;

    

//Constructor de asignaciones
public Hospital (String name, int doctores, int enfermeros){
    this.name=name;
    this.doctores=doctores;
    this.enfermeros=enfermeros;
}

//Metodos
public void Showdoctores(int doctores){
this.doctores=doctores;
}
    
public Hospital(){
    
}
}
