package AULA12_projeto_petshop.Servico;

import AULA12_projeto_petshop.Animal.Animal;

public abstract class Servico {
    protected String descricao;
    protected int minutos;

    public Servico(Animal a, String descricao, int minutos) {
        this.descricao = descricao;
        this.minutos = minutos;
    }

    public abstract double calcularCusto(Animal a);

    @Override
    public String toString() {
        return "Servico{" +
                "descricao='" + descricao + '\'' +
                ", minutos=" + minutos +
                '}';
    }
}
