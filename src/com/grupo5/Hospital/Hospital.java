package com.grupo5.Hospital;

public class Hospital {
//Atributos
public String name;
public int doctores;
public int enfermeros; 
    
public  int  pacientes ;
public  int  limpieza ;
public  int  Seguridad ;

   // VALORES POR DEFECTO
    public Hospital (){
       pacientes = 300; 
        limpieza = 100;
        seguridad = 75;
    } 

//Constructor de asignaciones
public Hospital (String name, int doctores, int enfermeros,int pacientes,int limpeza,int seguridad){
    this.name=name;
    this.doctores=doctores;
    this.enfermeros=enfermeros;
    this.pacientes=pacientes;
    this.limpieza= limpieza;
    this.seguridad=seguridad;
}

//Metodos
public void Showdoctores(int doctores){
this.doctores=doctores;
}
    
public Hospital(){
    
}
    public  void   pacientes () {
System.out.println(No de pacientes + pacientes);
}

    public  void   limpieza () {
System.out.println(No de empleados de limpieza + limpieza);

}

    public  void  seguridad () {
System.out.println(No de agentes de seguridad + seguridad);
}

    
    
}

//CLASES HIJAS
public class Quirofamo{} 
public class Intensivo{}
