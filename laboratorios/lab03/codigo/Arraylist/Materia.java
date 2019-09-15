package com.company;

public class Materia {
    private String materia;
    private double nota;

    public Materia(String materia, double nota) {
        this.materia = materia;
        this.nota = nota;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

}
