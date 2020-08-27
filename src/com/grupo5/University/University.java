package com.grupo5.University;

public class University {
    // ATRIBUTOS
    public String name;
    public String[] schools;
    private boolean isPublic;
    private int students;

    // CONSTRUCTOR POR DEFECTO
    public University(){
        name = "Universidad de ...";
        schools = new String[]{"Ingenieria", "Medicina", "Arquitectura"};
        isPublic = true;
        students = 10000;
    }

    // ASIGNAR VALORES INICIALES
    public University(String name, String[] schools, boolean isPublic, int students){
        this.name = name;
        this.schools = schools;
        this.isPublic = isPublic;
        this.students = students;
    }

    // ASIGNAR NOMBRE
    public void setName(String name) {
        this.name = name;
    }

    // ASIGNAR ESCUELAS
    public void setSchools(String[] schools) {
        this.schools = schools;
    }

    // ASIGNAR SI ES PUBLICA O PRIVADA
    public void setPublic(boolean isPublic) {
        this.isPublic = isPublic;
    }

    // ASIGNAR ESTUDIANTES
    public void setStudents(int students) {
        this.students = students;
    }
}
