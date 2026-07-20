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
                    agregarLibro(sc, biblioteca);
                    break;
                case 2:
                    mostrarLibros(biblioteca);
                    break;
                case 3:
                    buscarLibro(sc, biblioteca);
                    break;
                case 4:
                    eliminarLibro(sc, biblioteca);
                    break;
                case 5:
                    modificarAutor(sc, biblioteca);
                    break;
                case 6:
                    agregarPersona(sc,biblioteca);
                    break;
                case 7:
                    mostrarPersonas(biblioteca);
                    break;
                case 8:
                    buscarPersona(sc,biblioteca);
                    break;
                case 9:
                    eliminarPersona(sc,biblioteca);
                    break;
                case 10:
                    prestarLibro(sc,biblioteca);
                    break;
                case 11:
                    buscarPrestamo(sc,biblioteca);
                    break;
                case 12:
                    devolverLibro(sc,biblioteca);
                    break;
                case 13:
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
        System.out.println("""
                1-Agregar libro
                2-Mostrar libros
                3-Buscar libro por ID
                4-Eliminar libro
                5-Modificar autor
                
                6-Agregar persona
                7-Mostrar personas
                8-Buscar persona
                9-Eliminar persona
                
                10-Prestar libro
                11-Buscar prestamo
                12-Devolver libro
                
                13-Salir
                """);
    }//Funciones para libros
    private static void agregarLibro(Scanner sc, Biblioteca biblioteca) {
        System.out.println("Ingrese el titulo: ");
        String titulo = sc.nextLine();
        System.out.println("Ingrese el autor: ");
        String autor = sc.nextLine();
        biblioteca.agregarLibro(titulo,autor);
        System.out.println("Se agrego correctamente.\n");
    }
    private static void mostrarLibros(Biblioteca biblioteca) {
        biblioteca.mostrarLibros();
        System.out.println();
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
    private static void eliminarLibro(Scanner sc, Biblioteca biblioteca) {
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
    //Funciones para personas
    private static void agregarPersona(Scanner sc, Biblioteca biblioteca) {
        System.out.println("Ingrese el nombre: ");
        String nombre = sc.nextLine();
        biblioteca.agregarPersona(nombre);
        System.out.println("Se agrego corectamente.\n");
    }
    private static void mostrarPersonas(Biblioteca biblioteca) {
        biblioteca.mostrarPersonas();
    }
    private static void buscarPersona(Scanner sc, Biblioteca biblioteca) {
        System.out.println("Ingrese el id de la persona: ");
        int idPersona = sc.nextInt();
        sc.nextLine();
        Persona persona = biblioteca.buscarPersona(idPersona);
        if(persona != null) {
            persona.mostrarInformacion();
            System.out.println();
        }else {
            System.out.println("No se pudo encontrar el id.\n");
        }
    }
    private static void eliminarPersona(Scanner sc, Biblioteca biblioteca) {
        System.out.println("Ingrese el id de la persona: ");
        int idPersona = sc.nextInt();
        sc.nextLine();
        if(biblioteca.eliminarPersona(idPersona)) {
            System.out.println("Se elimino correctamente.\n");
        }else {
            System.out.println("No se encontro el id.\n");
        }
    }
    //Funciones para prestamos
    private static void prestarLibro(Scanner sc, Biblioteca biblioteca) {
        System.out.println("Ingrese el id del libro: ");
        int idLibro = sc.nextInt();
        System.out.println("Ingrese el id de la persona: ");
        int idPersona = sc.nextInt();
        sc.nextLine();
        if(biblioteca.prestarLibro(idLibro,idPersona)) {
            System.out.println("Se creo el prestamo del libro correctamente.\n");
        }else {
            System.out.println("No fue posible crear el préstamo.\n");
        }
    }
    private static void buscarPrestamo(Scanner sc, Biblioteca biblioteca) {
        System.out.println("Ingrese el id del libro: ");
        int idLibro = sc.nextInt();
        System.out.println("Ingrese el id de la persona: ");
        int idPersona = sc.nextInt();
        sc.nextLine();
        Prestamo prestamo = biblioteca.buscarPrestamo(idLibro,idPersona);
        if(prestamo != null) {
            prestamo.getLibro().mostrarInformacion();
            prestamo.getPersona().mostrarInformacion();
        }
    }
    private static void devolverLibro(Scanner sc, Biblioteca biblioteca) {
        System.out.println("Ingrese el id del libro: ");
        int idLibro = sc.nextInt();
        System.out.println("Ingrese el id de la persona: ");
        int idPersona = sc.nextInt();
        sc.nextLine();
        boolean devuelto = biblioteca.devolverLibro(idLibro,idPersona);
        if(devuelto){
            System.out.println("Devuelto correctamente.\n");
        }else {
            System.out.println("No existe prestamo.\n");
        }
    }
}
