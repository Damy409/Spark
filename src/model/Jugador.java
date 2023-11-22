package model;

import java.util.List;

public class Jugador {
    private int posicionActual;

    public Jugador() {
        this.posicionActual = 1; // Empieza en la casilla 1
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    // Mover según resultado del dado
    public void mover(int cantidad) {
        posicionActual += cantidad;
    }

    // Mover a una posición específica
    public void moverA(int nuevaPosicion) {
        posicionActual = nuevaPosicion;
    }

    // Utilizar el camino más corto obtenido con Dijkstra para moverse
    public void moverConDijkstra(List<Integer> caminoMasCorto) {
        if (caminoMasCorto.size() > 1) {
            int siguienteCasilla = caminoMasCorto.get(1); // Obtener la siguiente casilla en el camino
            moverA(siguienteCasilla); // Mover al jugador a la siguiente casilla
        }
    }

    // Otros métodos relacionados con la interacción del jugador en el juego
}
