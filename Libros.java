package biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Libros implements Prestable{

    public static int contador;
    int id;
    String codigo,Titulo,año;
    public static boolean pres;
    
    public Libros(String codigo, String titulo, String año)
    {
        this.codigo = codigo;
        this.Titulo = titulo;
        this.año = año;
        this.pres = false;//esto hace que al agregar no marque de forma automatica
        this.id = ++contador;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        this.Titulo = titulo;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public int getId()
    {
        return id;
    }

    public boolean isPrestado() {
        return pres;
    }

    public void setPrestado(boolean prestado) {
        this.pres = prestado;
    }

    public static void imprimirlisLibros(ArrayList<Libros> lista)
    {
        String estanteria = "";

        //Recorrer arreglos
        for (Libros l: lista) {
            estanteria += "Id: " + l.getId() + "\t" + "Titulo: " + l.getTitulo() + "\t" + "Fecha n: " + l.getAño() + "\t" + " Codigo de libro: " + l.getCodigo() + "\n";
        }
        System.out.println(estanteria);
    }

    @Override
    public String toString() {
        return "Libros{" +
                "codigo='" + codigo + '\'' +
                ", titulo='" + Titulo + '\'' +
                ", año='" + año + '\'' +
                ", prestado=" + pres +
                '}';
    }
}
