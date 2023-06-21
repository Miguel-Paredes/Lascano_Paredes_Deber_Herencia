public class pumas extends felinos{
    String habitat;
    String dieta;

    public pumas(){
        super();}

    public pumas(String nombre_felino, int tiempo_de_vida, String tipo, float estatura, String habitat, String dieta) {
        super(nombre_felino, tiempo_de_vida, tipo, estatura);
        this.habitat = habitat;
        this.dieta = dieta;}

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }
}
