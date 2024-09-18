package com.mycompany.aula1109;
public class Aula1109 {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa();
        p1.nome = "Ronaldo";
        p1.set_cpf("12345678910");
        System.out.println(p1.get_cpf());
    }
}
