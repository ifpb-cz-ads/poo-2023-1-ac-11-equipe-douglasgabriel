import java.util.ArrayList;

public class TesteFormaGeo {
    public static void main(String[] args) {
         Quadrado quadrado = new Quadrado(5);
         Retangulo retangulo = new Retangulo(4, 6);
         Circulo circulo = new Circulo(3);
 
        ArrayList<FormaGeo> formas = new ArrayList<>();
        formas.add(quadrado);
        formas.add(retangulo);
        formas.add(circulo);

        for (FormaGeo forma : formas) {
            if (forma instanceof Quadrilatero) {
                Quadrilatero quadrilatero = (Quadrilatero) forma;
                System.out.println("Quadrilátero:");
                System.out.println("Lados: " + quadrilatero.getLado1() + ", " + quadrilatero.getLado2() + ", " + quadrilatero.getLado3() + ", " + quadrilatero.getLado4());
                System.out.println("Perímetro: " + quadrilatero.perimetro());
                System.out.println("Área: " + forma.area());
            } else if (forma instanceof Circulo) {
                Circulo circ = (Circulo) forma;
                System.out.println("Círculo:");
                System.out.println("Raio: " + circ.getRaio());
                System.out.println("Perímetro: " + forma.perimetro());
                System.out.println("Área: " + forma.area());
            }
        }
    }
}