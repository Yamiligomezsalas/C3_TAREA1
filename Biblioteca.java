package biblioteca;

import jdk.swing.interop.SwingInterOpUtils;

//Librerias
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Biblioteca {

    public static void main(String[] args) {
        //Arreglos
        ArrayList<Libros> lisLibro = new ArrayList<>();
        ArrayList<Revistas> lisRevista = new ArrayList<>();
        ArrayList<Libros> libroPres = new ArrayList<>();

        //Objetos
        Scanner datos = new Scanner(System.in);
        Random random = new Random();

        //Atributos
        String codi,titulo, año;
        int op;

        do
        {

            System.out.println("----- Menu -----");
            System.out.println("1.- Crear Libro");
            System.out.println("2.- Crear Revista ");
            System.out.println("3.- Prestar libro");
            System.out.println("4.- Lista de libros prestados");
            System.out.println("5.- Devolver libro");
            System.out.println("6.- Salir");
            op = Integer.parseInt(datos.nextLine());

            switch(op)
            {
                case 1:
                    // Creacion de libros
                    System.out.println("Titulo: ");
                    titulo = datos.nextLine();
                    System.out.println("Fecha de publicacion: ");
                    año = datos.nextLine();
                    codi = String.valueOf(random.nextInt()); // generar un numero aleatorio
                    lisLibro.add(new Libros(codi,titulo,año));
                    break;
                case 2:
                    //Creacion de Revistas
                    int numero;
                    System.out.println("Titulo del libro:");
                    titulo = datos.nextLine();
                    System.out.println("Fecha: ");
                    año = datos.nextLine();
                    System.out.println("Numero de revista: ");
                    numero = datos.nextInt();
                    codi = String.valueOf(random.nextInt());

                    lisRevista.add(new Revistas(codi,titulo,año,numero));
                    break;
                case 3:
                    //Solicitar prestamo
                    libroPres.add(Prestable.prestar(lisLibro));
                    break;
                case 4:
                    Prestable.prestado(libroPres);
                    break;
                case 5:
                    libroPres.remove(Prestable.devolver(libroPres));
                    break;
                case 6:
                        System.exit(0);
                        break;
                default:
                    System.out.println("el opcion no es correcta");
                    break;
            }

        }while(op != 6);
    }
    
}
