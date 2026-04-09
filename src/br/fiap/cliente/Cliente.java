package br.fiap.cliente;

public class Cliente {
    private int cpnj;
    private String cliente;

    public Cliente(int cpnj, String cliente) {
        this.cpnj = cpnj;
        this.cliente = cliente;
    }

    public int getCpnj() {
        return cpnj;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
}

//encapsulamento
//tipos de classes -> public(nome de classe tem que ser igual); default(pode mudar nome); protected; private;


