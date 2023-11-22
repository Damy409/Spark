package ui;
import model.*;

public class Main {
    public static void main(String[] args) {
        Juego juego = new Juego(2); // Crear un juego con dos jugadores

        // Simular varios turnos del juego
        for (int i = 0; i < 10; i++) {
            int resultadoDado = lanzarDado(); // Simulación de lanzamiento de dado
            System.out.println("Resultado del dado: " + resultadoDado);

            juego.jugarTurno(resultadoDado); // Simulación de un turno del juego

            // Mostrar la posición actual de los jugadores después de cada turno
            for (int j = 0; j < juego.getNumeroJugadores(); j++) {
                Jugador jugador = juego.getJugador(j);
                System.out.println("Jugador " + (j + 1) + " está en la casilla " + jugador.getPosicionActual());
            }

            System.out.println("-----------");
        }
    }

    // Método para simular el lanzamiento de un dado
    private static int lanzarDado() {
        return (int) (Math.random() * 6) + 1; // Números del 1 al 6
    }
}
