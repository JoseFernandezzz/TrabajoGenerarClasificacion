package Juegos;

public class Coche {
    private String nombre;
    private Reloj tiempoDeVuelta;

    public Reloj getTiempoDeVuelta() {
        return tiempoDeVuelta;
    }

    public void setTiempoDeVuelta(Reloj tiempoDeVuelta) {
        this.tiempoDeVuelta = tiempoDeVuelta;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Coche(String nombre, int horas, int minutos, int segundos){
        this.nombre = nombre;
        this.tiempoDeVuelta= new Reloj(horas,minutos,segundos);


    }
    public void registrarTiempoDeVuelta(int segundos) {
        tiempoDeVuelta.sumarSegundos(segundos);
    }
    public String toString(){
        return "Coche: " + nombre + " Tiempo de vuelta: " + tiempoDeVuelta.toString();
    }

}
