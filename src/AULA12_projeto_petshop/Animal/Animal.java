package AULA12_projeto_petshop.Animal;

public abstract class Animal {
    protected String nome;
    protected Double peso;

    public Animal(String nome, Double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public abstract double calcularPrecoBase();

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", peso=" + peso +
                '}';
    }
}
