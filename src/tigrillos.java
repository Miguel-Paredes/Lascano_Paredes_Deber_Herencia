public class tigrillos extends felinos{
    String alimentacion;
    String habitat;

    public tigrillos(){
        super();}

    public tigrillos(String nombre_felino, String tipo, float estatura, String alimentacion, String habitat) {
        super(nombre_felino, tipo, estatura);
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
