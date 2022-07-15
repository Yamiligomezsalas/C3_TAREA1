package biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public interface Prestable{

    Scanner opc = new Scanner(System.in);
    public static Libros prestar(ArrayList<Libros> listaLib)
    {
        Libros.imprimirlisLibros(listaLib);
             System.out.println("Ingrese el id del libro: ");
        int op = Integer.parseInt(opc.nextLine());
        listaLib.get(op -1).setPrestado(true);
        return listaLib.get(op -1); 
    }
    
    public static Libros devolver(ArrayList<Libros> listaDevolver)
    {
        
        Libros.imprimirlisLibros(listaDevolver);
               System.out.println("Ingresar la posicion del libro: \n");
        int op = Integer.parseInt(opc.nextLine());
        return listaDevolver.remove(op);
    }
    
    public static void prestado(ArrayList<Libros> prestados)
    {
        String librosPrestados = "";

        
        for (Libros l: prestados) {
            librosPrestados += "Id: " + l.getId() + "\t" + "Titulo: " + l.getTitulo() + "\t" + "Fecha de publicacion: " + l.getAño() + "\t" + " Codigo de libro: " + l.getCodigo() + "\n";
        }
            System.out.println(librosPrestados);
    }
}
