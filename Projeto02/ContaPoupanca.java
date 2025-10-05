package Projeto02;

public class ContaPoupanca extends Conta{
    private double TaxaRendimento;

    // construtor
    public ContaPoupanca(String titular, String numero, double saldo, double TaxaRendimento){
        super(titular, numero, saldo);
        this.TaxaRendimento = TaxaRendimento;
    }

    public double getTaxaRendimento() {
        return TaxaRendimento;
    }

    public void setTaxaAdministracao(double TaxaRendimento) {
        this.TaxaRendimento = TaxaRendimento;
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("A taxa de rendimento mensal é: " + this.TaxaRendimento + "%");

    }

    public void mostrarDados(boolean TaxaAnual) {
        if(TaxaAnual) {
            super.mostrarDados();
            System.out.println("A sua taxa anual é: " + (12 * this.TaxaRendimento) + "%");
        } else {
            mostrarDados();
        }
    }


    
}
