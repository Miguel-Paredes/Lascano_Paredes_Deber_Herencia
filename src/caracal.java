public class caracal extends felinos{
    String habitat;
    float peso;

    public caracal(){
        super();}

    public caracal(String nombre_felino, int tiempo_de_vida, String tipo, float estatura, String habitat, float peso) {
        super(nombre_felino, tiempo_de_vida, tipo, estatura);
        this.habitat = habitat;
        this.peso = peso;}

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
