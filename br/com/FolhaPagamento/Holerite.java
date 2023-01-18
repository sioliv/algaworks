package br.com.FolhaPagamento;

public class Holerite {

    Funcionario funcionario;
    double valorTotalHorasNormais;
    double valorTotalHorasExtras;
    double valorAdcionalFilhos;

    double calcularValorTotal(){

        return valorTotalHorasNormais + valorTotalHorasExtras + valorAdcionalFilhos;
    }

    void imprimir(){
        System.out.println("Holerite");
        System.out.println("--------");
        System.out.printf("Funcionario: %s%n",funcionario.nome );
        System.out.printf("Valor das horas normais: %.2f%n",valorTotalHorasNormais);
        System.out.printf("Valor das horas extras: %.2f%n", valorTotalHorasExtras);
        System.out.printf("Valor do adcional filhos %.2f%n", valorAdcionalFilhos);
        System.out.printf("Valor total do beneficio %.2f%n", calcularValorTotal());
    }

}
