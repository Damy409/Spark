package model;

public class Casilla {
    private int numero;
    private Evento evento;

    public Casilla(int numero, Evento evento) {
        this.numero = numero;
        this.evento = evento;
    }

    public int getNumero() {
        return numero;
    }

    public Evento getEvento() {
        return evento;
    }

    public int ejecutarEvento() {
        return evento.ejecutarEvento();
    }

    // Método para manejar un evento específico
    public String manejarEvento(int resultadoDado) {
        int efecto = evento.ejecutarEvento();

        // Lógica según el tipo de evento y resultado del dado
        switch (evento.getTipoEvento()) {
            case MINI_JUEGO_OLAF:
                if (resultadoDado % 2 == 0) {
                    return "¡Avanzas 3 casillas!";
                } else {
                    return "No avanzas esta vez.";
                }
            case ESPERA_ELSA:
                return "Esperas un turno mientras el hielo se derrite.";
            // Otros casos de eventos especiales
            default:
                return "No hay efecto en esta casilla.";
        }
    }
}
