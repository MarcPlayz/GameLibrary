public class Community extends GameLibrary
{
    // private Game gameName = new Game(); // needs to be fixed
    private int reviewRating;
    private String reviewComment;
    private String userReview;
    private int userReviewLikes;
    private int userReviewDislikes;
    
    public Community(){
        this.reviewRating = 0;
    }
    
    public int reviewRatingValue(Game game){
        return game.getRating();
    }
    
    public void gameRating(Game game, int reviewRating){
        if(reviewRating >= 0 && reviewRating <= 5){
            System.out.println("valid");
            game.setRating(reviewRating);
            System.out.println("You reviewd " + game.getName() + " a " + reviewRating);
        }
        else{
            System.out.println("false");
        }
        
        // else if(reviewRating == 1){
            // System.out.println("You reviewd " + gameName + " a 1");
        // }
        // else if(reviewRating == 2){
            // System.out.println("You reviewd " + gameName + " a 2");
        // }
        // else if(reviewRating == 3){
            // System.out.println("You reviewd " + gameName + " a 3");
        // }
        // else if(reviewRating == 4){
            // System.out.println("You reviewd " + gameName + " a 4");
        // }
        // else if(reviewRating == 5){
            // System.out.println("You reviewd " + gameName + " a 5");
        // }
        // else{
            // System.out.println("You need to input a valid game rating");
        // }
    }
}