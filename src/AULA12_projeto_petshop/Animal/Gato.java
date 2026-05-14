package AULA12_projeto_petshop.Animal;

public class Gato extends Animal {
    private char pelagem;

    public Gato(String nome, Double peso, char pelagem) {
        super(nome, peso);
        this.pelagem = pelagem;
    }


    public double calcularPrecoBase() {
        double precoBase = 0;

        if (pelagem == 'C'){
            precoBase = 45;
        }else if (pelagem == 'L'){
            precoBase = 65;
        }
        
        return precoBase;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
