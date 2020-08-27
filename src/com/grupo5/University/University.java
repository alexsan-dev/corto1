package com.grupo5.University;

public class University {
    // ATRIBUTOS
    protected String name;
    protected School[] schools;
    protected boolean isPublic;
    protected int students;

    // CONSTRUCTOR POR DEFECTO
    public University(){
        name = "de ...";
        schools = new School[]{};
        isPublic = true;
        students = 10000;
    }

    // ASIGNAR VALORES INICIALES
    public University(String name, School[] schools, boolean isPublic, int students){
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
    public void setSchools(School[] schools) {
        this.schools = schools;
    }

    // AGREGAR ESCUELA
    public void addSchool(School school){
        // AUMENRAR ARRAY
        School[] tmpSchools = new School[schools.length + 1];

        // ASIGNAR VALORES ANTERIORES
        for(int schoolIndex = 0; schoolIndex < schools.length;schoolIndex++)
            tmpSchools[schoolIndex] = schools[schoolIndex];

        // AGREGAR ULTIMO VALOR
        tmpSchools[tmpSchools.length - 1] = school;
        schools = tmpSchools;
    }

    public void addSchool(String name, int students, boolean isFaculty){
        // CREAR NUEVA ESCUELA
        School tmpSchool = new School(name, students, isFaculty);

        // AGREGAR AL ARRAY
        this.addSchool(tmpSchool);
    }

    // ASIGNAR SI ES PUBLICA O PRIVADA
    public void setPublic(boolean isPublic) {
        this.isPublic = isPublic;
    }

    // ASIGNAR ESTUDIANTES
    public void setStudents(int students) {
        this.students = students;
    }

    // MOSTRAR INFORMACION
    public String toString() {
        // TITULO
        String isPublicStr = isPublic?"publica ":"privada ";
        String title =  "Universidad " + isPublicStr + name + " cuenta con " + schools.length + " areas:\n";

        // MOSTRAR ESCUELAS
        String schoolsStr = "";

        for(int i = 0; i < schools.length; i++)
            schoolsStr += "\t- " + schools[0].toString() + "\n";

        // RETORNAR TEXTO
        return title + schoolsStr;
    }
}
