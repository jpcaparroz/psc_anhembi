/*
Exercício 24
• Dado o cardápio de uma
lanchonete:

Código      Produto             Preço
100         Chachorro Quente    R$ 1,20
101         Bauru Simples       R$ 1,30
102         Bauru com ovo       R$ 1,50
103         Hambúrguer          R$ 1,20
104         Cheeseburguer       R$ 1,30
105         Refrigerante        R$ 1,00

• Faça um algoritmo que:
– leia o código do produto e a quantidade;
– calcule o valor a ser pago pelo cliente;
– imprimir o valor a ser pago;
– imprimir o nome do produto.
*/

import java.util.Scanner;

public class Exerc24 {
    public static void main(String[] args) {

        String verCardapio, verificar;
        int codigoProduto, quantidade;
        double carrinho = 0.00;
         
        Scanner scanner = new Scanner(System.in);

        linha();
        System.out.println("Bem-vindo a lanchonete!");
        linha();

        System.out.println("Voce deseja consultar o cardapio? (sim / nao)");
        verCardapio = scanner.nextLine();

        if (verCardapio.equals("sim")) {
            
            exibirCardapio();
        }

        linha();

        System.out.println("Qual seria o seu pedido?");

        do {
        System.out.println("Digite o codigo do produto:");
        codigoProduto = scanner.nextInt();
        codigoProduto = codigoProduto - 100;

        System.out.println("Quantas unidades?");
        quantidade = scanner.nextInt();
        
        carrinho = carrinho + (cardapioPreco(codigoProduto) * quantidade);

        System.out.println("Deseja adicionar mais produto? (sim / nao)");
        verificar = scanner.next();

        if (verificar.equals("nao")) {break;}

        } while (verificar.equals("sim"));

        System.out.println(carrinho);

        scanner.close();
    }

    public static double cardapioPreco(int pos) {

        double[] preco = new double[6];

        preco[0] = 1.20;
        preco[1] = 1.30;
        preco[2] = 1.50;
        preco[3] = 1.20;
        preco[4] = 1.30;
        preco[5] = 1.00;


        return preco[pos];
    }

    public static String cardapioProduto(int pos) {

        String[] produto = new String[6];
        
        produto[0] = "Chachorro Quente";
        produto[1] = "Bauru Simples";
        produto[2] = "Bauru com ovo";
        produto[3] = "Hambúrguer";
        produto[4] = "Cheeseburguer";
        produto[5] = "Refrigerante";

        return produto[pos];
    }

    public static void exibirCardapio() {
        
        System.out.println("Código      Produto             Preço");
        System.out.println("100         Chachorro Quente    R$ 1,20");
        System.out.println("101         Bauru Simples       R$ 1,30");
        System.out.println("102         Bauru com ovo       R$ 1,50");
        System.out.println("103         Hambúrguer          R$ 1,20");
        System.out.println("104         Cheeseburguer       R$ 1,30");
        System.out.println("105         Refrigerante        R$ 1,00");

        return;
    }

    public static void linha() {

        System.out.println("*******************************************");
        
        return;
    }
    
}
