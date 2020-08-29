package com.grupo5.Hospital;

public class Hospital {
//Atributos
public String name;
public int doctores;
public int enfermeros; 
public  int  pacientes ;
public  int  limpieza ;
public  int  Seguridad ;
public int hospital;
public int visitantes;
public int suministros;

   // VALORES POR DEFECTO
    public Hospital (){
       pacientes = 300; 
        limpieza = 100;
        seguridad = 75;
        doctores= 200;
        enfermeros= 100;
        hospital=3;
        visitantes=500;
        suministros=300;
    } 

//Constructor de asignaciones
public Hospital (String name, int doctores, int enfermeros,int pacientes,int limpeza,int seguridad, int hospital, int visitantes){
    this.name=name;
    this.doctores=doctores;
    this.enfermeros=enfermeros;
    this.pacientes=pacientes;
    this.limpieza= limpieza;
    this.seguridad=seguridad;
    this.hospital=hospital;
    this.visitantes=visitantes;
    this.suministros=suministros;
}

//Metodos
    public void Showdoctores(int doctores){
this.doctores=doctores;
}
    
    public Hospital(){
this.hospital=hospital;    
}
    public  void   pacientes () {
System.out.println("No de pacientes + pacientes");
}

    public  void   limpieza () {
System.out.println("No de empleados de limpieza + limpieza");
}

    public  void  seguridad () {
System.out.println("No de agentes de seguridad + seguridad");
}

    public void enfermeros(){
System.out.println("No de enfermeros + enfermeros");
}
    
    public void sedesHospital(){
System.out.println("No de hospital + hospital");
}
    
    public void pacientes(){
this.pacientes=pacientes;        
}
    
    public void suministros(){
System.out.println("No de suministros + suministros");
}
    
    public void visitantes(){
System.out.println("No. de visitantes + visitantes");        
}
        
    
    
}

