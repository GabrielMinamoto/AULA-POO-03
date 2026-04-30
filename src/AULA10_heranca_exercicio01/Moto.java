package AULA10_heranca_exercicio01;

public class Moto extends Veiculo{
    private int cilindradas;

    public Moto(int placa, String modelo, int cilindradas) {
        super(placa, modelo);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public String toString() {
        return super.toString() + "Cilindradas: " + this.cilindradas;
    }
}
