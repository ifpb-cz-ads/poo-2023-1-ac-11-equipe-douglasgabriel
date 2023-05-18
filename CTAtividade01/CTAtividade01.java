/*
 * Implemente as interfaces Nadador, Corredor e Ciclista e as classes Pessoa
 * e Triatleta como apresentadas nos exemplos deste capítulo. Faça um pro-
 * grama principal que instancie um triatleta e utilize seus métodos.
 */

package CTAtividade01;

import java.util.Scanner;

public class CTAtividade01{
    public static void main(String[] args) {
        Triatleta pessoa = null;
        String nome;
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o seu nome");
        nome = scan.next();

        pessoa = new Triatleta(nome);
        pessoa.aquecer();
        pessoa.correr();
        pessoa.correrDeBicicleta();
        pessoa.nadar();
    }
}
