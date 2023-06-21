import gato;
import felinos;


public class menu {
    //Menu principal---------------------------------------------------------------------------------------
        System.out.println("\n---------------Menu Figuras------------------");
        System.out.println("Calculo del area y perimetro de las siguientes figuras: ");
        System.out.println("1. Caracol");
        System.out.println("2. Felinos");
        System.out.println("3. Gato");
        System.out.println("4. Linces");
        System.out.println("5. Pumas");
        System.out.println("6. Tigrillos");
        System.out.print("Seleccione una de las opciones del menu: ");
    int opt = entrada.nextInt();

        switch (opt){
        case 1 -> {
            System.out.println("\n----> Esto es un Circulo llamado " +figuraN1.getNombre_figura1());
            System.out.println(" ");
            figuraN1.imprimirDatos();}
        case 2 -> {
            System.out.println("\n----> Esto es un Circulo llamado " +figuraN4.getNombre_figura1());
            System.out.println(" ");
            figuraN4.datos();}

        case 3 -> {
            System.out.println("\n----> Esto es un Rectangulo llamado " +figuraN6.getNombre_figura1());
            System.out.println(" ");
            figuraN6.imprimirValoresRectangulo1();}
        case 4 -> {
            System.out.println("\n----> Esto es un Rectangulo llamado " +figuraN2.getNombre_figura1());
            System.out.println(" ");
            figuraN2.imprimirValoresRectangulo_2();}

        case 5 -> {
            System.out.println("\n----> Esto es un Triangulo llamado " +figuraN3.getNombre_figura1());
            System.out.println(" ");
            figuraN5.imprimir();}

        case 6 -> {
            System.out.println("\n----> Esto es un Triangulo llamado " +figuraN5.getNombre_figura1());
            System.out.println(" ");
            figuraN3.imprimirDatos();}

        default -> System.out.println("----> ERROR! Esta conica no se encuentra en el sistema!");
    }



}exte
}
        }