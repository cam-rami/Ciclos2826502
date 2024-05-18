package org.cgmlti.ciclos2826502;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Ingresa el numero para ver su tabla de multiplicar:");
            int numero = scanner.nextInt();

            System.out.println("Tabla de multiplicar del" + numero + "usuando el ciclo for:");

            for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

            System.out.println("Tabla de multiplicar del" + numero + "usuando el ciclo While:");
            int j = 1 ;
            while (j <= 10) {
                System.out.println(numero + " x " + j + " = " + (numero * j));
                j++;
            }

            System.out.println("Tabla de multiplicar del" + numero + "usando el ciclo do-while:");
            int k = 1;
            do {
                System.out.println(numero + " x " + k + " = " + (numero * k));
                k++;
            } while (k <= 10);
        }

}
