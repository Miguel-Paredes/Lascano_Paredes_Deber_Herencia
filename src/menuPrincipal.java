import java.util.Scanner;
public class menuPrincipal extends felinos{
    public static void main(String[] args) {
 // creando objetos
        Scanner entrada = new Scanner(System.in);
        gato wilson = new gato();
        tigrillos jupiter = new tigrillos();
        linces garfield = new linces();
        pumas kira = new pumas();
        caracal celeste = new caracal();

        //Menu principal-------------------------------------------------------------------------------------------
        System.out.println("\n---------------Menu Figuras------------------");
        System.out.println("1. Caracal.");
        System.out.println("2. Gato.");
        System.out.println("3. Lince. ");
        System.out.println("4. Puma.");
        System.out.println("5. Tigrillo.");
        System.out.print("Seleccione una de las opciones del menu: ");
        int opt = entrada.nextInt();
        do{
        switch (opt) {
            case 1 -> {
                System.out.println("\nCaracal");
                System.out.println(" ");
                celeste.imprimir_caracal();
            }


            case 2 -> {
                System.out.println("\nGato");
                System.out.println(" ");
                wilson.imprimir_gato();

            }
            case 3 -> {
                System.out.println("\nLince");
                System.out.println(" ");
                garfield.imprimir_linces();
            }
            case 4 -> {
                System.out.println("\n Puma");
                System.out.println(" ");
                kira.imprimir_pumas();
            }
            case 5 -> {
                System.out.println(("\n Tigrillo"));
                System.out.println("");
                jupiter.imprimir_tigrillos();
            }
            case 0 -> {
                System.out.println("Muchas Gracias");
            }
        }
        }
        while (opt<0 || opt>5);
    }
}
