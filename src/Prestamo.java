public class Prestamo {
    private Libro libro;
    private Persona persona;

    //Constructor
    public Prestamo(Libro libro, Persona persona) {
        this.libro = libro;
        this.persona = persona;
    }
    //Getters
    public Libro getLibro() {
        return libro;
    }
    public Persona getPersona() {
        return persona;
    }
}
