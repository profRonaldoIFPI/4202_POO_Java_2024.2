package com.mycompany.aula2808;
public class ContaBancaria {
    String titular;
    float saldo;
    public ContaBancaria(String titular, float saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
    public void sacar(float valor){
        if (valor <= this.saldo){
            this.saldo -= valor;
            System.out.println("Saque realizado.");
            System.out.println("Seu novo saldo é R$"+this.saldo);
        }else{
            System.out.println("Saldo insuficiente. Seu liso!");
        }
    }
    public void depositar(float valor){
        this.saldo += valor;
        System.out.println("Você depositou R$"+valor);
        System.out.println("Seu novo saldo é R$"+this.saldo);
    }
}
