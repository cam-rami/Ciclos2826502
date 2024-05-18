import java.util.Scanner;

public class Ejercicio23 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar la talla de calzado US:");
        double talla = scanner.nextDouble();
        String tamaño;
            switch ((int) talla * 10) {
                case 60:
                case 65:
                case 70:
                case 75:
                case 80:
                case 85:
                tamaño = "pequemo";
                    break;
                case 90:
                case 95:
                case 100:
                case 105:
                case 110:
                case 115:
                tamaño = "mediano";
                    break;
                case 120:
                case 125:
                case 130:
                case 135:
                case 140:
                tamaño = "grande";
                    break;
                default:
                tamaño = "Talla no reconocida";
            
         }
         System.out.println("La talla" + talla + "Es considerada:" + tamaño);
         scanner.close();
    }
}
