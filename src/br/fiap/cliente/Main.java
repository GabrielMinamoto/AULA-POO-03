package br.fiap.cliente;

public class Main {
    public static void main(String[] args) {
        Cliente c = new Cliente(1, "Kenny");
        System.out.println(c.getCliente());
        c.setCliente("Roger");
        System.out.println(c.getCliente());
    }
}
