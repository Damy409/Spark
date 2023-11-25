package model;

/**
 * Represents a user within the SPARK application.
 * Each user has a name, age, interests, hobbies, and a specified gender.
 */
public class User {

    private String userName; // User's name
    private int userAge; // User's age
    private Interests[] interests; // Array representing user's interests
    private Hobbies[] hobbies; // Array representing user's hobbies
    private Genre userGenre; // User's specified gender

    /**
     * Constructor to create a User object.
     *
     * @param userName   The name of the user.
     * @param userAge    The age of the user.
     * @param interests  An array of Interests representing user's interests.
     * @param hobbies    An array of Hobbies representing user's hobbies.
     * @param userGenre  The gender (Genre) of the user.
     */
    public User(String userName, int userAge, Interests[] interests, Hobbies[] hobbies, Genre userGenre) {
        this.userName = userName;
        this.userAge = userAge;
        this.interests = interests;
        this.hobbies = hobbies;
        this.userGenre = userGenre;
    }

    /**
     * Retrieves the name of the user.
     *
     * @return The name of the user.
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the name of the user.
     *
     * @param userName The new name of the user.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Retrieves the age of the user.
     *
     * @return The age of the user.
     */
    public int getUserAge() {
        return userAge;
    }

    /**
     * Sets the age of the user.
     *
     * @param userAge The new age of the user.
     */
    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    /**
     * Retrieves an array of the user's interests.
     *
     * @return An array representing the user's interests.
     */
    public Interests[] getInterests() {
        return interests;
    }

    /**
     * Sets the user's interests using an array.
     *
     * @param interests An array representing the user's interests.
     */
    public void setInterests(Interests[] interests) {
        this.interests = interests;
    }

    /**
     * Retrieves an array of the user's hobbies.
     *
     * @return An array representing the user's hobbies.
     */
    public Hobbies[] getHobbies() {
        return hobbies;
    }

    /**
     * Sets the user's hobbies using an array.
     *
     * @param hobbies An array representing the user's hobbies.
     */
    public void setHobbies(Hobbies[] hobbies) {
        this.hobbies = hobbies;
    }

    /**
     * Retrieves the gender (Genre) of the user.
     *
     * @return The gender of the user.
     */
    public Genre getUserGenre() {
        return userGenre;
    }

    /**
     * Sets the gender of the user.
     *
     * @param userGenre The new gender of the user.
     */
    public void setUserGenre(Genre userGenre) {
        this.userGenre = userGenre;
    }
}
