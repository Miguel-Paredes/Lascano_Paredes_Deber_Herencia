public class tigrillos extends felinos{
    String alimentacion;
    String habitat;

    public tigrillos(){
        super();}

    public tigrillos(String nombre_felino, int tiempo_de_vida, String tipo, float estatura, String alimentacion, String habitat) {
        super(nombre_felino, tiempo_de_vida, tipo, estatura);
        this.alimentacion = alimentacion;
        this.habitat = habitat;}

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}
