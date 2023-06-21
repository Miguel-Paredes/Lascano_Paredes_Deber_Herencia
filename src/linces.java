public class linces extends felinos{
    float largo_cola;
    float largo_patas;

    public linces(){
        super();}

    public linces(String nombre_felino, String tipo, float estatura, float largo_cola, float largo_patas) {
        super(nombre_felino, tipo, estatura);
        this.largo_cola = largo_cola;
        this.largo_patas = largo_patas;}

    public float getLargo_patas() {
        return largo_patas;
    }

    public void setLargo_patas(float largo_patas) {
        this.largo_patas = largo_patas;
    }
}
