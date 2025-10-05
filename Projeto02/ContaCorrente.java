package Projeto02;

public class ContaCorrente  extends Conta{
    private double limiteEspecial;

    // construtor
    public ContaCorrente(String titular, String numero, Double saldo, double limiteEspecial) {
        super(titular, numero, saldo);
        this.limiteEspecial = limiteEspecial;
    }
    // getters
    public double getLimiteEspecial() {return limiteEspecial;}
    // setters
    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }


    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Limite Especial: " + limiteEspecial);
    }
    

}
