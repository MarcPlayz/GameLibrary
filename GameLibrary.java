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
        sc = new Scanner(System.in);
    }
    
    public void StartLibrary() {
        System.out.println("");
    }
}