public class Motor {

    String serie;
    Double cilindraje;
    String tipoCombustible;

    double torque(){
        double torqueNm=0;
        if(tipoCombustible.equals("gasolina")){
            torqueNm=cilindraje*2;
        } else if (tipoCombustible.equals("diesel")) {
            torqueNm=cilindraje*4;
        }
        return torqueNm;
    }
}
