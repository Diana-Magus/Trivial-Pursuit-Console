/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st10248141_quizgame;

import java.util.ArrayList;

/**
 *
 * @author lab_services_student
 */
public class Player {
   
        String PlayerName;  //name of player
        ArrayList<GameCode.WedgeColor> playerWedges = new ArrayList<>(); //stores wedges collected by player
        ArrayList<WedgeCard> playerCards = new ArrayList<>(); //stored wedge cards that the player has

        public Player(String sPlayerName, ArrayList<GameCode.WedgeColor> playerWedges, ArrayList<WedgeCard> playerCards) {
            this.PlayerName = sPlayerName;
            this.playerWedges = playerWedges;
            this.playerCards = playerCards;
        }
    
        public String getPlayerName(){
        return PlayerName;
        }
    
        public ArrayList<GameCode.WedgeColor> getPlayerWedges(){
            return playerWedges;
        }
    
        public ArrayList<WedgeCard> getPlayerCards(){
            return playerCards;
        }
        
        
}  
