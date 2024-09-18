package com.mycompany.aula1109;
public class Pessoa {
    String nome;
    private String cpf; //encapsulado
    
    public void set_cpf(String cpf){
        if (cpf.length()==11){
            this.cpf = cpf;
        }else{
            System.out.println("CPF invalido.");
        }
    }
    public String get_cpf(){
        return this.cpf;
    }
}
