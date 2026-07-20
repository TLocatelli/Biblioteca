import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Biblioteca biblioteca = new Biblioteca();

        Scanner sc = new Scanner(System.in);
        int opcionUsuario;
        boolean continuar = true;

        while(continuar) {

            mostrarMenu();

            opcionUsuario = sc.nextInt();
            sc.nextLine();
            switch (opcionUsuario) {
                case 1:
                    agregarLibros(sc, biblioteca);
                    break;
                case 2:
                    mostrarLibro(biblioteca);
                    break;
                case 3:
                    buscarLibro(sc, biblioteca);
                    break;
                case 4:
                    eliminarLibros(sc, biblioteca);
                    break;
                case 5:
                    modificarAutor(sc, biblioteca);
                    break;
                case 6:
                    continuar = false;
                    System.out.println("Saliendo del programa!\n");
                    break;
                default:
                    System.out.println("Opcion incorrecta!\n");
            }
        }
        sc.close();
    }
    private static void mostrarMenu() {
        System.out.println("-----Menu-----\n");
        System.out.println("1-Agregar libro\n2-Mostrar libros\n" +
                "3-Buscar libro por ID\n4-Eliminar libro\n" +
                "5-Modificar autor\n6-Salir\n");
    }
    private static void agregarLibros(Scanner sc, Biblioteca biblioteca) {
        System.out.println("Ingrese el titulo: ");
        String titulo = sc.nextLine();
        System.out.println("Ingrese el autor: ");
        String autor = sc.nextLine();
        biblioteca.agregarLibro(titulo,autor);
        System.out.println("Se agrego correctamente.\n");
    }
    private static void mostrarLibro(Biblioteca biblioteca) {
        biblioteca.mostrarLibros();
    }
    private static void buscarLibro(Scanner sc, Biblioteca biblioteca) {
        System.out.println("Ingrese el id a buscar: ");
        int idBuscar = sc.nextInt();
        Libro libroBuscar = biblioteca.buscarLibro(idBuscar);
        if(libroBuscar == null){
            System.out.println("No existe libro con ese id.\n");
        }else{
            libroBuscar.mostrarInformacion();
        }
    }
    private static void eliminarLibros(Scanner sc, Biblioteca biblioteca) {
        System.out.println("Ingrese el id del libro a eliminar: ");
        int idEliminar = sc.nextInt();
        boolean eliminado = biblioteca.eliminarLibro(idEliminar);
        if(eliminado){
            System.out.println("Eliminado.\n");
        }else{
            System.out.println("No existe.\n");
        }
    }
    private static void modificarAutor(Scanner sc, Biblioteca biblioteca) {
        System.out.println("Ingrese el id del libro: ");
        int idCambiarAutor = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el nuevo autor: ");
        String nuevoAutor = sc.nextLine();
        boolean realizado = biblioteca.modificarAutor(idCambiarAutor, nuevoAutor);
        if(realizado){
            System.out.println("Realizado.\n");
        }else{
            System.out.println("No se encontro el id.\n");
        }
    }
}
