import java.util.Scanner;

public class Centinela {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Double nota = 0.0;

        //lectura de notas por teclado
        //System.out.println("Ingrese nota");
        //Double nota = entrada.nextDouble();
        //System.out.println("nota guardada:" + nota);
        
        do {
            System.out.println("Ingrese nota");
            nota = entrada.nextDouble();
            System.out.println("nota guardada:" + nota);
        }while (nota != 0);
        System.out.println("Terminamos!!");

        entrada.close();
    }
}
 
