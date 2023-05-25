public class Retangulo extends Quadrilatero{
    private double base;
    private double altura;

    public Retangulo(double base, double altura){
        super(base, altura, base, altura );
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double area() {
        return base * altura;
    }
    
}
