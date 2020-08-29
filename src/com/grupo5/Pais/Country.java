package com.grupo5.Country;

public class Country {
//ATRIBUTOS
public String Countrysname;
public int FemalePopulation;
public int MalePopulation;
public int PostalCode;
public String President;
public String[] Languages;

//CONSTRUCTOR DE ASIGNACION
public Country (String countrysname, int femalepopulation, int malepopulation, int postalcode, String president, String[] languages){
Countrysname = countrysname;
FemalePopulation = femalepopulation;
MalePopulation = malepopulation;
PostalCode = postalcode;
President = president;
Languages=languages;
}

//CONSTRUCTOR VALORES POR DEFECTO
public Country(){
Countrysname = "Unknow -_-";
FemalePopulation = 200;
MalePopulation = 500;
PostalCode = 00000;
President = "Otto";
String[] language=new String []{"español", "frances"};
Languages= language;
}


//METODOS
public void PresidentElection(String president){
President=president;
}
public void  ShowTotalPopulation(){
System.out.println(FemalePopulation+MalePopulation);
}
public void ShowLocalLangguages(){for(int i=0;i<Languages.length;i++){System.out.println(Languages[i]);}
}
public void ShowCurrentPresident(){
System.out.println(President);
}
public void MalePopulationUpdate(int malepopulation){
MalePopulation=malepopulation;
}
public void tazaMortalidad(int FemalePopulation,int MalePopulation){
        double x = FemalePopulation*0.02 + MalePopulation*0.01;
        System.out.println("La taza de mortalidad es: "+x+" personas al año");
    }    
 public  void tazaNatalidad(int FemalePopulation,int MalePopulation){
        double x = FemalePopulation*0.01 + MalePopulation*0.02;
        System.out.println("La taza de mortalidad es: "+x+" personas al año");
    }   
    public void niñosDesnut(int FemalePopulation,int MalePopulation){
        double x = FemalePopulation*0.03 + MalePopulation*0.03;
        System.out.println("La taza de desnutricion  es: "+x+" niños al año");
    }
 public void mayoresEdad(int FemalePopulation,int MalePopulation){
        double x = FemalePopulation*0.1 + MalePopulation*0.15;
        System.out.println("La poblacion mayor de 18 años es de: "+x);
    }    
     public void terceraEdad(int FemalePopulation,int MalePopulation){
        double x = FemalePopulation*0.1 + MalePopulation*0.12;
        System.out.println("La poblacion de adultos de la tercera edad es de: "+x);
    }    
        
        
//CLASES HIJAS
public class Department{} 
public class Municipio{}
public class State{}
public class Capital{}
}
