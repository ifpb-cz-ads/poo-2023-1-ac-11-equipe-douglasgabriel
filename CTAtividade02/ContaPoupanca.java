package CTAtividade02;

public class ContaPoupanca extends Conta implements Investimento{

    public ContaPoupanca(int numero, String nomeTitular, String cpfTitular){ //Constructor sem usar a class Cliente
        super(numero, nomeTitular, cpfTitular);
    }

    public ContaPoupanca(int numero, Cliente titular) { //Constructor usando a class Cliente
        super(numero, titular);
    }

    @Override
    public void imprimirTipoConta(){
        System.out.println("Conta Poupança");
    }

    @Override
    public boolean sacar(double valor){
        if(this.getSaldo() >= valor){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    //Instanciando o metodo reajustar da interface Investimento 
    @Override
    public void reajustar(double valor) {
        saldo = saldo + saldo * valor;
    }
}
