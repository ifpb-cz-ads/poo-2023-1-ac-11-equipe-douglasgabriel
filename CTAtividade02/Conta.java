package CTAtividade02;

public abstract class Conta {
    protected int numero;
    protected Cliente titular;
    protected double saldo;

    public Conta(int numero, Cliente titular) {
        this.numero = numero;
        this.titular = titular;
        saldo = 0;
    }

    public Conta(int numero, Cliente titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Conta(int numero, String nomeTitular, String cpfTitular){
        this.numero = numero;
        this.titular = new Cliente(nomeTitular, cpfTitular);
        saldo = 0;
    }

    public void depositar(double valor){
        this.saldo = getSaldo() + valor;
    }

    public abstract boolean sacar(double valor);

    public void imprimirTipoConta(){
        System.out.println("Conta Comum");   
    }

    public double getSaldo(){
        return saldo;
    }
    public int getNumero(){
        return numero;
    }
    public Cliente getTitular(){
        return titular;
    } 
    public void setTitular(Cliente newTitular){
        this.titular = newTitular;
    }
}
