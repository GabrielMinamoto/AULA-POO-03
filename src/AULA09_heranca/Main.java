package AULA09_heranca;

public class Main {

    public static void main(String[] args) {

        Empregado [] vetor = new Empregado[4];

        vetor[0] = new EmpregadoComissionado(1111, "Kenny", 1,0.20);
        vetor[1] = new EmpregadoHorista(2222,"Kenny", 20, 200);
        vetor[2] = new EmpregadoComissionado(3333, "Lucas", 12,0.60);
        vetor[3] = new EmpregadoHorista(4444,"Roberto", 120, 550);


//        for generico
//        nao controla mais posição, só acessa os objetos que estão no vetor
        System.out.println("####################");
        for(Empregado e : vetor){

            System.out.println(e.matricula);
            System.out.println(e.nome);
            System.out.println(e.calcularSalario());
            System.out.println("-------------------");
        }
    }
}
