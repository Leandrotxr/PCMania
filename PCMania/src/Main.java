import br.com.pcmania.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Cliente-------------------------------------------------------------------
        Cliente cliente = new Cliente("Leandro",123456789);

        //Promoção 1:---------------------------------------------------------------
        Computador computador1 = new Computador("Apple", 2118);

        computador1.so.nome = "Linux Ubuntu";
        computador1.so.tipo = 32;

        MemoriaUSB memoriaUSB1 = new MemoriaUSB();
        memoriaUSB1.nome = "Pendrive";
        memoriaUSB1.capacidade = 16;
        computador1.addMemoriaUSB(memoriaUSB1);

        HardwareBasico processador1 = new HardwareBasico();
        computador1.hardwares[0] = processador1;
        computador1.hardwares[0].nome = "Pentium Core i3";
        computador1.hardwares[0].capacidade = 2200;

        HardwareBasico RAM1 = new HardwareBasico();
        computador1.hardwares[1] = RAM1;
        computador1.hardwares[1].nome = "Memoria RAM";
        computador1.hardwares[1].capacidade = 8;

        HardwareBasico HD1 = new HardwareBasico();
        computador1.hardwares[2] = HD1;
        computador1.hardwares[2].nome = "HD";
        computador1.hardwares[2].capacidade = 500;

        //Promoção 2:--------------------------------------------------------------------
        Computador computador2 = new Computador("Samsung", 3352);

        computador2.so.nome = "Windows 8";
        computador2.so.tipo = 64;

        MemoriaUSB memoriaUSB2 = new MemoriaUSB();
        memoriaUSB2.nome = "Pendrive";
        memoriaUSB2.capacidade = 32;
        computador2.addMemoriaUSB(memoriaUSB2);

        HardwareBasico processador2 = new HardwareBasico();
        computador2.hardwares[0] = processador2;
        computador2.hardwares[0].nome = "Pentium Core i5";
        computador2.hardwares[0].capacidade = 3370;

        HardwareBasico RAM2 = new HardwareBasico();
        computador2.hardwares[1] = RAM2;
        computador2.hardwares[1].nome = "Memoria RAM";
        computador2.hardwares[1].capacidade = 16;

        HardwareBasico HD2 = new HardwareBasico();
        computador2.hardwares[2] = HD2;
        computador2.hardwares[2].nome = "HD";
        computador2.hardwares[2].capacidade = 1000;

        //Promoção 3:--------------------------------------------------------------------
        Computador computador3 = new Computador("Dell", 7796);

        computador3.so.nome = "Windows 10";
        computador3.so.tipo = 64;

        MemoriaUSB memoriaUSB3 = new MemoriaUSB();
        memoriaUSB3.nome = "HD externo";
        memoriaUSB3.capacidade = 1000;
        computador3.addMemoriaUSB(memoriaUSB3);

        HardwareBasico processador3 = new HardwareBasico();
        computador3.hardwares[0] = processador3;
        computador3.hardwares[0].nome = "Pentium Core i7";
        computador3.hardwares[0].capacidade = 4500;

        HardwareBasico RAM3 = new HardwareBasico();
        computador3.hardwares[1] = RAM3;
        computador3.hardwares[1].nome = "Memoria RAM";
        computador3.hardwares[1].capacidade = 32;

        HardwareBasico HD3 = new HardwareBasico();
        computador3.hardwares[2] = HD3;
        computador3.hardwares[2].nome = "HD";
        computador3.hardwares[2].capacidade = 2000;

        //-----------------------------------------------------------------------------------
        int x;
        int i = 0;
        float valor;

        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Digite um codigo promocional: ");
            x = sc.nextInt();
        }while(x < 0 || x > 3);

        while(x != 0 && i < 10) {

            if(x == 1){
                Computador c1;
                c1 = computador1;
                cliente.computadores[i] = c1;
                i++;
            }else if(x == 2){
                Computador c2;
                c2 = computador2;
                cliente.computadores[i] = c2;
                i++;
            }else{
                Computador c3;
                c3 = computador3;
                cliente.computadores[i] = c3;
                i++;
            }

            do{
                System.out.print("Digite um codigo promocional: ");
                x = sc.nextInt();
            }while(x < 0 || x > 3);
        }

        System.out.println("\nConfiguracoes dos computadores comprados: ");
        for (int j = 0; j < i; j++){
            cliente.computadores[j].mostraPCConfigs();
            System.out.println();
        }

        valor = cliente.calculaTotalCompra();

        System.out.println("Valor total das compras de " + cliente.nome + ": RS" + String.format("%.2f", valor));
    }
}