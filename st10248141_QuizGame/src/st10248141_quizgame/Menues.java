/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st10248141_quizgame;

/**
 *
 * @author lab_services_student
 */
public class Menues {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_Purple = "\u001B[35m";
    public static final String ANSI_Blue = "\u001B[34m";
    public static final String ANSI_Pink = "\u001B[31m"; //red
    public static final String ANSI_Orange = "\u001B[33m"; //red
    public static final String ANSI_Yellow = "\u001B[33m";
    public static final String ANSI_Green = "\u001B[32m";
    
    
    public static void welcomeMessage(){
      System.out.println("Welcome to Trivial Pursuit!!!" );   
      mainMenu();
    }
    
    public static void mainMenu(){
     GameCode game = new GameCode(); // Create an instance of the GameCode class

    System.out.println("===========================================");
    System.out.println("To view the rules enter (1).\nTo start a new game enter (2).\nTo exit the game enter any other key.");
    String input = game.makeScanner().nextLine();

    switch (input) {
        case "1":
            printRules();
            break;

        case "2":
            game.addPlayer();
            break;
            
           
        default: 
            break;
          
    }    
     
    }
    
    public static void printRules(){
        System.out.println("===========================================");
        System.out.println("Trival Pursuit Netbeans Console Edition Rules:");
        System.out.println("At the start of the game each player will be dealt five wedgecards.");
        System.out.println("Wedge cards represent the following catagories:"
                + "\nPurple: Art and Literature" 
                + "\nBlue: Geography"
                + "\nPink: Entertainment"
                + "\nOrange: Sport and Leisure"
                + "\nYellow: History"
                + "\nGreen: Science and Nature");
        System.out.println("At the start of a player's turn they will select a wedgecard from their hand to play and will be asked a question related to the category of wedgecard that they chose. If the player answers the question correctly , the wedgecard is added to their score. If the player answers the question incorrectly the wedgecard is discarded.");
        System.out.println("At the end of a player's turn a new, randomly selected wedgecard will be added to the player's hand.");
        System.out.println("The first player to collect a wedgecard of each colour wins and the game ends.");
        mainMenu();
    }
    
    public static void endMenue(Player currentPlayer){
        //asks players if they want to start a new game or close the application
        System.out.println("");
        System.out.println(currentPlayer.getPlayerName()+ " is the winner!");
        System.out.println("");
        mainMenu();
    }
}
