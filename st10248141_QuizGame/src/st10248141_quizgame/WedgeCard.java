/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st10248141_quizgame;

/**
 *
 * @author lab_services_student
 */
public class WedgeCard extends Card {

    public WedgeCard(GameCode.WedgeColor category) {
        super(category);   
    }
    
    public String getColor(){
        return this.Category.toString();
    }
}
