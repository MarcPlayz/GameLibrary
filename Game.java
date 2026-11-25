
/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    private String name;
    private double rating;
    private String[] tags;

    public Game(String name, String[] tags) {
        this.name = name;
        this.tags = tags;
    }

    public void getTags() {
        for (int i = 0; i < tags.length; i++) {
            System.out.println(tags[i].toString());
        }
    }
}