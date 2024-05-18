package org.cgmlti.ciclos2826502;

import java.util.Scanner;

public class ejercicio4 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de valores a comparar: ");
        int cantidadValores = scanner.nextInt();
        System.out.print("Ingrese el primer valor: ");
        int menor = scanner.nextInt();

        for (int i = 1; i < cantidadValores; i++) {
        System.out.print("Ingrese el siguiente valor: ");
        int valor = scanner.nextInt();
        if (valor < menor) {
            menor = valor;
        }
    }
    
    System.out.println("El menor de los valores ingresados es: " + menor);
    scanner.close();
}
}








