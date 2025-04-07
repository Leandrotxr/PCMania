package br.com.pcmania;

public class Computador {

    public String marca;
    public float preco;
    public HardwareBasico [] hardwares;
    public SistemaOperacional so;
    public MemoriaUSB memoriaUSB;


    public Computador(String marca, float preco) {
        this.marca = marca;
        this.preco = preco;
        so = new SistemaOperacional();
        hardwares = new HardwareBasico[3];
    }

    public void mostraPCConfigs(){
        System.out.println("Marca: " + marca);
        System.out.println("Preco: R$" + String.format("%.2f",preco));
        System.out.println("Sistema operacional: " + so.nome + "(" + so.tipo + "-bits)");
        if(memoriaUSB != null){
            System.out.println("Memoria: " + memoriaUSB.nome + " - " + memoriaUSB.capacidade + "Gb");
        }
        for (int i = 0; i < hardwares.length; i++) {
            if (hardwares[i] != null) {
                System.out.println("Hardware " + (i + 1) + ": " + hardwares[i].nome + " - " + hardwares[i].capacidade + " MHz");
            }
        }
    }

    public void addMemoriaUSB(MemoriaUSB memoriaUSB1){
        memoriaUSB = memoriaUSB1;
    }
}
