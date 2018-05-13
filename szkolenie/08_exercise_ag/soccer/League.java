package soccer;

import utility.GameUtils;

public class League {
    
    public static void main(String[] args) {
       
    // CREATE TEAMS
    Team[] theTeams = createTeams();
    
    // CREATE GAMES
    Game[] theGames = createGames(theTeams);
    
    // GAME
    
        // CURRENT GAME
        Game currentGame = theGames[0];
        
        // RANDOM NUMBER OF GOALS
        int numberOfGoals = (int)(Math.random() * 7);
        
        // GOALS
        Goal[] theGoals = new Goal[numberOfGoals];
        currentGame.goals = theGoals;
        
        // ADD GAME GOALS
        GameUtils.addGameGoals(currentGame);
        
        for (Goal currGoal: currentGame.goals){
        System.out.println("Goal scored after " + 
                currGoal.theTime + " mins by " +
                currGoal.thePlayer.playerName + " of "+
                currGoal.theTeam.teamName);            
        }
        
        
        


    } // END MAIN

//--------------------------- METHODS -------------------------------    
// CREATE TEAMS METHOD
    public static Team[] createTeams(){
        
        // CREATE TEAMS
        Team teamOne = new Team();
        Team teamTwo = new Team();
        
        // CREATE TEAM ARRAY
        Team[] theTeams = {teamOne, teamTwo};
        
        // Players
        Player playerOne = new Player();
        playerOne.playerName = "John Smith";
        
        Player playerTwo = new Player();
        playerTwo.playerName = "Carl Johnson";
        
        Player playerThree = new Player();
        playerThree.playerName = "Jeffrey Smoke";
        
        Player playerFour = new Player();
        playerFour.playerName = "Marcin";
        
        Player[] thePlayers = {playerOne, playerTwo, playerThree, playerFour};
        
    // Team ONE
        teamOne.teamName = "Eagles";
        teamOne.playerArray = thePlayers;
        
    // TEAM TWO
    
        // Team
        teamTwo.teamName = "Beagles";
        
        // Players
        teamTwo.playerArray = new Player[3];
        teamTwo.playerArray[0] = new Player();
        teamTwo.playerArray[0].playerName = "Robert Sabatini";
        
        teamTwo.playerArray[1] = new Player();
        teamTwo.playerArray[1].playerName = "George New";
        
        teamTwo.playerArray[2] = new Player();
        teamTwo.playerArray[2].playerName = "Peter Bloom";
        
        // RETURN TEAM ARRAY
        return theTeams;
    }
    
// CREATE GAMES METHOD
    public static Game[] createGames(Team[] theTeams){
        // CREATE GAME
        Game theGame = new Game();
        
        // CRATE TEAMS FOR GAME
        theGame.homeTeam = theTeams[0];
        theGame.awayTeam = theTeams[1];
        
        // CREATE GAME ARRAY
        Game[] theGames = {theGame};
        
        // RETURN GAME ARRAY
        return theGames;
    }
}
