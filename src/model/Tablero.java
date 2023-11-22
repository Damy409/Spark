package model;

import java.util.ArrayList;
import java.util.List;

public class Tablero {
    
    private Grafo grafo;
    private List<Casilla> casillas;

    public Tablero() {
        grafo = inicializarGrafo();
        casillas = inicializarCasillas();
    }

    private List<Casilla> inicializarCasillas() {
        List<Casilla> casillas = new ArrayList<>();
        for (int i = 1; i <= 30; i++) {
            casillas.add(new Casilla(i, null)); // Inicialmente, todas las casillas están vacías
        }

        // Asignación de eventos especiales a casillas específicas
        // Escaleras
        casillas.set(2, new Casilla(3, new Evento(TipoEvento.ESCALERA_ELSA)));
        casillas.set(4, new Casilla(5, new Evento(TipoEvento.ESCALERA_OLAF)));
        casillas.set(7, new Casilla(8, new Evento(TipoEvento.ESCALERA_SVEN)));
        casillas.set(13, new Casilla(14, new Evento(TipoEvento.ESCALERA_ANNA)));

        // Serpientes
        casillas.set(11, new Casilla(12, new Evento(TipoEvento.SERPIENTE_MONSTRUOS_ELSA)));
        casillas.set(18, new Casilla(19, new Evento(TipoEvento.SERPIENTE_HANS)));
        casillas.set(24, new Casilla(25, new Evento(TipoEvento.SERPIENTE_LOBOS)));
        casillas.set(28, new Casilla(29, new Evento(TipoEvento.SERPIENTE_INVIERNO_ELSA)));

        // Eventos especiales
        casillas.set(8, new Casilla(9, new Evento(TipoEvento.MINI_JUEGO_OLAF)));
        casillas.set(17, new Casilla(18, new Evento(TipoEvento.ESPERA_ELSA)));
        casillas.set(23, new Casilla(24, new Evento(TipoEvento.DESAFIO_HIELO)));
        casillas.set(26, new Casilla(27, new Evento(TipoEvento.ENCUENTRO_TROLLS)));

        return casillas;
    }

    private Grafo inicializarGrafo() {

        Grafo grafo = new Grafo(31); // Se agrega un vértice adicional para representar la casilla 0
        // Se asume un tablero de 6x5
        for (int i = 1; i <= 30; i++) {
            int fila = (i - 1) / 5; // Obtener fila de la casilla
            int columna = (i - 1) % 5; // Obtener columna de la casilla

            // Conexiones hacia adelante (derecha en filas pares, izquierda en filas impares)
            if (fila % 2 == 0) {
                if (columna < 4) {
                    grafo.agregarArista(i, i + 1); // Conexión hacia la derecha
                }
            } else {
                if (columna > 0) {
                    grafo.agregarArista(i, i - 1); // Conexión hacia la izquierda
                }
            }

            // Conexiones hacia abajo
            if (fila < 5) {
                grafo.agregarArista(i, i + 5); // Conexión hacia abajo
            }
        }

        return grafo;
    }

    public Grafo getGrafo() {
        return this.grafo;
    }

    public Casilla getCasilla(int numero) {
        return casillas.get(numero - 1); // Los índices en la lista empiezan desde 0, el número de casilla desde 1
    }

    // Otros métodos para interactuar con el tablero
}
