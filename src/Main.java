// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Duenio duenio1 = new Duenio("Javier Morales", "1722828827");
        Motor motor1 = new Motor("A451B57",1.6, "diesel");
        Auto auto1 = new Auto("PBE8545", "Corolla", 2019, "Toyota", motor1, duenio1, 4);

        Duenio duenio2= new Duenio("1711439016");
        Motor motor2= new Motor("PDX1234");
        Auto auto2= new Auto(motor2,duenio2);

        auto1.setPlaca("PBT9843");
        auto1.setNumRuedas(6);

        String placaauto1 = auto1.getPlaca();






    }
}