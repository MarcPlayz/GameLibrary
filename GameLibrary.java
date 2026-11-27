import java.util.HashSet;
import java.util.Scanner;

/**
 * Write a description of class Library here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GameLibrary
{
    private int numGames = 0;
    private double libraryValue = 0.0;
    private HashSet<Game> library;
    
    private Scanner sc;
    
    public GameLibrary() {
        library = new HashSet<>();
        sc = new Scanner(System.in);
        printMenu();
    }
    
    public void addGame(Game game) {
        library.add(game);
    }
    
    public void printGameDetails(String game) {
        for (Game g : library) {
            //if (library.contains(game)) {
            if (g.getName() == game) {
                System.out.println("Name: " + g.getName());
                System.out.println("Tags: " + g.getTags());
                System.out.println("Rating: " + g.getRating());
            }
        }
    }
    
    public void printMenu() {
        boolean exit = false;
        
        System.out.println("1. Print library details");
        System.out.println("2. List all games");
        System.out.println("3. List games by genre, platform, age ratings");
        System.out.println("4. List top-rated games");
        System.out.println("5. Print game details");
        System.out.println("6. Rate a game");
        System.out.println("7. Start a game session");
        System.out.println("8. Print game session log");
        System.out.println("9. Add your own game");
        System.out.println("0. EXIT");
        
        while (!exit) {
            if (sc.nextLine().contains("0")) {
                exit = true;
            }
            else if (sc.nextLine().contains("1")) {
                
            }
            else if (sc.nextLine().contains("2")) {
                System.out.println(library.toArray());
            }
            else if (sc.nextLine().contains("3")) {
                
            }
            else if (sc.nextLine().contains("4")) {
                
            }
            else if (sc.nextLine().contains("5")) {
                
            }
            else if (sc.nextLine().contains("6")) {
                
            }
            else if (sc.nextLine().contains("7")) {
                
            }
            else if (sc.nextLine().contains("8")) {
                
            }
            else if (sc.nextLine().contains("9")) {
                
            }
        }
    }
}