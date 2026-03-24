package AULA07_exercicioGeral;

import java.time.Duration;
import java.time.LocalTime;

public class Registro {
    Veiculo veiculo;
    String inicioStr;
    String fimStr;

    public Registro(Veiculo veiculo, String inicioStr) {
        this.veiculo = veiculo;
        this.inicioStr = inicioStr;


    }
    public long calcularValor(){
        LocalTime inicio = LocalTime.parse(inicioStr);
        LocalTime fim = LocalTime.parse(fimStr);
        return Duration.between(inicio, fim).toMinutes();

    }

}