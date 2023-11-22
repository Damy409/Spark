package model;

public class Evento {
    private TipoEvento tipoEvento;

    public Evento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public int ejecutarEvento() {
        return tipoEvento.ejecutarEvento();
    }
}
