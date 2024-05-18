import java.util.ArrayList;
import java.util.Scanner;

import org.cgmlti.ciclos2826502.vendedor;

public class ejercicio15 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
            ArrayList<vendedor> vendedores = new ArrayList<>();
                for ( int i = 0; i < 5; i++){
                    System.out.println("Ingrese el codigo del vendedor" + (i + 1) + ":");
                    long codigo = scanner.nextInt();
                    System.out.println("Ingrese  las unidades vendidas por el vendedor " + (i + 1) + ":");
                    Integer unidadesVendidas = scanner.nextInt();

                    vendedor  vendedor = new vendedor ( codigo, unidadesVendidas);
                    vendedores.add(vendedor );
                }
                vendedor mejorVendedor = vendedores.get(0);
                for (vendedor vendedor : vendedores){
                    if (vendedor.getunidadesVendidas()>
                    mejorVendedor.getunidadesVendidas()){
                        mejorVendedor = vendedor;
                    }
                }
                System.out.println("El vendedor con mas unidades vendidas es:");
                System.out.println("codigo" + mejorVendedor.getunidadesVendidas());

                scanner.close();
 
}
}
