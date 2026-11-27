import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game{
    private String name;
    private int rating;
    private String[] tags;
    private double price;
    HashSet<Genre> genreTags;
    private Genre genre;
    public Game(String name) {
        this.name = name;
        //this.tags = tags;
        this.rating = 0;
        genreTags = new HashSet<>();
    }

    public void addGenre(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to add another genre to the game?");

        String answer = scanner.nextLine();
        if(answer.equalsIgnoreCase("yes")){
            System.out.println("Here is a list of current genres to add:");
            for(Genre genre : genre.values()){
                int value = 1;
                System.out.println(genre);
            }
            answer = scanner.nextLine();
            switch(answer.toUpperCase()){
                case "ACTION":
                    genreTags.add(genre.ACTION);
                    System.out.println("You have added action to " + getName());
                    break;
                case "ADVENTURE":
                    genreTags.add(genre.ADVENTURE);
                    System.out.println("You have added adventure to " + getName());
                    break;
                case "HORROR":
                    genreTags.add(genre.HORROR);
                    System.out.println("You have added horror to " + getName());
                    break;
                case "RACING":
                    genreTags.add(genre.RACING);
                    System.out.println("You have added racing to " + getName());
                    break;
                case "RPG":
                    genreTags.add(genre.RPG);
                    System.out.println("You have added RPG to " + getName());
                    break;
                case "SURVIVAL":
                    genreTags.add(genre.SURVIVAL);
                    System.out.println("You have added survival to " + getName());
                    break;
            }
        }
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }
    
    public void setRating(int rating){
        this.rating = rating;
        
    }
    
    public String getGenreTags() {
        Iterator<Genre> it = genreTags.iterator();
        String t = "";
        while (it.hasNext()) {
            Genre g = it.next();
            t = t + g;
            if (it.hasNext()) {
                t = t + ", ";
            }
        }
        return t;
    }
}