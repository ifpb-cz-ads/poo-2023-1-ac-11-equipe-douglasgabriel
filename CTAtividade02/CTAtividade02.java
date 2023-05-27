package CTAtividade02;

import java.util.ArrayList;
import java.util.Scanner;

public class CTAtividade02 {
    public static void main(String[] args) {
		ArrayList<Conta> lista = new ArrayList<>(); //Criando a o ArrayList
		Conta c = null; //Iniciando a conta com o null
		Cliente cliente = null; //Instanciando a class Cliente
        Scanner scan = new Scanner(System.in); //Scanner para ler as informações
        int opcao; //Para escolher o fazer
		int num; //Num de escolha da conta
		int numeroConta; //Numero da conta
		String nome; //Nome do Titular
		String cpf; //Cpf do titular
		double saldo; //Valor do saldo ou limite
		do{//Menu principal
			System.out.println("O que deseja fazer?");
			System.out.println("1 - Criar conta");
			System.out.println("2 - Saldo conta");
			System.out.println("3 - Sacar");
			System.out.println("4 - Depositar");
			System.out.println("5- Dados da conta");
			System.out.println("0 - Finalizar");
			opcao = scan.nextInt(); //Escolha da oção
			switch(opcao){
				case 1://Caso seja a criação de conta
					System.out.println("Qual o tipo de conta deseja criar?");
					System.out.println("1 - Conta Especial");
					System.out.println("2 - Conta Poupança");
					num = scan.nextInt();
					
					switch(num){
						case 1: //Criando a conta especial
							System.out.println("Cadastrar Cliente:");
							System.out.println("Nome:");
							nome = scan.next();
							System.out.println("Cpf:");
							cpf = scan.next();

							cliente = new Cliente(nome, cpf);
							
							System.out.println("Cadastrar Conta:");
							System.out.println("Limite:");
							saldo = scan.nextDouble();
							System.out.println("Numero da conta: ");
							numeroConta = scan.nextInt();
							
							c = new ContaEspecial(numeroConta, cliente, saldo);
						break;
						case 2: //Criando a conta poupança
							System.out.println("Cadastrar Cliente:");
							System.out.println("Nome:");
							nome = scan.next();
							System.out.println("Cpf:");
							cpf = scan.next();

							cliente = new Cliente(nome, cpf);

							System.out.println("Cadastrar conta:");
							System.out.println("Numero da conta: ");
							numeroConta = scan.nextInt();

							c = new ContaPoupanca(numeroConta, cliente);
						break;
					}
					lista.add(c); //Adicionando a lista
				break;
				
				case 2: //Saldo da conta
					if(lista.size() > 0){
						System.out.println("Informe o numero de sua conta:");
						numeroConta = scan.nextInt(); //Para ler os dados da conta que será usado
						for(int k = 0; k<lista.size(); k++){
							Conta n = lista.get(k);
							if(n.numero == numeroConta){
								System.out.println("O saldo da conta eh: " + n.getSaldo());
								System.out.println();
								break;
							}
							if(k+1 == lista.size()){
								System.out.println("Numero de conta não existente");
								System.out.println();
								break;
							}
						} 
					}else{
						System.out.println("Lista de contas vazia");
						System.out.println();
					}
				break;

				case 3: //Sacar valor da conta
					if(lista.size() > 0){
						System.out.println("Informe o numero de sua conta:");
						numeroConta = scan.nextInt(); //Para ler os dados da conta que será usado
						for(int k = 0; k<lista.size(); k++){
							Conta n = lista.get(k);
							if(n.numero == numeroConta){
								System.out.println("Qual o valor pretente sacar?");
								saldo = scan.nextDouble();
								n.sacar(saldo);
								System.out.println("Voce sacou: " + saldo);
								System.out.println("Seu saldo atual: " + n.getSaldo());
								break;
							}
							if(k+1 == lista.size()){ //Caso o numero da conta seja invalido
								System.out.println("Numero de conta não existente");
								break;
							}
						}
					}else{
						System.out.println("Lista de contas vazia");
						System.out.println();
					}
				break;

				case 4: //Para depositar
					if(lista.size() > 0){
						System.out.println("Informe o numero de sua conta:");
						numeroConta = scan.nextInt(); //Para ler os dados da conta que será usado
						for(int k = 0; k<lista.size(); k++){ 
							Conta n = lista.get(k);
							if(n.numero == numeroConta){
								System.out.println("Qual o valor do deposito?");
								saldo = scan.nextDouble();
								n.depositar(saldo);
								System.out.println("Voce depositou: " + saldo);
								System.out.println("Seu saldo atual: " + n.getSaldo());
								break;
							}
							if(k+1 == lista.size()){ //Caso o numero da conta seja invalido
								System.out.println("Numero de conta não existente");
								break;
							}
						}
					}else{
						System.out.println("Lista de contas vazia");
						System.out.println();
					}
				break;

				case 5: //Para imprimir dados da conta
					if(lista.size() > 0){
						System.out.println("Informe o numero de sua conta:");
						numeroConta = scan.nextInt();
						for(int k = 0; k<lista.size(); k++){ 
							Conta n = lista.get(k);
							if(n.numero == numeroConta){
								System.out.println("Titular da conta:");
								System.out.println("Nome: " + n.titular.getNome());
								System.out.println("CPF: " + n.titular.getCpf());
								System.out.println();
								System.out.println("Dados conta:");
								System.out.println("Saldo: " + n.saldo);
								System.out.println();
								break;
							}
							if(k+1 == lista.size()){ //Caso o numero da conta seja invalido
								System.out.println("Conta não existente");
								break;
							}
						}
					}else{
						System.out.println("Lista de contas vazia");
						System.out.println();
					}
				break;
				default:
					if(opcao > 4 || opcao < 0){
						System.out.println("Opcao invalida");
					}
			}
		}while(opcao != 0);
	}
}    

