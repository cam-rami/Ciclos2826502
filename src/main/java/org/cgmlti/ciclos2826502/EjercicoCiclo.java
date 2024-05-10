package org.cgmlti.ciclos2826502;

public class EjercicoCiclo {
public static void main(String[] args) {
    int contador;
    //variable acumuladora:
    //nombre significactivo
    //recomendacion : valor inicial: 0
    int total = 0;

    for (contador = 0; 
        contador <=10;
        contador++){
            //instruccion de acomulacion  de control
        total += contador; total = 0;
         contador =0;
        System.out.println(contador);
        }
        // imprimir la variable acumulatible acomuladora afuera de el for 
        System.out.println("el total es;" + total);
        
        while (contador <=10) {
            System.out.println(contador);
            contador++;
            
        }
}
}
