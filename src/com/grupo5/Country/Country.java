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
public void PresidentialElection(String president){
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
public void MalePupulationUpdate(int malepopulation){
MalePopulation=malepopulation;} 

    
    public Country(){}
}
