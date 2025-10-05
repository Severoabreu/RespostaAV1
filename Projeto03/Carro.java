package Projeto03;

public class Carro extends Veiculo {
    private int numeroPortas;

    // Construtor
    public Carro(String placa, String marca, double precoVeiculo, int numeroPortas) {
        super(placa, marca, precoVeiculo);
        this.numeroPortas = numeroPortas;
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Número de Portas: " + numeroPortas);
    }

    public void mostrarDados(boolean incluirPortas) {
        super.mostrarDados();
        if (incluirPortas) {
            System.out.println("Número de Portas: " + numeroPortas);
        }
    }


}
