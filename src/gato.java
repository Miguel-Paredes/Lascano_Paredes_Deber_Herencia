public class gato extends felinos{
    String color;
    String alimentacion;
//
    public gato() {
        super();}

    public gato(String nombre_felino, String tipo, float estatura, String color, String alimentacion) {
        super(nombre_felino, tipo, estatura);
        this.color = color;
        this.alimentacion = alimentacion;}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public void imprimir_gato(){
        System.out.println("El nombre del felino es: ");
        System.out.println(nombre_felino);
        System.out.println("El tipo de felino es: ");
        System.out.println(tipo);
        System.out.println("La estatura del felino es: ");
        System.out.println(estatura);
        System.out.println("El color del gato es: ");
        System.out.println(color);
        System.out.println("Su alimentación es : ");
        System.out.println(alimentacion);
    }
}
