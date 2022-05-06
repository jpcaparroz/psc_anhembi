package Exercicio02;

public class CelularPrePago {

    public static final double custo = 0.75;

    private String nomeCliente;
    private String numTel;
    private double saldo;
 
    
    public CelularPrePago(String nomeCliente, String numTel) {
        
        if (nomeCliente != null && nomeCliente.length() > 4) {
            this.nomeCliente = nomeCliente;
        } else {
            this.nomeCliente = "????";
        }
        
        if (numTel != null && numTel.length() > 4) {

            this.numTel = numTel; 
        } else {
            this.numTel = "???";
        }
        
    }

    public CelularPrePago(String nomeCliente, String numTel, double saldo) {

        this.nomeCliente = nomeCliente;
        this.numTel = numTel; 
        this.saldo = saldo;       
    }

    public void fazerLigacao() {

        if (saldo < custo) {
            
            System.out.println("Sr(a). " + nomeCliente + " do número " + numTel);
            System.out.println("Você não possui saldo suficiente =(");
            
        } else {

            saldo = saldo - custo;

            System.out.println("Ligação realizada com sucesso!");
            System.out.println("Saldo atual R$" + saldo);
        }
    }

    public void recarregar(double recarga) {

        if (recarga < 0) {

            System.out.println("Impossível recarregar um valor negativo.");
            
        } else {

            saldo = saldo + recarga;
            System.out.println("Sr(a). " + nomeCliente);
            System.out.println("Recarga realizada com sucesso!");
            System.out.println("Saldo atual R$" + saldo);
        } 
    }
    
    public String exibir() {

        String dados = "Nome do Cliente: " + nomeCliente + " | " + "Número do Telefone: " + numTel + " | " + "Saldo: R$" + saldo;

        return dados;
    }
}
