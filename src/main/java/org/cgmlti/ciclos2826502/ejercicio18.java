package org.cgmlti.ciclos2826502;

public class ejercicio18 {
    public static void main(String[] args) {
        double a=3.0, b=2.0, c=4.0, h=1.0;
        double z =  b / a / ( 1  - ( (--b * b ) / (a * a)) ) + ((1 +  b/(a - b))   /  (2 - (a - 3*b)/(a - b)));
        System.out.println("resultado de operacion " + z);
        System.out.println(b); 
        System.out.println(a);
        System.out.println(h);
        System.out.println(c);
    }

}
