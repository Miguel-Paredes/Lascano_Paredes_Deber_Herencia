public class caracal extends felinos{
    String habitat;
    float peso;

    public caracal(){
        super();}

    public caracal(String nombre_felino, String tipo, float estatura, String habitat, float peso) {
        super(nombre_felino, tipo, estatura);
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
    public void imprimir(){
        System.out.println("El nombre del felino es: ");
        System.out.println(nombre_felino);
        System.out.println();
    }
}
