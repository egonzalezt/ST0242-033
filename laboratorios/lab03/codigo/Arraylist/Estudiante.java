package com.company;

    /*
    *Clase estudiante, encargada de almacenar todos los atributos de estudiante
    */
public class Estudiante {
    private String nombre;
    private String codigo;
    private String Codmateria;
    private String semestre;
    private String grupo;
    private String descripevl;
    private String porcentaje;
    private String descrip;
    private String materia;
    private String nota;
    private String notadef;

    /**
   * @param nombre
   * @param codigo
   * @param codmateria
   * @param semestre
   * @param grupo
   * @param descripevl
   * @param porcentaje
   * @param descrip
   * @param materia
   * @param nota
   * @param notadef
   * atributos de estudiante obtenidos por el archivo csv.
   */
    public Estudiante(String nombre, String codigo, String codmateria, String semestre, String grupo, String descripevl, String porcentaje, String descrip, String materia, String nota, String notadef) {
        this.nombre = nombre;
        this.codigo = codigo;
        Codmateria = codmateria;
        this.semestre = semestre;
        this.grupo = grupo;
        this.descripevl = descripevl;
        this.porcentaje = porcentaje;
        this.descrip = descrip;
        this.materia = materia;
        this.nota = nota;
        this.notadef = notadef;
    }

    /**
   * @return nombre del estudiante
   */
    public String getNombre() {
        return nombre;
    }

    /**
   * @return codigo del estudiante
   */
    public String getCodigo() {
        return codigo;
    }
    
   /**
   * @return codigo de la materia
   */
    public String getCodmateria() {
        return Codmateria;
    }
    
    /**
   * @return semestre que esta cursando el estudiante
   */
    public String getSemestre() {
        return semestre;
    }

    /**
   * @return grupo que esta cursando el estudiante
   */
    public String getGrupo() {
        return grupo;
    }

    /**
   * @return descripcion del porcentaje a evaluar
   */
    public String getDescripevl() {
        return descripevl;
    }

    /**
   * @return porcentaje a evaluar
   */
    public String getPorcentaje() {
        return porcentaje;
    }

    /**
   * @return tipo de evaluacion
   */
    public String getDescrip() {
        return descrip;
    }

    /**
   * @return materia que cursa el estudiante
   */
    public String getMateria() {
        return materia;
    }

    /**
   * @return nota obtenida 
   */
    public String getNota() {
        return nota;
    }

    /**
   * @return nota final de la materia
   */
    public String getNotadef() {
        return notadef;
    }

    /**
    * @return String datos del estudiante registrado
    */
    @Override
    public String toString() {
        return "Estudiante{" +
                "Nombre='" + nombre + '\'' +
                ", Codigo='" + codigo + '\'' +
                ", Codmateria='" + Codmateria + '\'' +
                ", Semestre='" + semestre + '\'' +
                ", Grupo='" + grupo + '\'' +
                ", Descripcion Evaluacion='" + descripevl + '\'' +
                ", Porcentaje='" + porcentaje + '\'' +
                ", Descripcion='" + descrip + '\'' +
                ", materia='" + materia + '\'' +
                ", Nota='" + nota + '\'' +
                ", Nota Definitiva='" + notadef + '\'' +
                '}';
    }
}
