package com.mycompany.aula0409;
import java.util.ArrayList;
public class Loja {
    String nome;
    String endereco;
    ArrayList<Produto> produtos = new ArrayList<>();
    public Loja(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }
    public void adicionarProduto(Produto produto){
        this.produtos.add(produto);
    }
    public void listarProdutos(){
        System.out.println("Descricao\t\tPreco");
        for(int i=0; i<this.produtos.size(); i++){
            Produto produto = this.produtos.get(i); //só i
            System.out.print(produto.nome+"\t\t");
            System.out.println(produto.preco);
        }
    }
    public void venderProduto(String nome){
        for(int i=0; i<this.produtos.size(); i++){   
            Produto produto = this.produtos.get(i);
            if (produto.nome.equals(nome)){
                boolean removeu = this.produtos.remove(produto);
                if(removeu){
                    System.out.println("Produto removido");
                }
            }
        }     
    }
    
}
