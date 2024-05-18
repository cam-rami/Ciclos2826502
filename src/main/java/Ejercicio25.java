import java.util.Scanner;

public class Ejercicio25 {
 public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   System.out.println("Ingresa el nombre de un mes del el año:");
   String mes = scanner.nextLine().toLowerCase();
    int dias;
        switch (mes) {
            case "enero":
            case "marzo":
            case "mayo":
            case "julio":
            case "agosto":
            case "octubre":
            case "diciembre":
                dias = 31;
                break;
            case "abril":
            case "junio":
            case "septiembre":
            case "noviembre":
                dias = 30;
                break;
            case "febrero":
                dias = 28;
                break;
            default:
                dias = -1;
        }
            if (dias != -1) {
                System.out.println("El mes de " + mes + "tiene" + dias + "dias");
                
            }
            scanner.close();

 }
}
