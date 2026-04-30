package AULA10_heranca_exercicio01;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Veiculo> lista = new ArrayList<>();

        lista.add(new Carro(12, "Mercedes", 2));
        lista.add(new Carro(30, "Uno", 4));
        lista.add(new Moto(100,"Kawasaki", 350));

        for (Veiculo veiculo : lista){
            System.out.println(veiculo);
            System.out.println("-----------");
        }


    }
}
