import java.util.ArrayList;

public class TestePegadaDeCarbono {
    public static void main(String[] args) {
        ArrayList<PegadaDeCarbono> pegadas = new ArrayList<>();
        Bicicleta bicicleta = new Bicicleta("Bicicleta Urbana", 48.56);
        Carro carro = new Carro("Ford Fiesta", 58.6);
        Edificio edificio = new Edificio("burj khalifa", 18000);

        pegadas.add(edificio);
        pegadas.add(bicicleta);
        pegadas.add(carro);

        for (PegadaDeCarbono objeto : pegadas) {
            if(objeto instanceof Edificio) {
                Edificio edf =  (Edificio)objeto;
                System.out.println("Edificio: " + edf.getName());
                System.out.println("Pegada de Carbono: " + edf.getPegadaDeCarbono());
                System.out.println();
            }else if(objeto instanceof Bicicleta){
                Bicicleta bick = (Bicicleta)objeto;
                System.out.println("Bicicleta: " + bick.getName());
                System.out.println("Pegada de Carbono: " + bick.getPegadaDeCarbono());
                System.out.println();
            }else if(objeto instanceof Carro){
                Carro car = (Carro)objeto;
                System.out.println("Carro: " + car.getName());
                System.out.println("Pegada de Carbono: " + car.getPegadaDeCarbono());
                System.out.println();
            }
        }
    }
}