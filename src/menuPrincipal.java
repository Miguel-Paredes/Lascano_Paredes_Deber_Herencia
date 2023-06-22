import java.util.Scanner;
public class menuPrincipal{
    public static void main(String[] args) {
 // creando objetos
        Scanner entrada = new Scanner(System.in);
        gato wilson = new gato("Wilson","Gato domestico", 40, "naranja", "atun");
        tigrillos jupiter = new tigrillos("Jupiter","gato salvaje", 40, "carnivoro", "sabana");
        linces garfield = new linces("Garfield","gato salvaje",35,30,25);
        pumas kira = new pumas("kira", "salvaje",70,"jungla","carnivoro");
        caracal celeste = new caracal("celeste", "salvaje",70,"sabana",30);

        //Menu principal-------------------------------------------------------------------------------------------
        System.out.println("\n---------------Menu Figuras------------------");
        System.out.println("1. Caracal.");
        System.out.println("2. Gato.");
        System.out.println("3. Lince. ");
        System.out.println("4. Puma.");
        System.out.println("5. Tigrillo.");
        int opt;
        do{
            do{
            System.out.print("Seleccione una de las opciones del menu: ");
            opt= entrada.nextInt();
        switch (opt) {
            case 1 -> {
                System.out.println("\nCaracal");
                System.out.println(" ");
                celeste.imprimir_caracal();}
            case 2 -> {
                System.out.println("\nGato");
                System.out.println(" ");
                wilson.imprimir_gato();}
            case 3 -> {
                System.out.println("\nLince");
                System.out.println(" ");
                garfield.imprimir_linces();}
            case 4 -> {
                System.out.println("\n Puma");
                System.out.println(" ");
                kira.imprimir_pumas();}
            case 5 -> {
                System.out.println(("\n Tigrillo"));
                System.out.println("");
                jupiter.imprimir_tigrillos();}
            case 0 -> {
                System.out.println("Muchas Gracias");}

            default -> {
                System.out.println("Error");}}}
                while(opt>1 || opt>5);}
        while (opt!=0);}}
