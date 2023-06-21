public class linces extends felinos{
    float largo_cola;
    float largo_patas;

    public linces(){
        super();}

    public linces(String nombre_felino, int tiempo_de_vida, String tipo, float estatura, float largo_cola, float largo_patas) {
        super(nombre_felino, tiempo_de_vida, tipo, estatura);
        this.largo_cola = largo_cola;
        this.largo_patas = largo_patas;}

    public float getLargo_patas() {
        return largo_patas;
    }

    public void setLargo_patas(float largo_patas) {
        this.largo_patas = largo_patas;
    }
}
