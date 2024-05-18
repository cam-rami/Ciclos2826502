package org.cgmlti.ciclos2826502;

public class ejercicio20 {
    public static void main(String[] args) {
        Double a= 3.0, b= 2.0, c= 4.0, h= 1.0;
        Double y = --b * b * (  a++    +  --c ) / ( 4 *  --c  + 3  );
        double z=0;
        System.out.println("resultado de operacion " + z);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(h);

        System.out.println("resultado de operacion " + z);
        z+=y;
    }

}
