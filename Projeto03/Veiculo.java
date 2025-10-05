package Projeto03;

public class Veiculo {
    protected String placa;
    protected String marca;
    protected double precoVeiculo;

    // Construtor
    public Veiculo(String placa, String marca, double precoVeiculo) {
        this.placa = placa;
        this.marca = marca;
        this.precoVeiculo = precoVeiculo;
    }

    // Getters e Setters
    public String getPlaca() {return placa;}
    public String getMarca() {return marca;}
    public double getPrecoVeiculo() {return precoVeiculo;}


    public void setPlaca(String placa) {this.placa = placa;}
    public void setMarca(String marca) {this.marca = marca;}
    public void setPrecoVeiculo(double precoVeiculo) {this.precoVeiculo = precoVeiculo;}

    // Métodos para mostrar dados
    public void mostrarDados() {
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
        System.out.println("Preço do Veículo: R$ " + precoVeiculo);
    }
    // sobrecarga do método mostrarDados
    public void mostrarDados(double desconto) {
        mostrarDados();
        System.out.println("Desconto Aplicado: " + (desconto * 100) + "%");
        System.out.println("Preço com Desconto: R$ " + (precoVeiculo - (precoVeiculo * desconto)));
    }
}
