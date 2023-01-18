package br.com.FolhaPagamento;

public class FolhaPagamento {

    Holerite calcularSalario(double qtdHorasNormaisTrabalhadas, double qtdHorasExtrasTrabalhadas,
                           ContratoTrabalho contratoTrabalho){

        Holerite holerite = new Holerite();
        holerite.funcionario = contratoTrabalho.funcionario;
        holerite.valorTotalHorasExtras = qtdHorasExtrasTrabalhadas * contratoTrabalho.horaExtra;
        holerite.valorTotalHorasNormais = qtdHorasNormaisTrabalhadas * contratoTrabalho.horaNormal;

        double calcParcial = holerite.valorTotalHorasExtras + holerite.valorTotalHorasNormais ;

        if(contratoTrabalho.possuiAdcionalFilhos()){
            holerite.valorAdcionalFilhos = calcParcial * 0.10;
        }

        return holerite;

    }

}
