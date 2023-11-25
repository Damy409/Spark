package test;

import org.junit.jupiter.api.Test;
import  model.*;
import ui.*;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static ui.Main.sparkController;

public class RecommendationsTest {

    @Test
    public void testMatchRecommendations() {
        // Crear varios usuarios con intereses similares para probar las recomendaciones
        Interests[] interests = {Interests.movies, Interests.tech, Interests.books};
        Hobbies[] hobbies = {Hobbies.reading, Hobbies.programming, Hobbies.cooking};
        User userTrial = new User("UserTrial", 30, interests, hobbies, Genre.other);

        Graph userGraph = new Graph();
        // Crear varios perfiles y conectarlos al grafo
        User user1 = new User("User1", 25, interests, hobbies, Genre.other);
        User user2 = new User("User2", 28, interests, hobbies, Genre.other);
        User user3 = new User("User3", 32, interests, hobbies, Genre.other);
        userGraph.addProfile(user1);
        userGraph.addProfile(user2);
        userGraph.addProfile(user3);
        userGraph.connectProfiles(userTrial, user1);
        userGraph.connectProfiles(userTrial, user2);
        userGraph.connectProfiles(userTrial, user3);

        // Calcular las recomendaciones de coincidencia para el usuario de prueba
        List<User> recommendations = sparkController.mostrarRecomendacionesDeCoincidencia(userTrial, userGraph);

        // Verificar que las recomendaciones no estén vacías y contengan usuarios conectados
        assertFalse(recommendations.isEmpty(), "Las recomendaciones no deben estar vacías");
        assertTrue(recommendations.contains(user1), "Se espera que User1 esté en las recomendaciones");
        assertTrue(recommendations.contains(user2), "Se espera que User2 esté en las recomendaciones");
        assertTrue(recommendations.contains(user3), "Se espera que User3 esté en las recomendaciones");
    }
}
