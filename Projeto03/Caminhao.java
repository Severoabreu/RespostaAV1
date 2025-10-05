package Projeto03;

public class Caminhao extends Veiculo {
    private double capacidadeCarga;

    // Construtor
    public Caminhao(String placa, String marca, double precoVeiculo, double capacidadeCarga) {
        super(placa, marca, precoVeiculo);
        this.capacidadeCarga = capacidadeCarga;
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Capacidade de Carga: " + String.format("%.2f", capacidadeCarga) + " Toneladas");
    }

    public void mostrarDados(boolean emQuilogramas) {
        super.mostrarDados();
        if (emQuilogramas) {
            double quilogramas = capacidadeCarga * 1000.0;
            System.out.println("Capacidade de Carga: " + String.format("%.2f", quilogramas) + " Quilogramas");
        } else {
            System.out.println("Capacidade de Carga: " + String.format("%.2f", capacidadeCarga) + " Toneladas");
        }
    }
    
}
