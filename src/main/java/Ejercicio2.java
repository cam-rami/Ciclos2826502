import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String nota = "";
        String flag = "y";

        //contador para cada nota:
        int contadorA = 0;
        int contadorB = 0;
        int contadorC = 0;
        int contadorD = 0;
        
        do{
            System.out.println("Ingrese nota");
            nota = in.next();
            switch (nota) {
                case "A": contadorA +=1;
                    break;
                case "B": contadorB ++;
                    break;
                case "C": contadorC ++;
                    break;
                case "D": contadorD ++;
                    break;
                default: System.out.println("nota" + "no" + "valida");
                   
            }
           

            System.out.println("Desea continuar? y/n");
            flag = in.next();
        }while(flag.equals("y"));
    // impresion de resultados
        System.out.println(" El numero de A es :" + contadorA);
        System.out.println(" El numero de A es :" + contadorB);
        System.out.println(" El numero de A es :" + contadorC);
        System.out.println(" El numero de A es :" + contadorD);
        in.close();
    }

}
