import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    

    public String getNome() {
        return nome;
    }
    
    //Construtor
    public Banco(String nome) {
        this.nome = nome;
    
    }

    
    public static void listarContas(List<Conta> contas){


        contas.forEach(conta -> System.out.println("Número da conta: " + conta.getNumero() + ", Agência: " + conta.getAgencia() + ", Tipo de conta: " + conta.getTipoConta()));

    }

    public static long contarContas(List<Conta> contas){

        return contas.stream().count();
    }

}
