public class Circulo implements FormaGeo{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI *raio;
    }

    @Override
    public double area() {
        return Math.pow(raio,2)*Math.PI;
    }

    
}
