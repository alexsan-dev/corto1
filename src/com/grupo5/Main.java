package com.grupo5;

import com.grupo5.Country.Country;
import com.grupo5.Country.Departament;
import com.grupo5.Hospital.Areas;
import com.grupo5.Hospital.Hospital;
import com.grupo5.University.Departamento;
import com.grupo5.University.University;

public class Main {

    public static void main(String[] args) {
        // UNIVERSIDAD
        System.out.println("CLASE UNIVERSIDAD -------------------------------");
        University u = new University();
        u.setName("Prueba");

        Departamento dep = new Departamento();
        dep.setName("Fisica");

        System.out.println(u.toString());
        System.out.println(dep.getName());



        System.out.println("\nCLASE PAIS -------------------------------");
        // PAIS
        Country pais = new Country();
        pais.ShowTotalPopulation();

        Departament depCountry = new Departament();

        System.out.println("\nCLASE HOSPITAL -------------------------------");
        Hospital hospital = new Hospital();
        hospital.Showpacientes();

        Areas areas = new Areas();
    }
}
