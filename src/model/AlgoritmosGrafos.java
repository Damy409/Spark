package model;
import java.util.*;

public class AlgoritmosGrafos {

    public static List<Integer> BFS(Grafo grafo, int inicio) {
        List<Integer> recorrido = new ArrayList<>();
        boolean[] visitado = new boolean[grafo.numVertices];
        Queue<Integer> cola = new LinkedList<>();

        visitado[inicio] = true;
        cola.offer(inicio);

        while (!cola.isEmpty()) {
            int actual = cola.poll();
            recorrido.add(actual);

            for (int adyacente : grafo.obtenerAdyacentes(actual)) {
                if (!visitado[adyacente]) {
                    visitado[adyacente] = true;
                    cola.offer(adyacente);
                }
            }
        }

        return recorrido;
    }

    public static List<Integer> DFS(Grafo grafo, int inicio) {
        List<Integer> recorrido = new ArrayList<>();
        boolean[] visitado = new boolean[grafo.numVertices];
        DFSUtil(grafo, inicio, visitado, recorrido);
        return recorrido;
    }

    private static void DFSUtil(Grafo grafo, int v, boolean[] visitado, List<Integer> recorrido) {
        visitado[v] = true;
        recorrido.add(v);

        for (int adyacente : grafo.obtenerAdyacentes(v)) {
            if (!visitado[adyacente]) {
                DFSUtil(grafo, adyacente, visitado, recorrido);
            }
        }
    }

    public static int[] dijkstra(Grafo grafo, int inicio) {
        int[] distancias = new int[grafo.numVertices];
        Arrays.fill(distancias, Integer.MAX_VALUE);
        distancias[inicio] = 0;

        PriorityQueue<Integer> colaPrioridad = new PriorityQueue<>((a, b) -> distancias[a] - distancias[b]);
        colaPrioridad.offer(inicio);

        while (!colaPrioridad.isEmpty()) {
            int actual = colaPrioridad.poll();

            for (int adyacente : grafo.obtenerAdyacentes(actual)) {
                int distanciaNueva = distancias[actual] + 1; // Suponiendo que todas las aristas tienen peso 1

                if (distanciaNueva < distancias[adyacente]) {
                    distancias[adyacente] = distanciaNueva;
                    colaPrioridad.offer(adyacente);
                }
            }
        }

        return distancias;
    }

    public static int[][] floydWarshall(Grafo grafo) {
        int V = grafo.numVertices;
        int[][] distancias = new int[V][V];

        for (int i = 0; i < V; ++i) {
            for (int j = 0; j < V; ++j) {
                if (i == j) {
                    distancias[i][j] = 0;
                } else {
                    distancias[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        for (int v = 0; v < V; v++) {
            for (int adyacente : grafo.obtenerAdyacentes(v)) {
                distancias[v][adyacente] = 1; // Suponiendo que todas las aristas tienen peso 1
            }
        }

        for (int k = 0; k < V; ++k) {
            for (int i = 0; i < V; ++i) {
                for (int j = 0; j < V; ++j) {
                    if (distancias[i][k] != Integer.MAX_VALUE && distancias[k][j] != Integer.MAX_VALUE &&
                            distancias[i][k] + distancias[k][j] < distancias[i][j]) {
                        distancias[i][j] = distancias[i][k] + distancias[k][j];
                    }
                }
            }
        }

        return distancias;
    }

    public static List<Integer> caminoMasCortoDijkstra(Grafo grafo, int inicio, int fin) {
        int[] distancias = dijkstra(grafo, inicio);
        List<Integer> camino = new ArrayList<>();
        int actual = fin;

        while (actual != inicio) {
            camino.add(actual);
            for (int adyacente : grafo.obtenerAdyacentes(actual)) {
                if (distancias[actual] == distancias[adyacente] + 1) {
                    actual = adyacente;
                    break;
                }
            }
        }
        camino.add(inicio);
        Collections.reverse(camino);
        return camino;
    }
}
