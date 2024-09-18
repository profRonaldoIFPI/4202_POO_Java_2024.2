package com.mycompany.aula0409;
public class Aula0409 {
    public static void main(String[] args) {
        Loja minhaLoja = new Loja("Bugingangas.com","Mercado");
        
        Produto produto1 = new Produto("iWach",180);
        Produto produto2 = new Produto("Cx JBL",90);
        minhaLoja.adicionarProduto(produto1);
        minhaLoja.adicionarProduto(produto2);
        minhaLoja.adicionarProduto(new Produto("Vassoura",15));
        
        minhaLoja.listarProdutos();
    }
}
