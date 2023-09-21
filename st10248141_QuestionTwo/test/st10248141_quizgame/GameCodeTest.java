/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package st10248141_quizgame;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.junit.Test;
import static org.junit.Assert.*;
import static st10248141_quizgame.GameCode.makeScanner;

/**
 *
 * @author lab_services_student
 */
public class GameCodeTest {
    
    public GameCodeTest() {
    }

    @Test
    public void testAddPlayer() { //checks that playeris added to player arraylist
        boolean bSame = false;
       GameCode g = new GameCode(); 
       ArrayList<Player> playersR = new ArrayList<>();
        ArrayList<Player> playersExp = new ArrayList<>();
       ArrayList<GameCode.WedgeColor> playerWedges = new ArrayList<>();
        ArrayList<WedgeCard> playerCards = new ArrayList<>();  
       
       playersExp.add(new Player("Hannah", playerWedges, playerCards));
       

       Player newPlayer = new Player("Hannah", playerWedges, playerCards);
       
       g.addPlayer(newPlayer, playersR);
       
       
       if (playersExp.get(0).getPlayerName().equals(playersR.get(0).getPlayerName())  
            &&   playersExp.get(0).getPlayerWedges().equals(playersR.get(0).getPlayerWedges()) &&
                    playersExp.get(0).getPlayerCards().equals(playersR.get(0).getPlayerCards())
        ){
        bSame = true;
        }
       
       assertTrue(bSame); 

    }

    @Test
    public void testPickWedgeCard() { //checks that a random wedgecard is selected
       GameCode g = new GameCode(); 
       GameCode.WedgeColor pickWC =g.pickWedgeCard() ;
       
       Set<GameCode.WedgeColor>  colorSet = new HashSet<GameCode.WedgeColor>(); // https://www.geeksforgeeks.org/set-in-java/
        colorSet.add(GameCode.WedgeColor.Purple);
        colorSet.add(GameCode.WedgeColor.Blue);
        colorSet.add(GameCode.WedgeColor.Red);
        colorSet.add(GameCode.WedgeColor.Cyan);
        colorSet.add(GameCode.WedgeColor.Yellow);
       
       assertTrue(colorSet.contains(pickWC));
    }

    @Test
    public void testAddToPlayerHand() { //checks that new wedgecard is added to a players hand
       GameCode g = new GameCode();  
       ArrayList<WedgeCard> playerCards = new ArrayList<>();
       g.addToPlayerHand(playerCards);
       
       Set<String>  colorSet = new HashSet<String>(); // https://www.geeksforgeeks.org/set-in-java/
        colorSet.add("Purple");
        colorSet.add("Blue");
        colorSet.add("Red");
        colorSet.add("Cyan");
        colorSet.add("Yellow");
       
        boolean hasColor = false;
        
        for (WedgeCard card : playerCards) {
            if (colorSet.contains(card.getColor())) {
                hasColor = true;
                break;
            }
        }

        assertTrue(hasColor); 
    }

    @Test
    public void testDealCards() { // checks that player has six wedge cards added to their wedgecard arraylist
       GameCode g = new GameCode();  
       ArrayList<WedgeCard> playerCards = new ArrayList<>();
       g.dealCards(playerCards);
       
       Set<String>  colorSet = new HashSet<String>(); // https://www.geeksforgeeks.org/set-in-java/
        colorSet.add("Purple");
        colorSet.add("Blue");
        colorSet.add("Red");
        colorSet.add("Cyan");
        colorSet.add("Yellow");
       
       boolean bColorLength= false;
       boolean bLength= false;
        boolean bColor= false;
       
       if (playerCards.size()==5){
           bLength= true;
            for (WedgeCard card : playerCards) {
            if (colorSet.contains(card.getColor())) {
                bColor = true;
            } else{
              bColor = false;  
              break;
            }
            }
       } 
       
       if (bLength && bColor){
         bColorLength= true; 
       }
       
      
      assertTrue(bColorLength); 
    }


    @Test
    public void testTurnOrder() {
        
    }

    @Test
    public void testPlayerTurn() {
    }

    @Test
    public void testDisplayWedges() { //checks that te player is shown the wedges that they have earned
      GameCode g = new GameCode();  
        
       ArrayList<GameCode.WedgeColor> playerWedges = new ArrayList<>();
       playerWedges.add(GameCode.WedgeColor.Purple);
       playerWedges.add(GameCode.WedgeColor.Blue);
       playerWedges.add(GameCode.WedgeColor.Red);
       ArrayList<WedgeCard> playerCards = new ArrayList<>(); 
       
       Player newPlayer = new Player("Hannah", playerWedges, playerCards); 
       
       g.displayWedges(newPlayer);
       
      assertEquals(playerWedges, newPlayer.getPlayerWedges()); 
               
    }

    @Test
    public void testDisplayHand() { //checks that player is shown the cards that they have to play
        GameCode g = new GameCode();  
        
       ArrayList<GameCode.WedgeColor> playerWedges = new ArrayList<>();
       ArrayList<WedgeCard> playerCards = new ArrayList<>(); 
       playerCards.add(new WedgeCard(GameCode.WedgeColor.Purple));
       playerCards.add(new WedgeCard(GameCode.WedgeColor.Blue));
       playerCards.add(new WedgeCard(GameCode.WedgeColor.Red));
       
       Player newPlayer = new Player("Kelly", playerWedges, playerCards); 
       
       g.displayHand(newPlayer);
       
      assertEquals(playerCards, newPlayer.getPlayerCards());
    }

    @Test
    public void testPlayCard() {
    }

    @Test
    public void testRandomIndex() { //checks that method generates a random number within the given range
        
       GameCode g = new GameCode();   
        
       ArrayList<QuestionsAnswers> QnA = new ArrayList<>();
       QnA.add(new QuestionsAnswers("Q",  new ArrayList<String>() {{
            add("A");
        }}));
        QnA.add(new QuestionsAnswers("Q",  new ArrayList<String>() {{
            add("A");
        }}));
        QnA.add(new QuestionsAnswers("Q",  new ArrayList<String>() {{
            add("A");
        }}));
        QnA.add(new QuestionsAnswers("Q",  new ArrayList<String>() {{
            add("A");
        }}));
       
       int iRandom= g.randomIndex(QnA);
       boolean bRange= false;
       
      if (iRandom == QnA.size() || iRandom< QnA.size()){
          bRange=true;
      }

      assertTrue(bRange);   
    }

    @Test
    public void testPickQuestionCard() {  
        
        
        
    }

    @Test
    public void testCheckAnswerCorrect() { //checks if method correctly compaers the players answer and the answer in the object
      GameCode g = new GameCode();
      
      QuestionsAnswers QA = new QuestionsAnswers("Q",  new ArrayList<String>() {{
            add("A");
            add("B");
            add("C");
            }});
      QuestionCard selectedCard = new QuestionCard(GameCode.WedgeColor.Purple,QA);  

      assertTrue( g.checkAnswer(selectedCard, "C"));
        
    }
    
    
    @Test
    public void testCheckAnswerIncorrect() { //checks if method correctly compaers the players answer and the answer in the object 
      GameCode g = new GameCode();
      
      QuestionsAnswers QA = new QuestionsAnswers("Q",  new ArrayList<String>() {{
            add("A");
            add("B");
            add("C");
            }});
      QuestionCard selectedCard = new QuestionCard(GameCode.WedgeColor.Purple,QA);  

      assertFalse( g.checkAnswer(selectedCard, "D"));
        
    }

    @Test
    public void testPlayerScoreHasWedge() { //checks that wedge is not added to players score if they already have eanred that color wedge
      GameCode g = new GameCode();  
        
       ArrayList<GameCode.WedgeColor> playerWedges = new ArrayList<>();
       playerWedges.add(GameCode.WedgeColor.Purple);
       playerWedges.add(GameCode.WedgeColor.Blue);
       playerWedges.add(GameCode.WedgeColor.Red);
       ArrayList<WedgeCard> playerCards = new ArrayList<>(); 
       playerCards.add(new WedgeCard(GameCode.WedgeColor.Yellow));
       playerCards.add(new WedgeCard(GameCode.WedgeColor.Green));
       playerCards.add(new WedgeCard(GameCode.WedgeColor.Red));
       playerCards.add(new WedgeCard(GameCode.WedgeColor.Blue));
       playerCards.add(new WedgeCard(GameCode.WedgeColor.Red));
       
       ArrayList<GameCode.WedgeColor> expWedges = new ArrayList<>();
       expWedges.add(GameCode.WedgeColor.Purple);
       expWedges.add(GameCode.WedgeColor.Blue);
       expWedges.add(GameCode.WedgeColor.Red);
       
       
       
       Player newPlayer = new Player("Hannah", playerWedges, playerCards);
       
       g.playerScore(newPlayer, GameCode.WedgeColor.Red);
       
        assertEquals(expWedges, newPlayer.getPlayerWedges()); 
    }
    
    @Test
    public void testPlayerScoreDoesNotHaveWedge() { //checks that wedge card is added to score if player has not already earned that color wedge card
          GameCode g = new GameCode();  
        
       ArrayList<GameCode.WedgeColor> playerWedges = new ArrayList<>();
       playerWedges.add(GameCode.WedgeColor.Purple);
       playerWedges.add(GameCode.WedgeColor.Blue);
       playerWedges.add(GameCode.WedgeColor.Red);
       ArrayList<WedgeCard> playerCards = new ArrayList<>(); 
       playerCards.add(new WedgeCard(GameCode.WedgeColor.Yellow));
       playerCards.add(new WedgeCard(GameCode.WedgeColor.Green));
       playerCards.add(new WedgeCard(GameCode.WedgeColor.Red));
       playerCards.add(new WedgeCard(GameCode.WedgeColor.Blue));
       playerCards.add(new WedgeCard(GameCode.WedgeColor.Red));
       
       ArrayList<GameCode.WedgeColor> expWedges = new ArrayList<>();
       expWedges.add(GameCode.WedgeColor.Purple);
       expWedges.add(GameCode.WedgeColor.Blue);
       expWedges.add(GameCode.WedgeColor.Red);
       expWedges.add(GameCode.WedgeColor.Yellow);
       
       
       Player newPlayer = new Player("Hannah", playerWedges, playerCards);
       
       g.playerScore(newPlayer, GameCode.WedgeColor.Yellow);
       
        assertEquals(expWedges, newPlayer.getPlayerWedges()); 
    }

    @Test
    public void testDrawPile() { //Checks if 1 wedge card is being added to player cards
        GameCode g = new GameCode();  
        Set<String>  colorSet = new HashSet<String>(); // https://www.geeksforgeeks.org/set-in-java/
        colorSet.add("Purple");
        colorSet.add("Blue");
        colorSet.add("Pink");
        colorSet.add("Orange");
        colorSet.add("Yellow");
        
       ArrayList<GameCode.WedgeColor> playerWedges = new ArrayList<>();
       playerWedges.add(GameCode.WedgeColor.Purple);
       playerWedges.add(GameCode.WedgeColor.Blue);
       playerWedges.add(GameCode.WedgeColor.Red);
       ArrayList<WedgeCard> playerCards = new ArrayList<>(); 
       playerCards.add(new WedgeCard(GameCode.WedgeColor.Yellow));
       playerCards.add(new WedgeCard(GameCode.WedgeColor.Green));
       playerCards.add(new WedgeCard(GameCode.WedgeColor.Red));
       playerCards.add(new WedgeCard(GameCode.WedgeColor.Blue));
       
       
       Player newPlayer = new Player("Hannah", playerWedges, playerCards);
       
       g.drawPile(newPlayer);
       
       
       
       boolean bColorLength= false;
       
       int iSize = (playerCards.size()-1);
        
       
       if (playerCards.size()==5){
           bColorLength =true;
            }
       
       
      
      assertTrue(bColorLength);
       
       
        
    }
    
}
