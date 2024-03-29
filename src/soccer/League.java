package soccer;

public class League
{
    public static void main(String[] args)
    {
        // Create object of Player Class
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        // Assign values to the instance variables of Player Class
        p1.playerName = "George Eliot";
        p2.playerName = "Graham Greene";
        p3.playerName = "Geoffrey Chaucer";
        // Create Player Array to store all the objects
        Player[] thePlayers = { p1,p2,p3 };

        // Create object of Team Class
        Team t1 = new Team();
        // Assign value to the instance variable of Team Class
        t1.teamName = "The Greens";
        // Put the Player Array in the array you created in Team Class
        t1.playerArray = thePlayers;

        Team t2 = new Team();
        t2.teamName = "The Reds";
        // Create array (of Player Type) to store player names
        t2.playerArray = new Player[3];
        t2.playerArray[0] = new Player();
        t2.playerArray[0].playerName = "Robert Service";
        t2.playerArray[1] = new Player();
        t2.playerArray[1].playerName = "Robbie Burns";
        t2.playerArray[2] = new Player();
        t2.playerArray[2].playerName = "Rafael Sabatini";

        // Create object of Game , Goal Class
        Game currGame = new Game();
        Goal goal1 = new Goal();
        // Store object of team class in instance variable of Game Class via object of Game class
        currGame.homeTeam = t1;
        currGame.awayTeam = t2;

        // Store the name of player number 3 which is in playerArray[2]
     // playerArray is present in t1 which is in homeTeam
     // homeTeam is instance variable accessible via currGame instance of GAME Class
        goal1.thePlayer = currGame.homeTeam.playerArray[2];
     // Store homeTeam in theTeam Array
        goal1.theTeam = currGame.homeTeam;
        goal1.theTime = 55;

        // Store goal1 which has player names in Array
        Goal[] theGoals = {goal1};
        // Store the array in instance variable
        currGame.goals = theGoals;

        System.out.println("Goal scored after " + currGame.goals[0].theTime + "mins by "
        + currGame.goals[0].thePlayer.playerName + "of " + currGame.goals[0].theTeam.teamName);
        System.out.println("Name : "+currGame.awayTeam.teamName);
        System.out.println("Name : "+currGame.homeTeam.teamName);
    }
}
