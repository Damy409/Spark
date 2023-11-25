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


    
}
