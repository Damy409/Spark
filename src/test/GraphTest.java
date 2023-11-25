package test;
import model.*;
import ui.*;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

/**
 * GraphTest class to test the functionality of graph connections.
 */
public class GraphTest {

    /**
     * Test to check the connection between user profiles in the graph.
     */
    @Test
    public void testConnectProfiles() {
        // Creating two users with different interests and hobbies
        User user1 = new User("Alice", 30, new Interests[]{Interests.movies, Interests.tech, Interests.art},
                new Hobbies[]{Hobbies.reading, Hobbies.programming,Hobbies.cooking}, Genre.female);
        User user2 = new User("Bob", 28, new Interests[]{Interests.tech, Interests.music, Interests.movies},
                new Hobbies[]{Hobbies.reading, Hobbies.painting, Hobbies.instrument}, Genre.male);

        // Creating a graph and connecting the user profiles
        Graph graph = new Graph();
        graph.addProfile(user1);
        graph.addProfile(user2);
        graph.connectProfiles(user1, user2);

        // Fetching connected profiles for user1 and user2
        List<User> connectedToUser1 = graph.getConnectedProfiles(user1);
        List<User> connectedToUser2 = graph.getConnectedProfiles(user2);

        // Asserting the connections between user1 and user2
        assertTrue(connectedToUser1.contains(user2), "User1 should be connected to User2");
        assertTrue(connectedToUser2.contains(user1), "User2 should be connected to User1");
    }
}