public class felinos {
    String nombre_felino;
    String tipo;
    float estatura;

    public felinos(){}

    public felinos(String nombre_felino, String tipo, float estatura) {
        this.nombre_felino = nombre_felino;
        this.tipo = tipo;
        this.estatura = estatura;}

    public String getNombre_felino() {
        return nombre_felino;
    }

    public void setNombre_felino(String nombre_felino) {
        this.nombre_felino = nombre_felino;
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
