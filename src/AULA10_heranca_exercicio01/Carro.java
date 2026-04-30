package AULA10_heranca_exercicio01;

public class Carro extends Veiculo{
    private int numPortas;

    public Carro(int placa, String modelo, int numPortas) {
        super(placa, modelo);
        this.numPortas = numPortas;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    @Override
    public String toString() {
        return super.toString() + "NUMERO DE PORTAS: " + this.numPortas;

    }
}
