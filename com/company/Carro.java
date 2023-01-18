package com.company;

public class Carro {

    //Definindo a estrutura do tipo carro.

    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
    double precoCompra;
    Proprietario proprietario = new Proprietario();

    void imprimirResumoDepreciacao(){

        double valorRevendaMeuCarro =  calcularValorRevenda();
        int anoFabricacaoMeuCarro =  calcularTempoUsoEmAnos();

        if(precoCompra <= 0){
            System.out.println("Carro com preço de compra zerado. " +
                    "Não foi possível imprimir resumo de depreciação");
            return;
        }

        System.out.printf("Tempo de uso (anos): %d%n", anoFabricacaoMeuCarro);

        System.out.printf("Valor de Revenda:%6.2f%n", valorRevendaMeuCarro);
    }


    double calcularValorRevenda() {

        int tempoDeUsoEmAnos = calcularTempoUsoEmAnos();
        int vidaUtilEmAnos = 20;
        double valorRevenda = (precoCompra / vidaUtilEmAnos) * (vidaUtilEmAnos - tempoDeUsoEmAnos);

        if(valorRevenda < 0){
            valorRevenda = 0;
        }

        return valorRevenda;
    }

    //deprecia em 20 anos. //Saber tempo de uso do carro
    int calcularTempoUsoEmAnos(){
         return  2022 - anoFabricacao;
    }

    double calcularIpva(){

        int tempoDeUsoAnos = calcularTempoUsoEmAnos();

        if(tempoDeUsoAnos  >= 10) {
            return 0;
        }

        return calcularValorRevenda() * 0.04;
    }

}
