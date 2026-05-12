package AULA12_projeto_petshop.Banho;

import AULA12_projeto_petshop.Animal.Animal;
import AULA12_projeto_petshop.Servico.Servico;

public class Banho extends Servico {

    public Banho(Animal a, String descricao, int minutos) {
        super(a, descricao, minutos);
    }


    public double calcularCusto(Animal a) {
        double custo;

        custo =  a.calcularPrecoBase() + ( minutos * 0.5);

        return custo;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
