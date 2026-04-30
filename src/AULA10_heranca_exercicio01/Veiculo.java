package AULA10_heranca_exercicio01;

public abstract class Veiculo{

    private int placa;
    private String modelo;

    public Veiculo(int placa, String modelo) {
        this.placa = placa;
        this.modelo = modelo;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Placa: " + placa + "\nMarca: " + modelo;
    }
}
