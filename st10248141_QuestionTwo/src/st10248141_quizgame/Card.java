/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st10248141_quizgame;

/**
 *
 * @author lab_services_student
 */
public class Card {
    GameCode.WedgeColor Category;
        
    public Card(GameCode.WedgeColor category){
        this.Category=category;
    }
    
    public String getCategory(){
        return this.Category.toString();
    }
}
