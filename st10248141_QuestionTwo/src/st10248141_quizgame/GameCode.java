/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st10248141_quizgame;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GameCode {
    
    public enum WedgeColor { Purple(1), Blue(2), Red(3), Cyan(4), Yellow(5), Green(6); //enums for catagory colors
    
        private final int value; 
        WedgeColor(int value){      
            this.value = value;      
        }
        
        public int getValue(){
            return value;
        }
    } 

    ArrayList<Player> players = new ArrayList<>(); // ArrayList that stores all the player objects for a game

    public void addPlayer() { // Creates Player objects and stores them in the player array
        System.out.println("Please enter the player's name:");
        String playerName = makeScanner().nextLine();

        ArrayList<WedgeColor> playerWedges = new ArrayList<>();
        ArrayList<WedgeCard> playerCards = new ArrayList<>();

        dealCards(playerCards);

        Player newPlayer = new Player(playerName, playerWedges, playerCards);
        addPlayer(newPlayer, players);

        System.out.println("Would you like to add another player? Enter 1 for yes and any other key for no");
        String input = makeScanner().nextLine();

        if (input.equals("1")){
            addPlayer();  
        } else{
            turnOrder();  
        }
    }
    
    public ArrayList<Player> addPlayer(Player player, ArrayList<Player> arrPlayers) { // Creates Player objects and stores them in the player array
       
        arrPlayers.add(player);

        return arrPlayers;
        
    }

    public WedgeColor pickWedgeCard() {  // Chooses a random wedge card
        int randomNumber = random().nextInt(6); // Generates a random number from 1 to 6

        return WedgeColor.values()[randomNumber]; // Selects a value from WedgeColor at the position of randomNumber
    }

    public void addToPlayerHand(ArrayList<WedgeCard> playerCards) { // Adds a wedge card to a player's 'hand' (ArrayList of cards)
        playerCards.add(new WedgeCard(pickWedgeCard()));
    }

    public void dealCards(ArrayList<WedgeCard> playerCards) { // Adds 5 wedge cards to a player's 'hand' (ArrayList of cards)
        for (int i = 0; i < 5; i++) {
            addToPlayerHand(playerCards);
        }
    }

    public static Random random() { // Returns a random number
        return new Random();
    }

    public static Scanner makeScanner() { // Makes a scanner
        Scanner scan = new Scanner(System.in);
        return scan;
    }

    static boolean bGameWon = false;

    public void turnOrder() { // Loops player turns until the game is won (bGame=true)
        while (!bGameWon){
            for (Player currentPlayer : players){
                playerTurn(currentPlayer);
            }
        }       
    }

    public void playerTurn(Player currentPlayer) { // Calls methods needed for a player's turn
        System.out.println("");
        System.out.println("It is now " + currentPlayer.getPlayerName() + "'s turn!");

        displayWedges(currentPlayer);
        displayHand(currentPlayer);
        
        GameCode.WedgeColor wedgecolor = playCard(currentPlayer);   // Return the wedge card that the player choose
        
        QuestionCard selectedCard = pickQuestionCard(wedgecolor, currentPlayer); // Returns a randomly generated question card
        
        System.out.println("Please enter your answer below:");
        String sPlayerAnswer = makeScanner().nextLine();

        if (checkAnswer(selectedCard,  sPlayerAnswer)){
            playerScore(currentPlayer, wedgecolor);
        } else{
            drawPile(currentPlayer);
        }
    }

    public void displayWedges(Player currentPlayer) { // Display wedges earned by a player
        System.out.println("You have earned " + currentPlayer.playerWedges.size() + " so far:");  
        for (GameCode.WedgeColor wedge : currentPlayer.getPlayerWedges()){
            System.out.println(wedge.toString());
        }
        System.out.println("");
    }

    public void displayHand(Player currentPlayer) { // Display wedge cards in a player's hand
        System.out.println("The wedge cards in your hand are:");  
        for (WedgeCard card : currentPlayer.getPlayerCards()){
            System.out.println(card.getColor());
        }
        System.out.println("");
    }

    public WedgeColor playCard(Player currentPlayer) {
        // Prompts the player to select a wedge card to play by typing the card color into the console
        // Removes the card from the player's hand
        System.out.println("Please enter the color of the card you wish to play:");
        WedgeColor wedgecolor = null;
        try { // Checks if the input value is valid
            wedgecolor = WedgeColor.valueOf(makeScanner().nextLine()); // Checks if the user has this color card in their hand
            boolean hasCard = false;
            int icount = 0;

            for (WedgeCard wedge : currentPlayer.playerCards){
                if (wedge.getCategory().equals(wedgecolor.toString())){
                    hasCard = true;
                    break;
                } 
            }

            if (!hasCard) { // If the player does not have this color card in their hand, the method is recalled
                System.out.println("You do not have this color wedge card in your hand.");
                return playCard(currentPlayer); 
            }
        } catch (Exception e) {
            System.out.println("You entered an invalid value.");
            return playCard(currentPlayer);
        }

        for (WedgeCard card : currentPlayer.playerCards){
            if (card.getCategory().equals(wedgecolor.toString())){
                currentPlayer.playerCards.remove(card);
                break;
            }
        }

        return wedgecolor;
    }

    public int randomIndex(ArrayList<QuestionsAnswers> QnA) { //generates random index for the arraylist  based on the arraylist size
        int randomIndex = random().nextInt(QnA.size());
        return randomIndex;
    }

    public QuestionCard pickQuestionCard(WedgeColor wedgecolor, Player currentPlayer) {// Creates a question card from the selected category
        GenerateQuestionPair pair = new GenerateQuestionPair();
        QuestionsAnswers qa = pair.getQAPair(wedgecolor);
        QuestionCard selectedCard = new QuestionCard(wedgecolor, qa);
        System.out.println(qa.getQuestion());
        return selectedCard;
    }

    public boolean checkAnswer(QuestionCard selectedCard, String sPlayerAnswer) {  // Checks if the answer inputted by the player matches the correct answer to the question
        //System.out.println("Please enter your answer below:"); //moved getting player answer to player turn so unit tets would work
        //String sPlayerAnswer = makeScanner().nextLine();
       
               
       for (String sAnswer: selectedCard.QA.getAnswer()){     
         //if (sPlayerAnswer.equalsIgnoreCase(selectedCard.QA.getAnswer())){
            if (sAnswer.equalsIgnoreCase(sPlayerAnswer)){
            System.out.println("");
            System.out.println("Correct!");
            System.out.println("");
            
            return true;
       }
       }        
      
            System.out.println("");
            System.out.println("Incorrect! The correct answer was: " + selectedCard.QA.getAnswer().get(0) );
            System.out.println("");
            return false;       
               
        
    }

    public void playerScore(Player currentPlayer, WedgeColor wedgecolor) { //Updates players score
        boolean match = false;
        int iCount = 0;

        while (!match && iCount < 6){  // Adds the wedge to the player's playerWedges if the question was answered correctly
            for (WedgeColor wedgesWon : currentPlayer.playerWedges){
               if (wedgecolor.equals(wedgesWon)){
                    match = true;   
                    drawPile(currentPlayer);
                }      
            }
            iCount++;
        }

        if (!match) { // Checks if players have collected six different wedges, calls endMenu() if true and sets bGameWon to true
            currentPlayer.playerWedges.add(wedgecolor);
            if (currentPlayer.playerWedges.size() == 6) {
                bGameWon = true;
                Menues.endMenue(currentPlayer); // Call endMenu when all six colors are collected.
            } else {
                drawPile(currentPlayer);
            }
        }
    }

    public void drawPile(Player currentPlayer) {  // Adds a randomly selected wedge card to the player's hand
        System.out.println("Drawing a wedge card from the draw pile to add to your hand.");
        WedgeCard wc = new WedgeCard(pickWedgeCard());
        currentPlayer.playerCards.add(wc);
        System.out.println("A " + wc.getColor()+ " was added to your cards");
    }
}
    
  


