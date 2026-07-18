public class Persona{
    private int id;
    private String nombre;

    public Persona(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    //Metodos
    public void mostrarInformacion() {
        System.out.printf("Id: %d | Nombre: %s", id, nombre);
    }
    //Getters
    public int getId() {
        return id;
    }
}
