package org.cgmlti.ciclos2826502;

public class ejercicio19 {
    public static void main(String[] args) {
        double h= 1.0, a=3.0, b=2.0, c=4.0;
        double  z = --h  + h--  * ++h   /  --h;
        System.out.println("resultado de operacion " + z);
        System.out.println(h);
        System.out.println(b);
        System.out.println(c);
        System.out.println(a);
    }

}
