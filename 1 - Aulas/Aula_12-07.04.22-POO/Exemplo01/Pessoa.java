package Exemplo01;

public class Pessoa {

    private String nome;
    private int idade;
    private double altura;

    public void setNome(String nome) {
        if (nome.contains("#")) {

            System.out.println("Prodibido caracter #");
        }else{
        this.nome = nome;        
        }
    }

    public String getNome(){
        return nome;
    }

    public void setIdade(int idade) {
        if (idade <= 0) {
            System.out.println("Idade não pode ser negativa");
        }else{
        this.idade = idade;        
        }   
    }

    public int getIdade() {
        return idade;
    }

    public void setAltura(double altura){
        if (idade <= 0) {
            System.out.println("Altura não pode ser negativa");
        }else{
        this.altura = altura;
        }
    }
    
    public double getAltura() {
        return altura;        
    }
}
