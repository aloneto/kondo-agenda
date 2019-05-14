package com.company;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        agenda contato0 = new agenda("jose", "rua 1", "04133333330");
        agenda contato1 = new agenda("joao", "rua 0", "04133333331");
        agenda contato2 = new agenda("maria", "rua 1", "04133333332");
        agenda contato3 = new agenda("tadeu", "rua 2", "04133333333");
        agenda contato4 = new agenda("jervasio", "rua 3", "04133333334");

        //contato0.imprime();

        // System.out.println(contato1.getNome());

        contato0.populaDict();
        contato1.populaDict();
        contato2.populaDict();
        contato3.populaDict();
        contato4.populaDict();



    }


}