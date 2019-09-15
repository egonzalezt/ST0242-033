package com.company;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Estudiantes {

    private ArrayList<Estudiante> estudiantes;

    public Estudiantes()
    {
        try {
            registro();
        }catch(Exception e){}
    }

    public void registro() throws FileNotFoundException
    {
        try
        {
            Reader read = new Reader();
            estudiantes = read.Lector();
            this.estudiantes = estudiantes;
        }catch(Exception e)
        {
            System.out.println("\n Error no se detecto ningun archivo\n");
        }
    }

    public void Consultacurso(String materia, String semestre)
    {
        for(Estudiante estudiante : estudiantes)
        {
            if(estudiante.getMateria().equalsIgnoreCase(materia)&&estudiante.getSemestre().equalsIgnoreCase(semestre))
            {
                System.out.println(estudiante.toString());
            }
        }
    }

    public void Consultaestudiante(String nombre, String semestre)
    {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNombre().equalsIgnoreCase(nombre) && estudiante.getSemestre().equalsIgnoreCase(semestre)) {
                System.out.println(estudiante.toString());
            }
        }
    }






























    /*
    private ArrayList<Estudiante> estudiante = new ArrayList<Estudiante>();
    private ArrayList<Materia> mat = new ArrayList<Materia>();

    public void createList()
    {

        Scanner reader = new Scanner(System.in);
        //int i=0;
        //while(i<=2)
        //{
            System.out.println("Ingrese el nombre \n");
            String nombre = reader.next();
            System.out.println("Ingrese el semestre \n");
            String semestre = reader.next();
            System.out.println("cuantas Materias desea ingresar \n");
            int materias= reader.nextInt();

            for(int j=0;j<materias;j++)
            {
                System.out.println("Ingrese el materia \n");
                String Materia = reader.next();
                System.out.println("Nota \n");
                double nota = reader.nextInt();
                Materia d1 = new Materia(Materia,nota);
                mat.add(d1);
            }
            addStudent(nombre,semestre,mat);
           // i++;
        //}

    }

    private void addStudent(String nombre, String semestre, ArrayList<Materia> materia)
    {
        Estudiante d1 = new Estudiante(nombre,semestre,materia);
        estudiante.add(d1);
    }

    public void Materia(String semetre,String materia)
    {
        for(int i=0;i<estudiante.size();i++)
        {
            if(estudiante.get(i).getMaterias().get(i).getMateria().equalsIgnoreCase(materia)&&estudiante.get(i).getSemestre().equalsIgnoreCase(semetre))
            {
                System.out.println("Nombre: "+estudiante.get(i).getNombre()+" \t");
                System.out.print("Materia: "+estudiante.get(i).getMaterias().get(i).getMateria()+" \t");
                System.out.print("Nota: "+estudiante.get(i).getMaterias().get(i).getNota()+" \n");
            }
        }
    }

    public void Semestre(String semetre,String nombre)
    {
        int pos=0;
        for(int i=0;i<estudiante.size();i++)
        {
            if(estudiante.get(i).getSemestre().equalsIgnoreCase(semetre)&&estudiante.get(i).getNombre().equalsIgnoreCase(nombre))
            {
                pos=i;
            }
        }

        int Materiastam = estudiante.get(pos).getMaterias().size();

        System.out.println("a"+Materiastam);
        System.out.println("Nombre: "+estudiante.get(pos).getNombre()+" \t");
        System.out.print("Semestre: "+estudiante.get(pos).getSemestre()+" \n");

        for(int j=0; j<Materiastam;j++)
        {
            System.out.print("Materia: "+estudiante.get(pos).getMaterias().get(j).getMateria()+" \t");
            System.out.print("Nota: "+estudiante.get(pos).getMaterias().get(j).getNota()+" \t");
            System.out.println();
        }

    }*/
}
