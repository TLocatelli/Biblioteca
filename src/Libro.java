public class Libro{
    private int id;
    private String titulo;
    private String autor;

    //Constructor
    public Libro(int id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }
    //Metodos
    public void mostrarInformacion() {
        System.out.printf("Id: %d | Titulo: %s | Autor: %s%n", id, titulo, autor);
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
