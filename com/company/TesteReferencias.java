package com.company;

public class TesteReferencias {

    public static void main(String[] args) {
        Proprietario pessoa1 = new Proprietario();
        pessoa1.nome = "João";

        Proprietario pessoa2 = new Proprietario();
        pessoa2.nome = "Maria";




        Carro meuCarro = new Carro();
        meuCarro.modelo = "HR-V";
        meuCarro.proprietario = pessoa1;

        meuCarro.proprietario.nome = "Sebasatiao";

        Carro seuCarro = new Carro();
        seuCarro.modelo = "X6";
        seuCarro.proprietario = pessoa1;

        System.out.println(meuCarro.proprietario.nome);
        System.out.println(seuCarro.proprietario.nome);

        meuCarro.proprietario.nome = "Maria";
        System.out.println(pessoa1.nome);


    }
}
