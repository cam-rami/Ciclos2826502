import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        
        String Password = "";
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("Ingrese password");
        }while (!Password.equals("secreto"));
    }
}
