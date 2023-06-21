import java.util.Scanner;
public class menuPrincipal extends felinos{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        gato wilson = new gato();
        String opcion;
        opcion= entrada.nextLine();
        System.out.printf(opcion);
        //Menu principal---------------------------------------------------------------------------------------
        System.out.println("\n---------------Menu Figuras------------------");
        System.out.println("Calculo del area y perimetro de las siguientes figuras: ");
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
