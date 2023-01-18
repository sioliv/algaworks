package br.com.FolhaPagamento;

public class Funcionario {

    String nome;
    int quantidadeFilhos;

    boolean possuiFilhos(){
        return quantidadeFilhos > 1;
    }

}
