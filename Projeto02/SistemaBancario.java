package Projeto02;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class SistemaBancario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        List<Conta> contas = new ArrayList<>();

        System.out.println("===== SISTEMA DE CADASTRO DE CONTAS BACÁRIAS ====");
        
        while (true) {
            System.out.println("\n --- Opcões ---");
            System.out.println("1. Conta Corrente");
            System.out.println("2. Conta Poupança");
            System.out.println("3. Conta Investimento");
            System.out.println("0. Encerrar Cadastro e Mostrar Dados");
            System.out.println("Escolha uma opção: ");

            int escolha = scanner.nextInt();
            scanner.nextLine();

            if(escolha == 0) {
                break;
            }

            if (escolha < 1 || escolha > 3) {
                System.out.println("Opção inválida. Tente novamente.");
                continue;
                
            
            }

            System.out.println("Número da Conta: ");
            String numero = scanner.nextLine();

            System.out.println("Nome do Titular: ");
            String titular = scanner.nextLine();

            System.out.println("Saldo Inicial: R$ ");
            double saldo = scanner.nextDouble();
            scanner.nextLine(); 

            Conta novaConta = null;

            switch (escolha) {
                case 1:
                    System.out.println("Limite de Crédito especial: R$ ");
                    double limiteCredito = scanner.nextDouble();
                    scanner.nextLine(); 
                    novaConta = new ContaCorrente(titular, numero, saldo, limiteCredito);
                    break;
                case 2:
                    System.out.println("Taxa de Rendimento (% ao mês): ");
                    double taxaRendimento = scanner.nextDouble();
                    scanner.nextLine(); 
                    novaConta = new ContaPoupanca(titular, numero, saldo, taxaRendimento);
                    break;
                case 3:
                    System.out.println("Taxa de Administração (% ao mês): ");
                    double taxaAdministracao = scanner.nextDouble();
                    scanner.nextLine(); 
                    novaConta = new ContaInvestimento(titular, numero, saldo, taxaAdministracao);
                    break;
            }
            if  (novaConta != null) {
                contas.add(novaConta);
                System.out.println("Conta criada com sucesso!");
            }

        }
        
        
        System.out.println("\n===== DADOS DAS CONTAS CADASTRADAS =====");
        for (Conta conta : contas) {
            
            System.out.println("\n------------------------------------------------");
            
            
            if (conta instanceof ContaCorrente) {
                
                ContaCorrente cc = (ContaCorrente) conta;
                System.out.println("TIPO: CONTA CORRENTE");
                System.out.print("Deseja detalhar o Limite/Saldo Total? (S/N): ");
                String escolhaDetalhe = scanner.nextLine();
                
                cc.mostrarDados(escolhaDetalhe.equalsIgnoreCase("S")); 

            } else if (conta instanceof ContaPoupanca) {
                
                ContaPoupanca cp = (ContaPoupanca) conta;
                System.out.println("TIPO: CONTA POUPANÇA");
                System.out.print("Deseja ver a Taxa ANUAL? (S/N): ");
                String escolhaAnual = scanner.nextLine();
                
                cp.mostrarDados(escolhaAnual.equalsIgnoreCase("S")); 

            } else if (conta instanceof ContaInvestimento) {
                
                ContaInvestimento ci = (ContaInvestimento) conta;
                System.out.println("TIPO: CONTA INVESTIMENTO");
                System.out.print("Deseja ver o Saldo Líquido Projetado? (S/N): ");
                String escolhaLiquido = scanner.nextLine();
                
                ci.mostrarDados(escolhaLiquido.equalsIgnoreCase("S"));
            }
        }
        
        System.out.println("\nSistema encerrado. Obrigado por utilizar nossos serviços!");
        
        scanner.close();
    }
    
}
