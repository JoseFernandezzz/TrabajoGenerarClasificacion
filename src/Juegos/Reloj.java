package Juegos;

import java.util.Scanner;

public class Reloj {
    private int segundos;
    private int minutos;
    private int horas;

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    public void Reloj(){
        this.segundos = 00;
        this.minutos = 00;
        this.horas = 00;

    }
    public Reloj(int segundos, int minutos, int horas){
        this.segundos = segundos;
        this.minutos = minutos;
        this.horas = horas;
    }
    public boolean modificarHora(int horas, int minutos, int segundos) {
        if (horas >= 0 && horas <= 23 && minutos >= 0 && minutos <= 59 && segundos >= 0 && segundos <= 59) {
            this.horas = horas;
            this.minutos = minutos;
            this.segundos = segundos;
            return true;
        } else {
            return false;
        }
    }
        public void sumarSegundo(int segundos){
        this.segundos = segundos;
        segundos++;
            if (segundos == 60) {
                segundos = 0;
                sumarMinuto();
            }
    }
    public void sumarSegundos(int segundos) {
        for (int i = 0; i < segundos; i++) {
            sumarSegundo(3);
        }
    }
    private void sumarMinuto() {
        minutos++;
        if (minutos == 60) {
            minutos = 0;
            sumarHora();
        }
    }
    private void sumarHora() {
        horas++;
        if (horas == 24) {
            horas = 0;
        }
    }
    public String toString(){
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }

}
