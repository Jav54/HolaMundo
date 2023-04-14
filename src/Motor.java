public class Motor {

    public Motor(String serie, Double cilindraje, String tipoCombustible){
            this.serie=serie;
            this.cilindraje=cilindraje;
            this.tipoCombustible=tipoCombustible;
    }

    public Motor(String serie) {
        this.serie = serie;
    }

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

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(Double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
}
