package Facade;

public class Client {
    public static void main(String[] args) {
        MovieFacad movie = new MovieFacad();
        movie.startMovie();
        movie.stopMovie();
    }
}
