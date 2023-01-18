package br.com.FolhaPagamento;

public class ContratoTrabalho {

    Funcionario funcionario;
    double horaNormal;
    double horaExtra;

    //Se for verdadeiro, o funcionário possui filhos
    boolean possuiAdcionalFilhos(){
        return funcionario.possuiFilhos();
    }

}
