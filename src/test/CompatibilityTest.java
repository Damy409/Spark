package test;

import model.Hobbies;
import model.Interests;
import model.*;
import ui.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * CompatibilityTest class to test user compatibility based on interests and hobbies.
 */
public class CompatibilityTest {

    /**
     * Test to check compatibility between two users with different interests and hobbies.
     */
    @Test
    public void testUserCompatibility() {
        // Creating two users with different interests and hobbies
        Interests[] user1Interests = {Interests.movies, Interests.music, Interests.tech};
        Hobbies[] user1Hobbies = {Hobbies.reading, Hobbies.cooking, Hobbies.sports};
        User user1 = new User("User1", 25, user1Interests, user1Hobbies, Genre.other);

        Interests[] user2Interests = {Interests.music, Interests.art, Interests.tech};
        Hobbies[] user2Hobbies = {Hobbies.reading, Hobbies.programming, Hobbies.sports};
        User user2 = new User("User2", 28, user2Interests, user2Hobbies, Genre.male);

        // Calculating compatibility between the users
        Graph graph = new Graph();
        int compatibility = graph.compabilityUsers(user1, user2);

        // Checking if the compatibility is within the expected range (greater than 60%)
        assertTrue(compatibility > 60, "La compatibilidad esperada debe ser mayor al 60%");
    }
}
