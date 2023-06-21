public class gato extends felinos{
    String color;
    String alimentacion;

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
}
