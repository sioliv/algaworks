package com.company;

public class Principal {

    public static void main(String[] args) {

       Carro meuCarro = new Carro();

       meuCarro.anoFabricacao = 1980;
       meuCarro.cor = "Preto";
       meuCarro.fabricante = "Honda";
       meuCarro.modelo = "HR-V";
       meuCarro.precoCompra = 0;

       Proprietario eu = new Proprietario();
       eu.nome = "Thiago Faria";
       eu.cpf = "111.222.333-44";
       eu.anoNascimento = 1988;
       meuCarro.proprietario = eu;

        System.out.println();

        Carro seuCarro = new Carro();

        seuCarro.anoFabricacao = 2022;
        seuCarro.fabricante = "bmw";
        seuCarro.modelo = "X6";
        seuCarro.precoCompra = 980000;
        seuCarro.cor = "Branco";

        Proprietario voce = new Proprietario();
        voce.nome =  "João Das Couves";
        voce.cpf = "111.222.222.222-88";
        voce.anoNascimento = 1990;
        seuCarro.proprietario = voce;

        double calcularIpva = meuCarro.calcularIpva();

        meuCarro.imprimirResumoDepreciacao();
        seuCarro.imprimirResumoDepreciacao();

        System.out.println("Calculando valor revenda: " +meuCarro.calcularIpva());

      /*  double valorRevendaMeuCarro =  meuCarro.calcularValorRevenda();
        int anoFabricacaoMeuCarro =  meuCarro.calcularTempoUsoEmAnos();

        System.out.printf("Tempo de uso (anos): %d%n", anoFabricacaoMeuCarro);

        System.out.printf("Valor de Revenda:%6.2f%n", valorRevendaMeuCarro);
*/
       //seuCarro.calcularValorRevenda();



      /* System.out.println("Meu carro");
       System.out.println("----------");
       System.out.printf("Modelo: %s%n", meuCarro.modelo);
       System.out.printf("Ano: %d%n", meuCarro.anoFabricacao);
       System.out.printf(" Proprietario: %s%n",meuCarro.proprietario.nome );
*/



//        System.out.println("Seu carro");
//        System.out.println("----------");
//        System.out.printf("Modelo: %s%n", seuCarro.modelo);
//        System.out.printf("Ano: %d%n", seuCarro.anoFabricacao);
//        System.out.printf("Cor: %s%n", seuCarro.cor);
//        System.out.printf(" Proprietario: %s%n",seuCarro.proprietario.nome );




    }
}
