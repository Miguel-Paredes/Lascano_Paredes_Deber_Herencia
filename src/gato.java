public class gato extends felinos{
    String color;
    String alimentacion;

    public gato() {
        super();}

    public gato(String nombre_felino, int tiempo_de_vida, String tipo, float estatura, String color, String alimentacion) {
        super(nombre_felino, tiempo_de_vida, tipo, estatura);
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
}
