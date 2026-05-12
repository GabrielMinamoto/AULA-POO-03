package AULA12_projeto_petshop.Cachorro;

import AULA12_projeto_petshop.Animal.Animal;

public class Cachorro extends Animal {

    public Cachorro(String nome, Double peso) {
        super(nome, peso);
    }

    public double calcularPrecoBase(){
        double precoBase;

        if (peso <= 10){
            precoBase = 40;
        } else if (peso <=25) {
            precoBase = 60;
        }else {
            precoBase = 85;
        }

        return precoBase;
    }

    public String toString() {
        return super.toString();
    }
}
