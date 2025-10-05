package Projeto02;

public class ContaInvestimento extends Conta {
    private double TaxaAdministracao;

    // construtor

    public ContaInvestimento( String titular, String numero, double saldo, double TaxaAdministracao) {
        super(titular, numero, saldo);
        this.TaxaAdministracao = TaxaAdministracao;
    }

    public double getTaxaAdminstracao() {
        return TaxaAdministracao;
    }

    public void setTaxaAdministracao(double TaxaAdministracao) {
        this.TaxaAdministracao = TaxaAdministracao;
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("A taxa de administração custa: " + this.TaxaAdministracao + "%");
    }
    public void mostrarDados(boolean ConsiderarTaxa) {
        if(ConsiderarTaxa) {
            super.mostrarDados();
            double saldoProcessado = getSaldo() * (5/100.0);
            double ValordaTaxa = saldoProcessado * (TaxaAdministracao / 100.0);
            double rendimento = saldoProcessado - ValordaTaxa;
            double  SaldoFinal = getSaldo() + rendimento;
            System.out.println("O valor do rendimento é: R$" + String.format( "%.2f", rendimento));
            System.out.println("O valor da taxa é: R$" + String.format( "%.2f", ValordaTaxa));
            System.out.println("Seu saldo inicial era: R$" + String.format( "%.2f", getSaldo()));
            System.out.println("Saldo final projetado após a taxa: R$" + String.format( "%.2f", SaldoFinal));

        }else {
            super.mostrarDados();
        }
    }

    
}
