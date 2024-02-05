package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        String tipo;
        int simple=2000;
        int doble=4000;
        int especial=7000;
        int numeroVentas;
        int totalSimple, totalDoble, totalEspecial, totalVentas;
        int cantidadSimple, cantidadDoble, cantidadEspecial;


        System.out.println("cantidad simple: ");
        cantidadSimple = lea.nextInt();
        System.out.println("cantidad Doble: ");
        cantidadDoble = lea.nextInt();
        System.out.println("cantidad especial:");
        cantidadEspecial = lea.nextInt();

        totalSimple= cantidadSimple*simple ;
        totalDoble= cantidadDoble*doble;
        totalEspecial= cantidadEspecial*especial;
        totalVentas=totalSimple+totalDoble+totalEspecial;


        System.out.println("total simples: $" + totalSimple);
        System.out.println("total dobles: $" + totalDoble);
        System.out.println("total especiales: $" + totalEspecial);
        System.out.println("total: $" + totalVentas);

    }
}