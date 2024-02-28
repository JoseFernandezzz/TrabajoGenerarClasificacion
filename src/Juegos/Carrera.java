package Juegos;

public class Carrera {

    Coche[] listaCoches;
    private Reloj tiempoDeInicio;
    private boolean carreraEnCurso;
    int numCoches;

    public Carrera(int capacidadMaxima) {
        this.listaCoches = new Coche[capacidadMaxima];
        this.numCoches = 0;
        this.tiempoDeInicio = new Reloj(0, 0, 0);
        this.carreraEnCurso = false;
    }

    public void agregarCoche(Coche coche) {
        if (numCoches < listaCoches.length) {
            listaCoches[numCoches] = coche;
            numCoches++;
        } else {
            System.out.println("La carrera está completa, no se pueden agregar más coches.");
        }
    }

    public void comenzarCarrera() {
        if (!carreraEnCurso) {
            tiempoDeInicio = new Reloj(0, 0, 0);
            carreraEnCurso = true;
        }
    }

    public void registrarTiempoDeVuelta(Coche coche) {
        if (carreraEnCurso) {
            // Simulación de tiempo de vuelta aleatorio (para prueba)
            int segundos = (int) (Math.random() * 60);
            coche.registrarTiempoDeVuelta(segundos);
        }
    }

    public void finalizarCarrera() {
        if (carreraEnCurso) {
            carreraEnCurso = false;
            generarClasificacion();
        }
    }

    private void generarClasificacion() {
        // Ordenar coches según sus tiempos de vuelta utilizando el método de burbujeo
        for (int i = 0; i < numCoches - 1; i++) {
            for (int j = 0; j < numCoches - i - 1; j++) {
                if (tiempoEsMayor(listaCoches[j].getTiempoDeVuelta(), listaCoches[j + 1].getTiempoDeVuelta())) {
                    // Intercambiar coches en la posición j y j+1
                    Coche temp = listaCoches[j];

                    listaCoches[j] = listaCoches[j + 1];
                    listaCoches[j + 1] = temp;
                }
            }
        }

        System.out.println("Clasificación Final:");
        for (int e = 0; e < numCoches; e++) {
            System.out.println((e + 1) + ". " + listaCoches[e].toString());
        }
    }


    private boolean tiempoEsMayor(Reloj tiempo1, Reloj tiempo2) {
        if (tiempo1.getHoras() > tiempo2.getHoras()) {
            return true;
        } else if (tiempo1.getHoras() == tiempo2.getHoras() && tiempo1.getMinutos() > tiempo2.getMinutos()) {
            return true;
        } else if (tiempo1.getMinutos() == tiempo2.getMinutos() && tiempo1.getSegundos() > tiempo2.getSegundos()) {
            return true;
        }
        return false;


    }
}

