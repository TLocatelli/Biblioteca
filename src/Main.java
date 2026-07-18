import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Biblioteca biblioteca = new Biblioteca();

        Scanner sc = new Scanner(System.in);
        int opcionUsuario;
        String titulo;
        String autor;
        boolean continuar = true;

        while(continuar) {


            System.out.println("-----Menu-----");
            System.out.println("1-Agregar libro\n2-Mostrar libros\n" +
                    "3-Buscar libro por ID\n4-Eliminar libro\n" +
                    "5-Modificar autor\n6-Salir");

            opcionUsuario = sc.nextInt();
            sc.nextLine();
            switch (opcionUsuario) {
                case 1:
                    System.out.println("Ingrese el titulo: ");
                    titulo = sc.nextLine();
                    System.out.println("Ingrese el autor: ");
                    autor = sc.nextLine();
                    biblioteca.agregarLibro(titulo,autor);
                    break;
                case 2:
                    biblioteca.mostrarLibros();
                    break;
                case 3:
                    System.out.println("Ingrese el id a buscar: ");
                    int idBuscar = sc.nextInt();
                    Libro libroBuscar = biblioteca.buscarLibro(idBuscar);
                    if(libroBuscar == null){
                        System.out.println("No existe libro con ese id.");
                    }else{
                        libroBuscar.mostrarInformacion();
                    }
                    break;
                case 4:
                    System.out.println("Ingrese el id del libro a eliminar: ");
                    int idEliminar = sc.nextInt();
                    boolean eliminado = biblioteca.eliminarLibro(idEliminar);
                    if(eliminado){
                        System.out.println("Eliminado.");
                    }else{
                        System.out.println("No existe.");
                    }
                    break;
                case 5:
                    System.out.println("Ingrese el id del libro: ");
                    int idCambiarAutor = sc.nextInt();
                    sc.nextLine();
                    if(biblioteca.buscarLibro(idCambiarAutor) != null){
                        System.out.println("Ingrese el nuevo autor: ");
                        String nuevoAutor = sc.nextLine();
                        if(biblioteca.modificarAutor(idCambiarAutor,nuevoAutor)){
                            System.out.println("Realizado");
                        }
                    }else{
                        System.out.println("No se encontro el id.");
                    }
                    break;
                case 6:
                    continuar = false;
                    System.out.println("Saliendo del programa!");
                    break;
                default:
                    System.out.println("Opcion incorrecta!");
            }
        }
        sc.close();
    }
}
