import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;
    private ArrayList<Persona> personas;
    private ArrayList<Prestamo> prestamos;
    private int proximoIdLibros;
    private int proximoIdPersonas;

    //Constructor
    public Biblioteca() {
        libros = new ArrayList<>();
        personas = new ArrayList<>();
        prestamos = new ArrayList<>();
        proximoIdLibros = 0;
        proximoIdPersonas = 0;
    }
    //Metodos para libros
    public void agregarLibro(String titulo, String autor) {
        libros.add(new Libro(proximoIdLibros, titulo, autor));
        proximoIdLibros++;
    }
    public void mostrarLibros() {
        if(libros.isEmpty()) {
            System.out.println("La biblioteca esta vacia.");
        }else{
            for(Libro libro:libros) {
                libro.mostrarInformacion();
            }
        }
    }
    public Libro buscarLibro(int id) {
        for(Libro libro:libros){
            if(libro.getId() == id) {
                return libro;
            }
        }
        return null;
    }
    public boolean eliminarLibro(int id) {
        Libro libro = buscarLibro(id);
        if(libro != null){
            libros.remove(libro);
            return true;
        }
        return false;
    }
    public boolean modificarAutor(int id, String nuevoAutor) {
        // buscar libro
        Libro libro = buscarLibro(id);
        if(libro != null) {
            libro.setAutor(nuevoAutor);
            return true;
        }
        return false;
    }
    //Metodos para personas
    public void agregarPersona(String nombre) {
        personas.add(new Persona(proximoIdPersonas, nombre));
        proximoIdPersonas++;
    }
    public void mostrarPersonas() {
        if(personas.isEmpty()) {
            System.out.println("No existen usuarios.");
        }else {
            for(Persona persona:personas) {
                persona.mostrarInformacion();
            }
        }
    }
    public Persona buscarPersona(int id) {
        for (Persona persona:personas) {
            if(persona.getId() == id) {
                return persona;
            }
        }
        return null;
    }
    public boolean eliminarPersona(int id) {
        Persona persona = buscarPersona(id);
        if(persona != null) {
            personas.remove(persona);
            return true;
        }
        return false;
    }
    //Metodos para prestamo
    public boolean prestarLibro(int idLibro, int idPersona) {

        Libro libro = buscarLibro(idLibro);
        Persona persona = buscarPersona(idPersona);

        if(libro == null)
            return false;

        if(persona == null)
            return false;

        if(libro.estaPrestado())
            return false;

        libro.prestar();

        prestamos.add(new Prestamo(libro, persona));

        return true;
    }
}
