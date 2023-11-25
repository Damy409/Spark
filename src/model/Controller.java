package model;
import java.util.*;

/**
 * Controller class managing user profiles and interactions in the SPARK application.
 * Handles user creation, profile connections, recommendations, and profile discovery.
 */
public class Controller {

    static List<User> userProfiles = new ArrayList<>();

    /**
     * Automatically creates user profiles and connections in the SPARK application.
     *
     * @param userGraph The graph representing user connections.
     */
    public void autoCreateGameSparks(Graph userGraph) {
        User user1 = new User("Camila", 18, new Interests[]{Interests.books, Interests.cats, Interests.nature}, new Hobbies[]{Hobbies.dancing, Hobbies.programming, Hobbies.painting}, Genre.female);
        User user2 = new User("Abril", 19, new Interests[]{Interests.books, Interests.dogs, Interests.art}, new Hobbies[]{Hobbies.reading, Hobbies.sports, Hobbies.singing}, Genre.female);
        User user3 = new User("Sofia", 20, new Interests[]{Interests.books, Interests.nature, Interests.tech}, new Hobbies[]{Hobbies.cooking, Hobbies.videogames, Hobbies.programming}, Genre.female);
        User user4 = new User("Alejandra", 21, new Interests[]{Interests.books, Interests.art, Interests.movies}, new Hobbies[]{Hobbies.instrument, Hobbies.painting, Hobbies.photography}, Genre.female);
        User user5 = new User("Daniela", 22, new Interests[]{Interests.books, Interests.food, Interests.videogames}, new Hobbies[]{Hobbies.sports, Hobbies.reading, Hobbies.dancing}, Genre.female);
        User user6 = new User("Juliana", 23, new Interests[]{Interests.movies, Interests.tech, Interests.dogs}, new Hobbies[]{Hobbies.singing, Hobbies.cooking, Hobbies.videogames}, Genre.female);
        User user7 = new User("Maria", 24, new Interests[]{Interests.movies, Interests.art, Interests.books}, new Hobbies[]{Hobbies.programming, Hobbies.instrument, Hobbies.painting}, Genre.female);
        User user8 = new User("Fanny", 18, new Interests[]{Interests.dogs, Interests.cats, Interests.music}, new Hobbies[]{Hobbies.photography, Hobbies.singing, Hobbies.reading}, Genre.female);
        User user9 = new User("Angela", 19, new Interests[]{Interests.nature, Interests.tech, Interests.food}, new Hobbies[]{Hobbies.dancing, Hobbies.cooking, Hobbies.sports}, Genre.female);
        User user10 = new User("Isabella", 20, new Interests[]{Interests.videogames, Interests.movies, Interests.art}, new Hobbies[]{Hobbies.videogames, Hobbies.photography, Hobbies.programming}, Genre.female);
        User user11 = new User("Helena", 21, new Interests[]{Interests.dogs, Interests.cats, Interests.books}, new Hobbies[]{Hobbies.reading, Hobbies.singing, Hobbies.instrument}, Genre.female);
        User user12 = new User("Laura", 22, new Interests[]{Interests.music, Interests.food, Interests.nature}, new Hobbies[]{Hobbies.painting, Hobbies.cooking, Hobbies.videogames}, Genre.female);
        User user13 = new User("Maria Jose", 23, new Interests[]{Interests.tech, Interests.videogames, Interests.art}, new Hobbies[]{Hobbies.sports, Hobbies.programming, Hobbies.photography}, Genre.female);
        User user14 = new User("Angeles", 24, new Interests[]{Interests.movies, Interests.books, Interests.nature}, new Hobbies[]{Hobbies.instrument, Hobbies.dancing, Hobbies.reading}, Genre.female);
        User user15 = new User("Valentina", 18, new Interests[]{Interests.food, Interests.cats, Interests.tech}, new Hobbies[]{Hobbies.singing, Hobbies.videogames, Hobbies.painting}, Genre.female);
        User user16 = new User("Valeria", 19, new Interests[]{Interests.music, Interests.dogs, Interests.art}, new Hobbies[]{Hobbies.cooking, Hobbies.reading, Hobbies.programming}, Genre.female);
        User user17 = new User("Sandra", 20, new Interests[]{Interests.movies, Interests.nature, Interests.tech}, new Hobbies[]{Hobbies.photography, Hobbies.instrument, Hobbies.dancing}, Genre.female);
        User user18 = new User("Mariana", 21, new Interests[]{Interests.videogames, Interests.books, Interests.cats}, new Hobbies[]{Hobbies.sports, Hobbies.singing, Hobbies.cooking}, Genre.female);
        User user19 = new User("Gabriela", 22, new Interests[]{Interests.dogs, Interests.music, Interests.art}, new Hobbies[]{Hobbies.videogames, Hobbies.painting, Hobbies.instrument}, Genre.female);
        User user20 = new User("Leidy", 23, new Interests[]{Interests.food, Interests.nature, Interests.videogames}, new Hobbies[]{Hobbies.programming, Hobbies.photography, Hobbies.sports}, Genre.female);
        User user21 = new User("Juan", 22, new Interests[]{Interests.books, Interests.art, Interests.movies}, new Hobbies[]{Hobbies.singing, Hobbies.dancing, Hobbies.instrument}, Genre.male);
        User user22 = new User("Jose", 18, new Interests[]{Interests.movies, Interests.cats, Interests.tech}, new Hobbies[]{Hobbies.reading, Hobbies.cooking, Hobbies.singing}, Genre.male);
        User user23 = new User("Jorge", 19, new Interests[]{Interests.books, Interests.art, Interests.dogs}, new Hobbies[]{Hobbies.dancing, Hobbies.videogames, Hobbies.photography}, Genre.male);
        User user24 = new User("Martin", 20, new Interests[]{Interests.music, Interests.food, Interests.videogames}, new Hobbies[]{Hobbies.painting, Hobbies.sports, Hobbies.programming}, Genre.male);
        User user25 = new User("Felipe", 21, new Interests[]{Interests.nature, Interests.tech, Interests.movies}, new Hobbies[]{Hobbies.instrument, Hobbies.reading, Hobbies.dancing}, Genre.male);
        User user26 = new User("Samuel", 24, new Interests[]{Interests.cats, Interests.art, Interests.food}, new Hobbies[]{Hobbies.singing, Hobbies.programming, Hobbies.cooking}, Genre.male);
        User user27 = new User("Andres", 19, new Interests[]{Interests.books, Interests.music, Interests.dogs}, new Hobbies[]{Hobbies.photography, Hobbies.painting, Hobbies.reading}, Genre.male);
        User user28 = new User("Diego", 19, new Interests[]{Interests.dogs, Interests.books, Interests.art}, new Hobbies[]{Hobbies.cooking, Hobbies.instrument, Hobbies.dancing}, Genre.male);
        User user29 = new User("Camilo", 20, new Interests[]{Interests.nature, Interests.movies, Interests.food}, new Hobbies[]{Hobbies.videogames, Hobbies.singing, Hobbies.sports}, Genre.male);
        User user30 = new User("Alejandro", 21, new Interests[]{Interests.tech, Interests.cats, Interests.music}, new Hobbies[]{Hobbies.programming, Hobbies.photography, Hobbies.reading}, Genre.male);
        User user31 = new User("Santiago", 22, new Interests[]{Interests.videogames, Interests.dogs, Interests.nature}, new Hobbies[]{Hobbies.dancing, Hobbies.cooking, Hobbies.painting}, Genre.male);
        User user32 = new User("Manuel", 23, new Interests[]{Interests.art, Interests.books, Interests.music}, new Hobbies[]{Hobbies.sports, Hobbies.videogames, Hobbies.instrument}, Genre.male);
        User user33 = new User("Nicolas", 24, new Interests[]{Interests.movies, Interests.food, Interests.tech}, new Hobbies[]{Hobbies.singing, Hobbies.reading, Hobbies.programming}, Genre.male);
        User user34 = new User("Esteban", 18, new Interests[]{Interests.cats, Interests.nature, Interests.books}, new Hobbies[]{Hobbies.painting, Hobbies.dancing, Hobbies.photography}, Genre.male);
        User user35 = new User("Pablo", 19, new Interests[]{Interests.music, Interests.videogames, Interests.dogs}, new Hobbies[]{Hobbies.instrument, Hobbies.cooking, Hobbies.videogames}, Genre.male);
        User user36 = new User("Pedro", 21, new Interests[]{Interests.tech, Interests.art, Interests.movies}, new Hobbies[]{Hobbies.reading, Hobbies.sports, Hobbies.singing}, Genre.male);
        User user37 = new User("Daniel", 20, new Interests[]{Interests.art, Interests.books, Interests.movies}, new Hobbies[]{Hobbies.dancing, Hobbies.painting, Hobbies.photography}, Genre.male);
        User user38 = new User("Sebastian", 22, new Interests[]{Interests.food, Interests.cats, Interests.movies}, new Hobbies[]{Hobbies.photography, Hobbies.programming, Hobbies.dancing}, Genre.male);
        User user39 = new User("Jeronimo", 23, new Interests[]{Interests.dogs, Interests.tech, Interests.nature}, new Hobbies[]{Hobbies.sports, Hobbies.singing, Hobbies.videogames}, Genre.male);
        User user40 = new User("David", 24, new Interests[]{Interests.books, Interests.music, Interests.food}, new Hobbies[]{Hobbies.videogames, Hobbies.reading, Hobbies.cooking}, Genre.male);
        User user41 = new User("Noah", 18, new Interests[]{Interests.art, Interests.movies, Interests.cats}, new Hobbies[]{Hobbies.programming, Hobbies.painting, Hobbies.photography}, Genre.other);
        User user42 = new User("Cris", 19, new Interests[]{Interests.nature, Interests.videogames, Interests.tech}, new Hobbies[]{Hobbies.dancing, Hobbies.instrument, Hobbies.sports}, Genre.other);
        User user43 = new User("Ariel", 20, new Interests[]{Interests.music, Interests.food, Interests.dogs}, new Hobbies[]{Hobbies.singing, Hobbies.cooking, Hobbies.reading}, Genre.other);
        User user44 = new User("Índigo", 21, new Interests[]{Interests.cats, Interests.art, Interests.tech}, new Hobbies[]{Hobbies.instrument, Hobbies.photography, Hobbies.videogames}, Genre.other);
        User user45 = new User("Aike", 22, new Interests[]{Interests.movies, Interests.nature, Interests.music}, new Hobbies[]{Hobbies.painting, Hobbies.dancing, Hobbies.programming}, Genre.other);
        User user46 = new User("Aimar", 23, new Interests[]{Interests.food, Interests.books, Interests.dogs}, new Hobbies[]{Hobbies.reading, Hobbies.sports, Hobbies.cooking}, Genre.other);
        User user47 = new User("Aran", 24, new Interests[]{Interests.dogs, Interests.movies, Interests.art}, new Hobbies[]{Hobbies.cooking, Hobbies.singing, Hobbies.photography}, Genre.other);
        User user48 = new User("René", 18, new Interests[]{Interests.music, Interests.tech, Interests.nature}, new Hobbies[]{Hobbies.videogames, Hobbies.painting, Hobbies.dancing}, Genre.other);
        User user49 = new User("Sam", 19, new Interests[]{Interests.food, Interests.cats, Interests.videogames}, new Hobbies[]{Hobbies.photography, Hobbies.instrument, Hobbies.reading}, Genre.other);

        userGraph.addProfile(user1);
        userGraph.addProfile(user2);
        userGraph.addProfile(user3);
        userGraph.addProfile(user4);
        userGraph.addProfile(user5);
        userGraph.addProfile(user6);
        userGraph.addProfile(user7);
        userGraph.addProfile(user8);
        userGraph.addProfile(user9);
        userGraph.addProfile(user10);
        userGraph.addProfile(user11);
        userGraph.addProfile(user12);
        userGraph.addProfile(user13);
        userGraph.addProfile(user14);
        userGraph.addProfile(user15);
        userGraph.addProfile(user16);
        userGraph.addProfile(user17);
        userGraph.addProfile(user18);
        userGraph.addProfile(user19);
        userGraph.addProfile(user20);
        userGraph.addProfile(user21);
        userGraph.addProfile(user22);
        userGraph.addProfile(user23);
        userGraph.addProfile(user24);
        userGraph.addProfile(user25);
        userGraph.addProfile(user26);
        userGraph.addProfile(user27);
        userGraph.addProfile(user28);
        userGraph.addProfile(user29);
        userGraph.addProfile(user30);
        userGraph.addProfile(user31);
        userGraph.addProfile(user32);
        userGraph.addProfile(user33);
        userGraph.addProfile(user34);
        userGraph.addProfile(user35);
        userGraph.addProfile(user36);
        userGraph.addProfile(user37);
        userGraph.addProfile(user38);
        userGraph.addProfile(user39);
        userGraph.addProfile(user40);
        userGraph.addProfile(user41);
        userGraph.addProfile(user42);
        userGraph.addProfile(user43);
        userGraph.addProfile(user44);
        userGraph.addProfile(user45);
        userGraph.addProfile(user46);
        userGraph.addProfile(user47);
        userGraph.addProfile(user48);
        userGraph.addProfile(user49);

        userProfiles.add(user1);
        userProfiles.add(user2);
        userProfiles.add(user3);
        userProfiles.add(user4);
        userProfiles.add(user5);
        userProfiles.add(user6);
        userProfiles.add(user7);
        userProfiles.add(user8);
        userProfiles.add(user9);
        userProfiles.add(user10);
        userProfiles.add(user11);
        userProfiles.add(user12);
        userProfiles.add(user13);
        userProfiles.add(user14);
        userProfiles.add(user15);
        userProfiles.add(user16);
        userProfiles.add(user17);
        userProfiles.add(user18);
        userProfiles.add(user19);
        userProfiles.add(user20);
        userProfiles.add(user21);
        userProfiles.add(user22);
        userProfiles.add(user23);
        userProfiles.add(user24);
        userProfiles.add(user25);
        userProfiles.add(user26);
        userProfiles.add(user27);
        userProfiles.add(user28);
        userProfiles.add(user29);
        userProfiles.add(user30);
        userProfiles.add(user31);
        userProfiles.add(user32);
        userProfiles.add(user33);
        userProfiles.add(user34);
        userProfiles.add(user35);
        userProfiles.add(user36);
        userProfiles.add(user37);
        userProfiles.add(user38);
        userProfiles.add(user39);
        userProfiles.add(user40);
        userProfiles.add(user41);
        userProfiles.add(user42);
        userProfiles.add(user43);
        userProfiles.add(user44);
        userProfiles.add(user45);
        userProfiles.add(user46);
        userProfiles.add(user47);
        userProfiles.add(user48);
        userProfiles.add(user49);

        userGraph.createConnections(userProfiles);
        userGraph.printUserConnections();


    }


    /**
     * Creates a new user profile and establishes connections based on compatibility.
     *
     * @param name      The name of the user.
     * @param age       The age of the user.
     * @param interests The interests of the user.
     * @param hobbies   The hobbies of the user.
     * @param genre     The gender/genre of the user.
     * @param userGraph The graph representing user connections.
     * @return A success message confirming the creation of the user.
     */
    public String createUser(String name, int age, Interests[] interests, Hobbies[] hobbies, Genre genre, Graph userGraph) {
        User userTrial = new User(name, age, interests, hobbies, genre);
        userGraph.addProfile(userTrial);
        userProfiles.add(userTrial);

        for (int i = 0; i < userProfiles.size() - 1; i++) {
            if (userGraph.compabilityUsers(userProfiles.get(i), userTrial) > 60) {
                userGraph.connectProfiles(userProfiles.get(i), userTrial);
            }
        }

        userGraph.printUserConnections();

        return "The user has been created succesfully";
    }

    /**
     * Searches for the index of a user profile in the userProfiles list by name.
     *
     * @param name The name of the user profile to search for.
     * @return The index of the user profile in the list, or -1 if not found.
     */
    public int searchListIndex(String name)
    {
        int indice = -1;
        for (int i = 0; i < userProfiles.size(); i++) {
            if (userProfiles.get(i).getUserName().equals(name)) {
                indice = i;
                break;
            }
        }
        return indice;
    }

    /**
     * Retrieves a user profile from the userProfiles list based on the index.
     *
     * @param index The index of the user profile to retrieve.
     * @return The user profile corresponding to the index.
     */
    public User returnUserFromList(int index)
    {
        User logInUser = userProfiles.get(index);
        return logInUser;
    }


    /**
     * Shows recommendations for a given user based on interests.
     *
     * @param user      The user for whom recommendations are displayed.
     * @param userGraph The graph representing user connections.
     */
    public void showRecommendations(User user, Graph userGraph) {
        System.out.println("Compatible recommendations for " + user.getUserName() + ":");

        for (User otherUser : userProfiles) {
            if (!user.equals(otherUser)) {
                userGraph.shortestPathBasedOnInterests(user, otherUser);
            }
        }
    }

    /**
     * Discovers new profiles within a certain degree of separation from a user.
     *
     * @param userGraph  The graph representing user connections.
     * @param userTrial  The user profile for which to discover new profiles.
     */
    public void discoverNewProfiles(Graph userGraph, User userTrial) {
        Set<User> foundedProfiles = searchProfilesSeparation(2, userGraph, userTrial);

        // Mostrar los perfiles encontrados
        System.out.println("Profiles for you to discover:");
        for (User user : foundedProfiles)
        {
            System.out.println(user.getUserName());
        }
    }

    /**
     * Searches for profiles within a certain degree of separation using BFS.
     *
     * @param degree     The degree of separation to search for.
     * @param userGraph  The graph representing user connections.
     * @param userTrial  The user profile to start the search from.
     * @return A set of discovered user profiles within the specified degree of separation.
     */
    private Set<User> searchProfilesSeparation(int degree, Graph userGraph, User userTrial) {

        Set<User> foundedProfiles = new HashSet<>();
        Queue<User> tail = new LinkedList<>();
        Map<User, Integer> distances = new HashMap<>();

        tail.add(userTrial);
        distances.put(userTrial, 0);

        while (!tail.isEmpty()) {
            User actualUser = tail.poll();
            int actualDistance = distances.get(actualUser);

            if (actualDistance == degree) {
                break;
            }

            for (User neighbor : userGraph.getConnectedProfiles(actualUser)) {
                if (!distances.containsKey(neighbor)) {
                    distances.put(neighbor, actualDistance + 1);
                    tail.add(neighbor);
                    foundedProfiles.add(neighbor);
                }
            }
        }

        return foundedProfiles;
    }
    
    
}
