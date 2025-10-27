package application;

import entities.Carro;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carro carro = new Carro();

        System.out.print("Marca: ");
        carro.setMarca(sc.nextLine());

        System.out.print("Modelo: ");
        carro.setModelo(sc.nextLine());

        System.out.print("Ano: ");
        carro.setAno(sc.nextInt());

        System.out.printf("Velocidade atual %d\n", carro.getVelocidade());

        System.out.println(carro.acelerar());
        System.out.println(carro.acelerar());
        System.out.println(carro.frear());


        carro.mostrarInfo();
    }
}
