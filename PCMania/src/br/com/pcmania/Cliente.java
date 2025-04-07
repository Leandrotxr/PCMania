package br.com.pcmania;

public class Cliente {

    public String nome;
    long cpf;

    public Computador [] computadores;

    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
        computadores = new Computador[10];
    }

    public float calculaTotalCompra(){
        float total = 0;

        for(Computador i : computadores){
            if(i != null){
                total += i.preco;
            }
        }
        return total;
    }
}
