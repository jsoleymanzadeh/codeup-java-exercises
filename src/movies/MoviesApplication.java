package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {
    public static void main(String[] args) {
        Movie[] movies = MoviesArray.findAll();
        Input userInput = new Input();
        while (true) {
            System.out.print("What would you like to do?\n\n0 - exit\n1 - view all movies\n2 - view movies in the animated category\n3 - view movies in the drama category\n4 - view movies in the horror category\n5 - view movies in the scifi category\n6 - add movie\n\nEnter your choice: ");
            String userChoice = userInput.getString();
            switch (userChoice) {
                case "0":
                    System.out.println("Exiting...");
                    return;
                case "1":
                    System.out.println("All Films\n");
                    for (Movie movie : movies) {
                        System.out.println(movie.getTitle());
                    }
                    break;
                case "2":
                    System.out.println("Animated Films\n");
                    for (Movie movie : movies) {
                        if (movie.getGenre().equals("animated")) {
                            System.out.println(movie.getTitle());
                        }
                    }
                    break;
                case "3":
                    System.out.println("Drama Films\n");
                    for (Movie movie : movies) {
                        if (movie.getGenre().equals("drama")) {
                            System.out.println(movie.getTitle());
                        }
                    }
                    break;
                case "4":
                    System.out.println("Horror Films\n");
                    for (Movie movie : movies) {
                        if (movie.getGenre().equals("horror")) {
                            System.out.println(movie.getTitle());
                        }
                    }
                    break;
                case "5":
                    System.out.println("Scifi Films\n");
                    for (Movie movie : movies) {
                        if (movie.getGenre().equals("scifi")) {
                            System.out.println(movie.getTitle());
                        }
                    }
                    break;
                case "6":
                    System.out.println("Add Film\n");
                    System.out.print("Title: ");
                    String title = userInput.getString();
                    System.out.print("Genre: ");
                    String genre = userInput.getString();
                    Movie newMovie = new Movie(title, genre);
                    movies = Arrays.copyOf(movies, movies.length + 1);
                    movies[movies.length - 1] = newMovie;
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
            System.out.println();
        }
    }
}