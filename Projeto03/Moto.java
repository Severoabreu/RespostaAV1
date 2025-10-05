package Projeto03;

public class Moto extends Veiculo {
    private int cilindradas;


    public Moto(String placa, String marca, double precoVeiculo, int cilindradas) {
        super(placa, marca, precoVeiculo);
        this.cilindradas = cilindradas;
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println( "Cilindradas: " + cilindradas );
    }
    public void mostrarDados(boolean emCavalos) {
        super.mostrarDados();
        if (emCavalos) {
            double cavalos = cilindradas / 10.0;
            System.out.println("Potência: " + String.format("%.1f", cavalos) + " CV (Cavalos de potência)");
        } else {
            System.out.println("Cilindradas: " + cilindradas);
        }
    }

    
}
