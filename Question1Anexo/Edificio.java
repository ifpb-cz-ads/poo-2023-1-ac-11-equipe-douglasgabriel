public class Edificio implements PegadaDeCarbono {

    private String name;
    private double cosEnergia;

    public Edificio(String name,double cosEnergia) {
        this.cosEnergia = cosEnergia;
        this.name = name;
    }

    public double getCosEnergia() {
        return cosEnergia;
    }
    public String getName() {
        return name;
    }

    @Override
    public double getPegadaDeCarbono(){
        return cosEnergia * 5.6;
    }
}