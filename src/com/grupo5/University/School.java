package com.grupo5.University;

public class School {
    // ATRIBUTOS
    private String name;
    private int students;
    boolean isFaculty;

    // VALORES POR DEFECTO
    public School(){
        name = "Facultad de ...";
        students = 10;
        isFaculty = false;
    }

    // ASIGNAR VALORES
    public School(String name, int students, boolean isFaculty){
        this.name = name;
        this.students = students;
        this.isFaculty = isFaculty;
    }

    // RETORNAR STRING CON INFORMACION
    public String toString() {
        String facultyStr = isFaculty ? "Facultad de ":"Escuela de ";
        return facultyStr + name + " con " + students + " estudiantes.";
    }
}
