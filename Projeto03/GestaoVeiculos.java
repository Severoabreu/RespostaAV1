package Projeto03;
import java.util.ArrayList;
import java.util.Scanner;

public class GestaoVeiculos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Veiculo> veiculos = new ArrayList<>();

        while (true) {
            System.out.println("Escolha o tipo de veículo para adicionar:");
            System.out.println("1. Carro");
            System.out.println("2. Moto");
            System.out.println("3. Caminhão");
            System.out.println("4. Sair e Mostrar Veículos");
            int escolha = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            if (escolha == 4) {
                break;
            }

            System.out.print("Placa: ");
            String placa = scanner.nextLine();
            System.out.print("Marca: ");
            String marca = scanner.nextLine();
            System.out.print("Preço do Veículo: ");
            double precoVeiculo = scanner.nextDouble();

            switch (escolha) {
                case 1:
                    System.out.print("Número de Portas: ");
                    int numeroPortas = scanner.nextInt();

                    veiculos.add(new Carro(placa, marca, precoVeiculo, numeroPortas));
                    break;
                case 2:
                    System.out.print("Cilindradas: ");
                    int cilindradas = scanner.nextInt();
                    veiculos.add(new Moto(placa, marca, precoVeiculo, cilindradas));
                    break;
                case 3:
                    System.out.print("Capacidade de Carga (Toneladas): ");
                    double capacidadeCarga = scanner.nextDouble();
                    veiculos.add(new Caminhao(placa, marca, precoVeiculo, capacidadeCarga));
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        // Mostrar todos os veículos cadastrados
        System.out.println("Veículos Cadastrados:");
        for (Veiculo veiculo : veiculos) {
            if (veiculo instanceof Carro){
                System.out.println("você quer ver o número de portas? (s/n)");
                String incluirPortas = scanner.nextLine();
                ((Carro) veiculo).mostrarDados(incluirPortas.equalsIgnoreCase("s"));
                
            } else if (veiculo instanceof Moto) {
                System.out.println("você quer ver as cilindradas? (s/n)");
                String incluirCilindradas = scanner.nextLine();
                ((Moto) veiculo).mostrarDados(incluirCilindradas.equalsIgnoreCase("s"));
                
            } else if (veiculo instanceof Caminhao) {
                System.out.println("você quer ver a capacidade em quilogramas? (s/n)");
                String incluirCapacidade = scanner.nextLine();
                ((Caminhao) veiculo).mostrarDados(incluirCapacidade.equalsIgnoreCase("s"));

            }

        }
        System.out.println("---Obrigado por utilizar nosso sistema de gestão de veículos! Foi um prazer ajudar! ---");
        scanner.close();
    }

    
    
}
