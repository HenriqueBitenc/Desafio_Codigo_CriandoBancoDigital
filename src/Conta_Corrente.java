public class Conta_Corrente extends Conta {

    public String tipoConta = "Conta corrente";


    public String getTipoConta() {
        return tipoConta;
    }

    public Conta_Corrente(Cliente cliente, Banco banco) {
        super(cliente, banco);
        
    }

    @Override
    public void imprimirExtrato(){

        System.out.println("Extrato Conta Corrente");
        ImprimirInfosComuns();
    }

}
