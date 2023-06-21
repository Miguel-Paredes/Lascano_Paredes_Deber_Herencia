import java.util.Scanner;

public class menuPrincipal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        gato wilson = new gato();
        String opcion;
        System.out.printf("Eliga una opcion: ");
        opcion= entrada.nextLine();
        System.out.printf(opcion);
    }
}
