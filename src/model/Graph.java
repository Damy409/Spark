package model;
import java.util.*;

public class Graph {

    Map<Integer, List<User>> interestGroups = new HashMap<>();
    Map<User, List<User>> vertices;

    public Graph(){
        this.vertices= new HashMap<>();
    }

    public void addProfile(User user) 
    {
        vertices.put(user, new ArrayList<>());
    }

    public void connectProfiles(User user_a, User user_b) {

        if (vertices.containsKey(user_a) && vertices.containsKey(user_b)) {
            vertices.get(user_a).add(user_b);
            vertices.get(user_b).add(user_a);
        }
    }

    public List<User> getConnectedProfiles(User user) {
        return vertices.get(user);
    }

    public int compabilityUsers(User user_a, User user_b) {

        // Interests

        Interests[] interests_a = user_a.getInterests();
        Interests[] interests_b = user_b.getInterests();

        // We calculate the compability according to the interests shared (50% of the total)

        int sharedInterests = 0;

        for (int i = 0; i < interests_a.length; i++) 
        {
            for (int j = 0; j < interests_b.length; j++)
            {
                if (interests_a[i] == interests_b[j]) {
                    sharedInterests++;
                }
            }
        }

        int totalInterests = interests_a.length;
        double compabilityInterests = ((double) sharedInterests / totalInterests * 100)/2;

        // Hobbies

        Hobbies[] hobbies_a = user_a.getHobbies();
        Hobbies[] hobbies_b = user_b.getHobbies();

        // We calculate the compability according to the hobbies shared (50% of the total)

        int sharedHobbies = 0;

        for (int i = 0; i < hobbies_a.length; i++) 
        {
            for (int j = 0; j < hobbies_b.length; j++)
            {
                if (hobbies_a[i] == hobbies_b[j]) {
                    sharedHobbies++;
                }
            }
        }

        int totalHobbies = hobbies_a.length;
        double compabilityHobbbies = ((double) sharedHobbies / totalHobbies * 100)/2;

        int totalCompability = (int)(compabilityInterests + compabilityHobbbies);

        return totalCompability;
    }

    public void createConnections(List<User> userProfiles){

        int comparacionMinima = 1;

        for (int i = 0; i < userProfiles.size(); i++)
        {
            for (int j = comparacionMinima; (j < userProfiles.size() && i != j) ; j++)
            {
                if (compabilityUsers(userProfiles.get(i), userProfiles.get(j)) > 60) 
                    {
                        connectProfiles(userProfiles.get(i), userProfiles.get(j)); // Conecta los perfiles
                    }
            }
            comparacionMinima++;
        }

    }


    public void printUserConnections() {
        for (Map.Entry<User, List<User>> entry : vertices.entrySet()) {
            User userProfile = entry.getKey();
            List<User> connectedProfiles = entry.getValue();

            System.out.println("User: " + userProfile.getUserName());
            System.out.println("Connections:");
            for (User connectedProfile : connectedProfiles) {
                System.out.println("\t" + connectedProfile.getUserName());
            }
            System.out.println("---------------------------");
        }
    }

    public void showOneUserConnections(User userTrial) {
        for (Map.Entry<User, List<User>> entry : vertices.entrySet()) {
            User currentUser = entry.getKey();
            List<User> connectedProfiles = entry.getValue();
    
            if (currentUser.getUserName().equals(userTrial.getUserName())) {
                System.out.println("User: " + currentUser.getUserName());
                System.out.println("Connections:");
                for (User connectedProfile : connectedProfiles) {
                    System.out.println(""+connectedProfile.getUserName());
                }
                System.out.println("---------------------------");
                return; // Sale del método después de imprimir las conexiones del usuario encontrado
            }
        }
        
        // Si el usuario no se encuentra en las conexiones
        System.out.println("User not found or has no connections.");
    }

    public void sendMessage(User sender, User receiver, String message) {
        if (vertices.containsKey(sender) && vertices.containsKey(receiver)) {
            if (vertices.get(sender).contains(receiver) || vertices.get(receiver).contains(sender)) {
                // Aquí podrías implementar la lógica para enviar el mensaje entre los perfiles
                System.out.println(sender.getUserName() + " envió un mensaje a " + receiver.getUserName() + ": " + message);
            } else {
                System.out.println("Los perfiles no están conectados.");
            }
        } else {
            System.out.println("Uno o ambos perfiles no existen.");
        }
    }

    // Método para encontrar el camino más corto basado en similitud de intereses (Dijkstra)
    public void shortestPathBasedOnInterests(User start, User end) {
    
    int similitud = calculateInterestSimilarity(start, end);

    // Muestra el resultado de la similitud de intereses entre los usuarios
    if(similitud >= 2)
    {
    System.out.println("Possible interests match between " + start.getUserName() + " and " + end.getUserName() + ": " + similitud);
    }
    }

    public int calculateInterestSimilarity(User current, User neighbor) {
        // Interests

        Interests[] interests_current = current.getInterests();
        Interests[] interests_neighbor = neighbor.getInterests();

        // We calculate the compability according to the interests shared (50% of the total)

        int sharedInterests = 0;

        for (int i = 0; i < interests_current.length; i++) 
        {
            for (int j = 0; j < interests_neighbor.length; j++)
            {
                if (interests_current[i] == interests_neighbor[j]) {
                    sharedInterests++;
                }
            }
        }

        return sharedInterests;


    }

    

}
