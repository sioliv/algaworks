package br.com.FolhaPagamento;


public class Main {

    public static void main(String[] args) {

        FolhaPagamento folhaPagamento = new FolhaPagamento();
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "João das couves";
        funcionario.quantidadeFilhos = 2;

        ContratoTrabalho contratoTrabalho = new ContratoTrabalho();
        contratoTrabalho.horaExtra = 10;
        contratoTrabalho.horaNormal = 10;
        contratoTrabalho.funcionario = funcionario;

        Holerite  holerite = folhaPagamento.calcularSalario(10, 10, contratoTrabalho);
        holerite.imprimir();



    }
}
