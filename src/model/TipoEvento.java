package model;

import java.util.Random;

public enum TipoEvento {
    ESCALERA_ELSA(3, 13),
    ESCALERA_OLAF(5, 10),
    ESCALERA_SVEN(8, 17),
    ESCALERA_ANNA(14, 21),
    SERPIENTE_MONSTRUOS_ELSA(12, 2),
    SERPIENTE_HANS(19, 6),
    SERPIENTE_LOBOS(25, 15),
    SERPIENTE_INVIERNO_ELSA(29, 16),
    MINI_JUEGO_OLAF(9),
    ESPERA_ELSA(18),
    DESAFIO_HIELO(24),
    ENCUENTRO_TROLLS(27);

    private final int casilla;
    private final int destino; // En el caso de las escaleras

    TipoEvento(int casilla) {
        this.casilla = casilla;
        this.destino = -1; // Por defecto, en eventos sin destino
    }

    TipoEvento(int casilla, int destino) {
        this.casilla = casilla;
        this.destino = destino;
    }

    public int getCasilla() {
        return casilla;
    }

    public int getDestino() {
        return destino;
    }

    public int ejecutarEvento() {
        Random random = new Random();
        int dado = random.nextInt(6) + 1; // Simula lanzar el dado

        switch (this) {
            case MINI_JUEGO_OLAF:
                if (dado % 2 == 0) {
                    return 3; // Avanza 3 casillas
                }
                return 0; // No avanza
            case ESPERA_ELSA:
                return 0; // Espera un turno sin efecto
            case DESAFIO_HIELO:
                int sistema = random.nextInt(6) + 1; // Número del sistema
                if (dado >= sistema) {
                    return 1; // Gana un lanzamiento extra
                }
                return -1; // Pierde un turno
            case ENCUENTRO_TROLLS:
                if (dado % 2 != 0) {
                    return -4; // Retrocede 4 casillas
                }
                return 0; // No retrocede
            default:
                return 0; // No hay efecto
        }
    }

}