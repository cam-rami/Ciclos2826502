import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejerccio13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Estudiante> listaEstudiantes = new ArrayList<>();
        while (true) {
            System.out.println("Ingrese el nombre del estuiante (o ´n´ para terminar)");
            String nombre = scanner.nextLine();
            if (nombre.equalsIgnoreCase("n")){
                break;
            }
            System.out.println("Ingresar la identificacion del estudiante:");
            int identificacion = scanner.nextInt();
            System.out.println("Ingresa la nota de el estudiante;");
            double nota = scanner.nextDouble();
            scanner.nextLine();

            listaEstudiantes.add(new Estudiante(nombre, identificacion, nota));
        
        }
            if (listaEstudiantes.size() > 0){
                Estudiante estudienteMinNota = listaEstudiantes.get(0);
                Estudiante estudianateMaxNota = listaEstudiantes.get(0);
                double sumaNotas = 0;
                for (Estudiante estudiante : listaEstudiantes){
                    if (estudiante.getnota() < estudienteMinNota.getnota()){
                        estudienteMinNota = estudiante;
                    }
                    if (estudiante.getnota() > estudianateMaxNota.getnota()){
                        estudianateMaxNota = estudiante;
                    }
                    sumaNotas += estudiante.getnota();
                } 
                double promedioNotas = sumaNotas / listaEstudiantes.size();
                System.out.println("Estudiante con la minima nota :");
                System.out.println("nombre" + estudienteMinNota.getnombre());
                System.out.println("idetificacion" + estudienteMinNota.getidetificacion());
                System.out.println("nota" + estudienteMinNota.getnota());
                System.out.println("Estudiante con la maxima nota:");
                System.out.println("nombre" + estudienteMinNota.getnombre());
                System.out.println("idetificacion" + estudienteMinNota.getidetificacion());
                System.out.println("nota" + estudienteMinNota.getnota());
                System.out.println("Promedio de notas:" + promedioNotas);
            }
            else {
                System.out.println("No se ingresaron estuadiantes:");
            }
            scanner.close();
        }
}
