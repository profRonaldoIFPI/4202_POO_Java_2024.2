package com.mycompany.aula2808;
public class Aula2808 {
    public static void main(String[] args) {
        ContaBancaria cc = new ContaBancaria("Ronaldo", 500); 
        System.out.println(cc.saldo);
        cc.depositar(122);
        cc.sacar(100);
        cc.sacar(700);

//        Carro hb20 = new Carro("Hyunday","HB20",2018,"preto");;
//        System.out.println(hb20.marca);
//        Carro gol = new Carro("VW","Gol",2021,"branco");
//        System.out.println(gol.marca);
    }
}
