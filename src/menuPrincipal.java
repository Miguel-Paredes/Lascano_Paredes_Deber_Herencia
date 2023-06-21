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
        System.out.println("5. Felinos.");
        System.out.print("Seleccione una de las opciones del menu: ");
        int opt = entrada.nextInt();

        switch (opt){
            case 1 ->{
                System.out.println("\nCaracal");
                System.out.println(" ");}
            case 2 ->{
                System.out.println("\nGato");
                System.out.println(" ");}
            case 3 ->{
                System.out.println("\nLince");
                System.out.println(" ");}
            case 4 ->{
                System.out.println("\n Felinos");
                System.out.println(" ");}
        }
    }
}
