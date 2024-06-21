import java.util.List;

public class Teste {

    public static void main(String[] args) {

        List<Conta> allContas = Conta.contas;
   
       Cliente cliente1 = new Cliente("Cliente1");
       Cliente cliente2 = new Cliente("Cliente2");
       Cliente cliente3 = new Cliente("Cliente3");
       Cliente cliente4 = new Cliente("Cliente4");
       Cliente cliente5 = new Cliente("Cliente5");

       Banco banco1 = new Banco("BancoBB");
       

       Conta cc1 = new Conta_Corrente(cliente1, banco1);
       Conta cp1 = new Conta_Poupanca(cliente1, banco1);

       Conta cc2 = new Conta_Corrente(cliente2, banco1);
       Conta cp2 = new Conta_Poupanca(cliente2, banco1);

       Conta cc3 = new Conta_Corrente(cliente3, banco1);
       Conta cp3 = new Conta_Poupanca(cliente3, banco1);

       Conta cc4 = new Conta_Corrente(cliente4, banco1);
       Conta cp4 = new Conta_Poupanca(cliente4, banco1);

       Conta cc5 = new Conta_Corrente(cliente5, banco1);
       Conta cp5 = new Conta_Poupanca(cliente5, banco1);
       

    banco1.listarContas(allContas);

   cc5.imprimirExtrato();
    }

}
