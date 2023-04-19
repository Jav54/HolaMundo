import java.util.Scanner;

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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }


    public void ingresarAttr(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del dueño: ");
        this.nombre = sc.next();
        System.out.println("Ingrese la cédula del dueño: ");
        this.cedula = sc.next();
    }
}
