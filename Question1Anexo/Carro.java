public class Carro implements PegadaDeCarbono {

    private String name;
    private double consComb; // Consumo de combustivel

    public Carro(String name, double consComb) {
        this.consComb = consComb;
        this.name = name;
    }
    // Getters 
    public double getConsComb() {
        return consComb;
    }
    public String getName() {
        return name;
    }
    @Override
    public double getPegadaDeCarbono(){
        return this.consComb * 0.5;
    }
}
