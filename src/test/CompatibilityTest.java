package test;

import model.Hobbies;
import model.Interests;
import model.*;
import ui.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CompatibilityTest {

    @Test
    public void testUserCompatibility() {
        // Crear dos usuarios con intereses y hobbies diferentes
        Interests[] user1Interests = {Interests.movies, Interests.music, Interests.tech};
        Hobbies[] user1Hobbies = {Hobbies.reading, Hobbies.cooking, Hobbies.sports};
        User user1 = new User("User1", 25, user1Interests, user1Hobbies, Genre.other);

        Interests[] user2Interests = {Interests.music, Interests.art, Interests.tech};
        Hobbies[] user2Hobbies = {Hobbies.reading, Hobbies.programming, Hobbies.sports};
        User user2 = new User("User2", 28, user2Interests, user2Hobbies, Genre.male);

        // Calcular la compatibilidad entre los usuarios
        Graph graph = new Graph();
        int compatibility = graph.compabilityUsers(user1, user2);

        // Comprobar si la compatibilidad está dentro del rango esperado (mayor al 60%)
        assertTrue(compatibility > 60, "La compatibilidad esperada debe ser mayor al 60%");
    }
}
