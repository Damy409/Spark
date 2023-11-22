package model;

import java.util.ArrayList;
import java.util.List;

public class Juego {
    private Tablero tablero;
    private List<Jugador> jugadores;
    private int turnoActual;

    public Juego(int numJugadores) {
        tablero = new Tablero();
        jugadores = new ArrayList<>();
        for (int i = 0; i < numJugadores; i++) {
            jugadores.add(new Jugador());
        }
        turnoActual = 0;
    }

    public void jugarTurno(int resultadoDado) {
        Jugador jugadorActual = jugadores.get(turnoActual);

        jugadorActual.mover(resultadoDado); // Mover jugador según resultado del dado

        // Obtener el camino más corto usando Dijkstra
        List<Integer> caminoMasCorto = AlgoritmosGrafos.caminoMasCortoDijkstra(tablero.getGrafo(), jugadorActual.getPosicionActual(), 30);

        // Mover al jugador según el camino más corto obtenido
        jugadorActual.moverConDijkstra(caminoMasCorto);

        // Verificar si el jugador está en una casilla especial que afecte su movimiento
        Casilla casillaActual = tablero.getCasilla(jugadorActual.getPosicionActual());
        int evento = casillaActual.ejecutarEvento();

        // Si el jugador se encuentra en una casilla especial
        if (evento != 0) {
            // Lógica para manejar eventos especiales (serpientes, escaleras, mini juegos, etc.)
            // Por ejemplo, ajustar la posición del jugador según el evento
            jugadorActual.mover(evento);
        }

        // Actualizar el turno para el próximo jugador
        turnoActual = (turnoActual + 1) % jugadores.size();
    }

    // Otros métodos relacionados con la lógica del juego

    public int getNumeroJugadores() {
        return jugadores.size();
    }

    public Jugador getJugador(int indice) {
        if (indice >= 0 && indice < jugadores.size()) {
            return jugadores.get(indice);
        } else {
            return null; // Manejo de error si el índice está fuera de rango
        }
    }

}