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
    public void imprimir_tigrillos(){
        System.out.println("El nombre del felino es: ");
        System.out.println(nombre_felino);
        System.out.println("El tipo de felino es: ");
        System.out.println(tipo);
        System.out.println("La estatura del felino es: ");
        System.out.println(estatura);
        System.out.println("El felino habita en: ");
        System.out.println(habitat);
        System.out.println("La alimentacion del felino es: ");
        System.out.println(alimentacion);
    }
}
