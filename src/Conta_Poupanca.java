public class Conta_Poupanca extends Conta {

    public String tipoConta = "Conta poupança";

    public String getTipoConta() {
        return tipoConta;
    }

    public Conta_Poupanca(Cliente cliente, Banco banco) {
        super(cliente, banco);
    }

    @Override
    public void imprimirExtrato(){

        System.out.println("Extrato Conta Poupança");
        ImprimirInfosComuns();
    }

}
