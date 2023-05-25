public class Bicicleta implements PegadaDeCarbono {

    private String name;
    private double kmDistancia;


    public Bicicleta(String name, double kmDistancia) {
        this.name = name;
        this.kmDistancia = kmDistancia;
    }


    public String getName() {
        return name;
    }
    public double getKmDistancia() {
        return kmDistancia;
    }

    @Override
    public double getPegadaDeCarbono(){
        return kmDistancia * 0.01;
    }
}
