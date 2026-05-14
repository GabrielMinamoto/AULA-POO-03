package AULA12_projeto_petshop.Animal;

import AULA12_projeto_petshop.Servico.Servico;

public class Atendimento {
    private Animal animal;
    private Servico servico;

    public Atendimento(Servico servico, Animal animal) {
        this.servico = servico;
        this.animal = animal;
    }
}
