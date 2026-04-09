package br.fiap.carga;

import br.fiap.cliente.Cliente;

import java.util.Random;

public class Carga {
    Random r = new Random();
    int id;
    String destino;
    double peso;
    Cliente cliente;

    public Carga( String destino, Cliente cliente) {
        this.id = r.nextInt(10, 90);
        this.destino = destino;
        this.peso = r.nextDouble(1000, 50000);
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public String getDestino() {
        return destino;
    }

    public double getPeso() {
        return peso;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
