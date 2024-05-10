package org.cgmlti.ciclos2826502;
 import java.util.ArrayList;
public class EjercicioFinal {
public static void main(String[] args) {
    ArrayList <Integer> notas = new ArrayList<>();

    notas.add(7);
    notas.add(10);
    notas.add(3);
    notas.add(2);
    notas.add(6);
    notas.add(4);
    notas.add(1);
    notas.add(9);
    notas.add(8);
    notas.add(5);

    //cacular el promedio
    int suma = 0;
    for (int nota : notas){
        suma += nota;
    }

    double promedio = (double) suma / notas.size();
    System.out.println("promedio de las 10 notas es: " + promedio);
}
}
