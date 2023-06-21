public class felinos {
    String nombre_felino;
    int tiempo_de_vida;
    String tipo;
    float estatura;

    public felinos(){}

    public felinos(String nombre_felino, int tiempo_de_vida, String tipo, float estatura) {
        this.nombre_felino = nombre_felino;
        this.tiempo_de_vida = tiempo_de_vida;
        this.tipo = tipo;
        this.estatura = estatura;}

    public String getNombre_felino() {
        return nombre_felino;
    }

    public void setNombre_felino(String nombre_felino) {
        this.nombre_felino = nombre_felino;
    }

    public int getTiempo_de_vida() {
        return tiempo_de_vida;
    }

    public void setTiempo_de_vida(int tiempo_de_vida) {
        this.tiempo_de_vida = tiempo_de_vida;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }
}
