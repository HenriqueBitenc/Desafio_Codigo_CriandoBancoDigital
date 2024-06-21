public class Cliente {

    private String nome;
    private int numeroConta;
    private int numeroAgencia;
    private double saldo;
    
    public String getNome() {
        return nome;
    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public double getSaldo() {
        return saldo;
    }
}
