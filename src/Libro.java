public class Libro{
    private int id;
    private String titulo;
    private String autor;
    private boolean prestado;

    //Constructor
    public Libro(int id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        prestado = false;
    }
    //Metodos
    public void mostrarInformacion() {
        System.out.printf("Id: %d | Titulo: %s | Autor: %s%n", id, titulo, autor);
    }
    public boolean estaPrestado() {
        return prestado;
    }
    public void prestar() {
        prestado = true;
    }
    public void devolver() {
        prestado = false;
    }
    //Getters
    public int getId() {
        return id;
    }
    //Setters
    public void setAutor(String autor) {
        this.autor = autor;
    }
}
