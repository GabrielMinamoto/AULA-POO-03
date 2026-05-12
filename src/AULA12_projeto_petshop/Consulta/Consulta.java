package AULA12_projeto_petshop.Consulta;

import AULA12_projeto_petshop.Animal.Animal;
import AULA12_projeto_petshop.Servico.Servico;

public class Consulta extends Servico {

    public Consulta(Animal a, String descricao, int minutos) {
        super(a, descricao, minutos);
    }


    public double calcularCusto(Animal a) {
        double custo;

        custo = a.calcularPrecoBase() + 35.00;

        return custo;
    }


}
