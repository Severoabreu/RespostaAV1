package Projeto02;

public class Conta {
    private String titular;
    private String numero;
    private double saldo;

    // Construtor
    public Conta(String titular, String numero, double  saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }
    // getters
    public String getTitular() {return titular;}
    public String getNumero() {return numero;}
    public double getSaldo() {return saldo;}\

    // setters
    public void setTitular(String titular) {this.titular = titular;}
    public void setNumero(String numero) {this.numero = numero;}
    public void setSaldo(double saldo) {this.saldo = saldo;}

    public void mostrarDados() {
        System.out.println("Nome do titular: " + titular);
        System.out.println("Número da conta: " + numero);
        System.out.println("Saldo: " + saldo);
    }

}