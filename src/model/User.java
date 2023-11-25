package model;
public class User {
     
    private String userName;
    private int userAge;
    private Interests[] interests;
    private Hobbies[] hobbies;
    private Genre userGenre;

    public User(String userName, int userAge, Interests[] interests, Hobbies[] hobbies, Genre userGenre) {
        this.userName = userName;
        this.userAge = userAge;
        this.interests = interests;
        this.hobbies = hobbies;
        this.userGenre = userGenre;
    }

    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public Interests[] getInterests() {
        return interests;
    }

    public void setInterests(Interests[] interests) {
        this.interests = interests;
    }

    public Hobbies[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(Hobbies[] hobbies) {
        this.hobbies = hobbies;
    }

    public Genre getUserGenre() {
        return userGenre;
    }

    public void setUserGenre(Genre userGenre) {
        this.userGenre = userGenre;
    }

    // Método para enviar un mensaje a otro usuario
    public void sendMessage(User receiver, String message) {
        // Aquí podrías implementar la lógica real para enviar el mensaje
        receiver.receiveMessage(this, message); // Llamar al método receiveMessage del receptor para entregar el mensaje
    }

    // Método para recibir un mensaje de otro usuario
    public void receiveMessage(User sender, String message) {
        // Aquí se procesaría el mensaje recibido
        System.out.println(userName + " recibió un mensaje de " + sender.getUserName() + ": " + message);
    }

    
}
