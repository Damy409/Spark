package model;

import java.util.ArrayList;
import java.util.List;

public class Grafo {
    
    int numVertices;
    private List<Integer>[] adyacencias;

    public Grafo(int numVertices) {
        this.numVertices = numVertices;
        adyacencias = new ArrayList[numVertices];
        for (int i = 0; i < numVertices; ++i) {
            adyacencias[i] = new ArrayList<>();
        }
    }

    public void agregarArista(int origen, int destino) {
        validarVertice(origen);
        validarVertice(destino);

        if (!adyacencias[origen].contains(destino)) {
            adyacencias[origen].add(destino);
            // Si es un grafo no dirigido, descomenta la siguiente línea:
            // adyacencias[destino].add(origen);
        }
    }

    public List<Integer> obtenerAdyacentes(int vertice) {
        validarVertice(vertice);
        return adyacencias[vertice];
    }

    private void validarVertice(int vertice) {
        if (vertice < 0 || vertice >= numVertices) {
            throw new IllegalArgumentException("El vértice está fuera de rango: " + vertice);
        }
    }
}
