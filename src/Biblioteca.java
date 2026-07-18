import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;
    private int proximoId;

    //Constructor
    public Biblioteca() {
        libros = new ArrayList<>();
        proximoId = 0;
    }
    //Metodo
    public void agregarLibro(String titulo, String autor) {
        libros.add(new Libro(proximoId, titulo, autor));
        proximoId++;
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
}
