package Juegos;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Coche coche1 = new Coche("Ferrari", 0, 1, 30);
        Coche coche2 = new Coche("Aston Martin", 0, 2, 0);
        Coche coche3 = new Coche("Mercedes", 0, 1, 45);

        // Crear una carrera
        Carrera carrera = new Carrera(3);

        // Agregar los coches a la carrera
        carrera.agregarCoche(coche1);
        carrera.agregarCoche(coche2);
        carrera.agregarCoche(coche3);

        // Comenzar la carrera
        carrera.comenzarCarrera();

        // Registrar tiempos de vuelta durante la carrera
        for (int i = 0; i < 5; i++) {
            carrera.registrarTiempoDeVuelta(coche1);
            carrera.registrarTiempoDeVuelta(coche2);
            carrera.registrarTiempoDeVuelta(coche3);
        }

        // Finalizar la carrera
        carrera.finalizarCarrera();
        }
    }

