public class caracal extends felinos{
    String habitat;

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
    String tipo ="Caracal";
    float estatura = 60;
    String habitad  = "Sabana";
    float peso = 10;

    public void imprimir_caracal(){
        System.out.println("El nombre del felino es: ");
        System.out.println(nombre_felino);
        System.out.println("El tipo de felino es: ");
        System.out.println(tipo);
        System.out.println("La estatura del felino es: ");
        System.out.println(estatura);
        System.out.println("El felino vive en: ");
        System.out.println(habitat);
        System.out.println("El felino pesa: ");
        System.out.println(peso);}}
