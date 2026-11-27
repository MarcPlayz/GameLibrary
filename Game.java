
/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game extends GameLibrary
{
    private String name;
    private int rating;
    private String[] tags;
    private double price;

    public Game(String name, String[] tags) {
        this.name = name;
        this.tags = tags;
        this.rating = 0;
    }
    
    public String getName() {
        return name;
    }
    
    public int getRating() {
        return rating;
    }
    
    public String getTags() {
        String t = "";
        for (int i = 0; i < tags.length; i++) {
            if (i == 0) {
                t = t + tags[i].toString();
            }
            else {
                t = t + ", " + tags[i].toString();
            }            
        }
        return t;
    }
}