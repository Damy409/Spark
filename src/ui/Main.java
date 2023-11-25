package ui;
import java.util.*;

import model.Controller;
import model.Genre;
import model.Graph;
import model.Hobbies;
import model.Interests;
import model.User;


public class Main {

    public static Controller sparkController = new Controller();
    static Graph userGraph = new Graph();
    

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        int optionMenu = 0;

        sparkController.autoCreateGameSparks(userGraph);

        System.out.println("------------------------------------------");
        System.out.println("             Welcome to SPARK!            ");
        System.out.println("------------------------------------------");
        System.out.println("1. Register");
        System.out.println("2. Log In");
        System.out.println("3. Exit");

        System.out.println("OPTION:");
        optionMenu = lector.nextInt();

        while(optionMenu < 1 || optionMenu > 3)
        {
            System.out.println("Please, enter a valid option (number between 1 and 3)");
            System.out.println("OPTION: ");
            optionMenu = lector.nextInt();
        }

        switch(optionMenu)
        {
            case 1:
                askUserData();
                break;
            case 2:
                userLogIn();
                break;
        }
    }

    public static void askUserData() {

        Scanner lector = new Scanner(System.in);

        System.out.println("------------------------------------------");
        System.out.println("    Are you ready to light your spark?    ");
        System.out.println("------------------------------------------");
        System.out.println("         Join the constelation by         ");
        System.out.println("       providing the following data       ");
        System.out.println("------------------------------------------");

        System.out.println("Name: ");
        String name = lector.nextLine();

        System.out.println("Age: ");
        int age = lector.nextInt();

        System.out.println("Interests:");
        System.out.println("Please select 3 of the following list");

        int selectedInterests = 1;
        int choosenInterest = 0;
        Interests[] userInterests = new Interests[3];


        while (selectedInterests < 4)
        {
            System.out.println("Interest " +selectedInterests+ "/3");
            System.out.println("    1.  Movies");
            System.out.println("    2.  Videogames");
            System.out.println("    3.  Music");
            System.out.println("    4.  Art");
            System.out.println("    5.  Food");
            System.out.println("    6.  Dogs");
            System.out.println("    7.  Cats");
            System.out.println("    8.  Tech");
            System.out.println("    9.  Books");
            System.out.println("    10. Nature");
            System.out.println("OPTION:");

            choosenInterest = lector.nextInt();

            while(choosenInterest < 1 || choosenInterest > 10)
            {
                System.out.println("Please select a valid option (number between 1 and 10)");
                System.out.println("OPTION:");
                choosenInterest = lector.nextInt();
            }

            switch (choosenInterest)
            {
                case 1:
                    userInterests[selectedInterests-1] = Interests.movies;
                    break;
                case 2:
                    userInterests[selectedInterests-1] = Interests.videogames;
                    break;
                case 3:
                    userInterests[selectedInterests-1] = Interests.music;
                    break;
                case 4:
                    userInterests[selectedInterests-1] = Interests.art;
                    break;
                case 5:
                    userInterests[selectedInterests-1] = Interests.food;
                    break;
                case 6:
                    userInterests[selectedInterests-1] = Interests.dogs;
                    break;
                case 7:
                    userInterests[selectedInterests-1] = Interests.cats;
                    break;
                case 8:
                    userInterests[selectedInterests-1] = Interests.tech;
                    break;
                case 9:
                    userInterests[selectedInterests-1] = Interests.books;
                    break;
                case 10:
                    userInterests[selectedInterests-1] = Interests.nature;
                    break;
            }
            selectedInterests++;
        }

        System.out.println("Hobbies: ");

        System.out.println("Please select 3 of the following list");

        int selectedHobbies = 1;
        int choosenHobbie = 0;
        Hobbies[] userHobbies = new Hobbies[3];

        while (selectedHobbies < 4)
        {
            System.out.println("    1.  Reading");
            System.out.println("    2.  Painting");
            System.out.println("    3.  Playing an instrument");
            System.out.println("    4.  Playing videogames");
            System.out.println("    5.  Programming");
            System.out.println("    6.  Cooking");
            System.out.println("    7.  Photography");
            System.out.println("    8.  Sports");
            System.out.println("    9.  Singing");
            System.out.println("    10. Dancing");
            System.out.println("OPTION:");

            choosenHobbie = lector.nextInt();

            while(choosenHobbie < 1 || choosenHobbie > 10)
            {
                System.out.println("Please select a valid option (number between 1 and 10)");
                System.out.println("OPTION:");
                choosenHobbie = lector.nextInt();
            }

            switch (choosenHobbie)
            {
                case 1:
                    userHobbies[selectedHobbies-1] = Hobbies.reading;
                    break;
                case 2:
                    userHobbies[selectedHobbies-1] = Hobbies.painting;
                    break;
                case 3:
                    userHobbies[selectedHobbies-1] = Hobbies.instrument;
                    break;
                case 4:
                    userHobbies[selectedHobbies-1] = Hobbies.videogames;
                    break;
                case 5:
                    userHobbies[selectedHobbies-1] = Hobbies.programming;
                    break;
                case 6:
                    userHobbies[selectedHobbies-1] = Hobbies.cooking;
                    break;
                case 7:
                    userHobbies[selectedHobbies-1] = Hobbies.photography;
                    break;
                case 8:
                    userHobbies[selectedHobbies-1] = Hobbies.sports;
                    break;
                case 9:
                    userHobbies[selectedHobbies-1] = Hobbies.singing;
                    break;
                case 10:
                    userHobbies[selectedHobbies-1] = Hobbies.dancing;
                    break;
            }
            selectedHobbies++;
        }

        System.out.println("Genre: ");
        System.out.println("1. Male");
        System.out.println("2. Female");
        System.out.println("3. Other");

        int choosenGenre = 0;

        System.out.println("OPTION:");
        choosenGenre = lector.nextInt();
        Genre genre = Genre.male;

        while (choosenGenre < 1 || choosenGenre > 3) 
        {
            System.out.println("Please select a valid option (number between 1 and 3)");
            System.out.println("OPTION:");
            choosenGenre = lector.nextInt(); 
        }

        switch (choosenGenre) {
            case 1:
                genre = Genre.male;
                break;
            case 2:
                genre = Genre.female;
                break;
            case 3:
                genre = Genre.other;
        }
    
        String createdUserMessage = sparkController.createUser(name, age, userInterests, userHobbies, genre, userGraph);
        System.out.println(createdUserMessage);
    }

    public static void userLogIn()
    {
        Scanner lector = new Scanner(System.in);

        System.out.println("------------------------------------------");
        System.out.println("                 LOG IN                   ");
        System.out.println("------------------------------------------");
        System.out.println("Please enter your name");
        System.out.println("Name: ");
        String logName = lector.nextLine();

        int position = sparkController.searchListIndex(logName);
        userStartScreen(sparkController.returnUserFromList(position));
        
    }
    

    public static void userStartScreen(User userTrial){
        System.out.println("------------------------------------------");
        System.out.println("       Welcome to SPARK! "+userTrial.getUserName());
        System.out.println("------------------------------------------");
        System.out.println("               PROFILE INFO               ");
        System.out.println("------------------------------------------");
        System.out.println("NAME: "+userTrial.getUserName());
        System.out.println("AGE: "+userTrial.getUserAge());
        System.out.println("GENDER: "+userTrial.getUserGenre());
        System.out.println("INTERESTS: "+userTrial.getInterests()[0]+","+userTrial.getInterests()[1]+","+userTrial.getInterests()[2]);
        System.out.println("HOBBIES: "+userTrial.getHobbies()[0]+","+userTrial.getHobbies()[1]+","+userTrial.getHobbies()[2]);
        userMenu(userTrial);
    }

    public static void userMenu(User userTrial){

        String searchedMatch = "";
        int position = 0;
        int optionMatches = 0;
        int optionRepeat = 0;

        User match = userTrial;

        Scanner lector = new Scanner(System.in);

        System.out.println("------------------------------------------");
        System.out.println("                 MENU                     ");
        System.out.println("------------------------------------------");
        System.out.println("1. Look at my matches");
        System.out.println("2. Message a match");
        System.out.println("3. Ask a match for a date");
        System.out.println("------------------------------------------");
        System.out.println("OPTION: ");


        int optionMenuUser = lector.nextInt();

        while(optionMenuUser < 1 || optionMenuUser > 3)
        {
            System.out.println("Please, enter a valid option (number between 1 and 3)");
            System.out.println("OPTION: ");
            optionMenuUser = lector.nextInt();
        }

        switch(optionMenuUser)
        {
            case 1:
                userGraph.showOneUserConnections(userTrial);
                System.out.println("Do you want to see the info of any of your connections?");
                System.out.println("1. Yes");
                System.out.println("2. No, go back to the menu");

                lector.nextLine();

                optionMatches = lector.nextInt();

                lector.nextLine();

                while(optionMatches < 1 || optionMatches > 2)
                {
                    System.out.println("Please, enter a valid option (1 or 2)");
                    System.out.println("OPTION: ");
                    optionMatches = lector.nextInt();
                }
                switch(optionMatches)
                {
                    case 1:
                        System.out.println("Enter the name of the match you want to know more from");
                        searchedMatch = lector.nextLine();

                        position = sparkController.searchListIndex(searchedMatch);
                        match = sparkController.returnUserFromList(position);

                        System.out.println("------------------------------------------");
                        System.out.println("NAME: "+match.getUserName());
                        System.out.println("AGE: "+match.getUserAge());
                        System.out.println("GENDER: "+match.getUserGenre());
                        System.out.println("INTERESTS: "+match.getInterests()[0]+","+userTrial.getInterests()[1]+","+userTrial.getInterests()[2]);
                        System.out.println("HOBBIES: "+match.getHobbies()[0]+","+userTrial.getHobbies()[1]+","+userTrial.getHobbies()[2]);
                        System.out.println("------------------------------------------");

                        repeatMenu(userTrial);

                        break;
                    case 2:
                        userMenu(userTrial);
                        break;
                }
                break;
            case 2:
                        System.out.println("Recommended users according to your interests");
                        sparkController.mostrarRecomendacionesDeCoincidencia(userTrial, userGraph);
                break;
            case 3:
                        System.out.println("Discovery Page");
                        sparkController.discoverNewProfiles(userGraph, userTrial);
                break;
        }
    }

    public static void repeatMenu(User userTrial)
    {
        Scanner lector = new Scanner(System.in);

        System.out.println("Wanna continue in the app?");
        System.out.println("1. Yes, go back to the menu");
        System.out.println("2. No, exit");
        System.out.println("OPTION: ");

        int optionRepeat = lector.nextInt();

        while(optionRepeat < 1 || optionRepeat > 2)
        {
            System.out.println("Please, enter a valid option (1 or 2)");
            System.out.println("OPTION: ");
            optionRepeat = lector.nextInt();
        }

        switch(optionRepeat)
        {
            case 1:
                userMenu(userTrial);
            case 2:
                break;
        }
    }
}