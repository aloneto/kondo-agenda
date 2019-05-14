package com.company;

import java.util.ArrayList;

public class agenda {
    protected String nome;
    protected String endereco;
    protected String telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public agenda(String nome, String end, String tel) {

        this.nome = nome;
        this.endereco = end;
        this.telefone = tel;

    }

    public void imprime() {
        System.out.println(this.nome + " mora na " + this.endereco + " cujo telefone é: " + this.telefone);

    }

    public void populaDict() {
        ArrayList lista = new ArrayList();
        lista.add(lista);
        System.out.println(lista.get(0));


        for (int i = 0; i <= (lista.size()); i++) {
            //System.out.println(i);

        }
    }

}