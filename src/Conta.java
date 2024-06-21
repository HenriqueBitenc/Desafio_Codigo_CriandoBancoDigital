import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements IConta {

    protected int numero;
    protected int agencia;
    protected Banco banco;
    protected String tipoConta;
    
    public String getTipoConta() {
        return tipoConta;
    }

    public static List <Conta> contas = new ArrayList<>();

    public Banco getBanco() {
        return banco;
    }

    protected Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public Conta(Cliente cliente, Banco banco) {
        this.numero = SEQUENCIAL++;
        this.agencia = AGENCIA_PADRAO;
        this.banco = banco;
        this.cliente = cliente;
        adicionarConta(this);
    }

    protected double saldo;

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    
    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {

        saldo -= valor;
       
    }

    @Override
    public void depositar(double valor) {

        saldo += valor;

    }
        
    @Override
    public void transferir(double valor, Conta conta) {

        this.sacar(valor);
        conta.depositar(valor);
       
    }

    protected void ImprimirInfosComuns() {
        System.out.println(String.format("Titular : %s",this.cliente.getNome()));
        System.out.println(String.format("Banco : %s",this.banco.getNome()));
        System.out.println(String.format("Agencia : %d",this.agencia));
        System.out.println(String.format("Conta : %d",this.numero));
        System.out.println(String.format("Saldo : %.2f",this.saldo));
    }

    public static void adicionarConta(Conta conta){

       contas.add(conta);
    }  

}
