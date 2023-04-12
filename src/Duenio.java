public class Duenio {

    public Duenio(){

    }

    public Duenio(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public Duenio(String cedula) {
        this.cedula = cedula;
    }

    String nombre;
    String cedula;
}
