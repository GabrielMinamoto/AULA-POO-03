package AULA08_exemploAplicacao;

public class Paciente {
    private String nome;
    private double altura;

    public Paciente(String nome, double altura) {
        this.nome = nome;
        this.altura = altura;
    }

//    por padrao deixar no nome sua funcao
//    acessar o atributo e retornar
    public String getNome() {
        return nome;
    }

//    alterar o atributo
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
