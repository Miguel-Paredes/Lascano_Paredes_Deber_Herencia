public class pumas extends felinos{
    String habitat;
    String dieta;

    public pumas(){
        super();}

    public pumas(String nombre_felino, String tipo, float estatura, String habitat, String dieta) {
        super(nombre_felino, tipo, estatura);
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
    //creamos funciones
    public void imprimir_pumas(){
        System.out.println("El nombre del felino es: ");
        System.out.println(nombre_felino);
        System.out.println("El tipo de felino es: ");
        System.out.println(tipo);
        System.out.println("La estatura del felino es: ");
        System.out.println(estatura);
        System.out.println("El felino habita en: ");
        System.out.println(habitat);
        System.out.println("La dieta del felino es: ");
        System.out.println(dieta);
    }
}
