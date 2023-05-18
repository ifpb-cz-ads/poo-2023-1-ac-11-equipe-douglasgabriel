package CTAtividade02;

public class ContaEspecial extends Conta{
    private double limite;

    public ContaEspecial(int numero, String nomeTitular, String cpfTitular, double limite){ //Constructor sem usar a class Cliente
        super(numero, nomeTitular, cpfTitular);
        this.limite = limite;
    }

    public ContaEspecial(int numero, Cliente titular, double limite){ //Constructor usando a class Cliente
        super(numero, titular, limite);
        this.limite = limite;
    }

    public double getLimite(){
        return limite;
    }

    public void setLimite(double newLimite){
        this.limite = newLimite;
    }

    @Override
    public boolean sacar (double valor){
        if(valor <= this.limite + this.saldo){
            this.saldo -= valor;
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public void imprimirTipoConta(){
        System.out.println("Conta Especial");
    }
}
